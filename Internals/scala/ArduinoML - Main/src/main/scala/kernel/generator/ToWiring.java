package kernel.generator;

import kernel.App;
import kernel.behavioral.*;
import kernel.structural.*;

import java.util.List;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {
    enum PASS {ONE, TWO}
    private App appReference;


    public ToWiring() {
        this.result = new StringBuffer();
    }

    private void w(String s) {
        result.append(String.format("%s",s));
    }

    @Override
    public void visit(App app) {
        //first pass, create global vars
        this.appReference = app;
        context.put("pass", PASS.ONE);

        w("// Wiring code generated from an ArduinoML model\n");
        w(String.format("// Application name: %s\n", app.getName())+"\n");
        app.getBricks().forEach(brick -> {
            String brickType = brick instanceof Sensor ? "Sensor" : "Actuator";
            w(String.format("// %s is connected to pin %d \n", brick.getName(), brick.getPin()));
        });
        w("long debounce = 200;\n");

        // Special handling for TemporalAlarm scenario
        // Extracting delay from temporal transitions
        if (!app.getTemporalTransitions().isEmpty()) {
            for (TemporalTransition t : app.getTemporalTransitions()) {
                w(String.format("long %sDuration = %d;\n", t.getSourceState().getName(), t.getDelay()));
                w(String.format("unsigned long %sEntryTime = 0;\n", t.getSourceState().getName())); // Time when state was entered
            }
        }


        w("\nenum STATE {");
        String sep ="";
        for(State state: app.getStates()){
            w(sep);
            state.accept(this);
            sep=", ";
        }
        w("};\n");
        if (app.getInitial() != null) {
            w("STATE currentState = " + app.getInitial().getName()+";\n");
        }

        for(Brick brick: app.getBricks()){
            brick.accept(this);
        }

        //second pass, setup and loop
        context.put("pass",PASS.TWO);
        w("\nvoid setup(){\n");
        app.getBricks().forEach(brick -> {
            String pinType = brick instanceof Sensor ? "INPUT" : "OUTPUT";
            w(String.format("  pinMode(%d, %s); // %s\n", brick.getPin(), pinType, brick.getName()));
        });
        w("}\n");

        w("\nvoid loop() {\n" +
                "\tswitch(currentState){\n");
        for(State state: app.getStates()){
            state.accept(this);
        }
        w("\t}\n" +
                "}");
    }



    @Override
    public void visit(Actuator actuator) {
        if(context.get("pass") == PASS.ONE) {
            return;
        }
        if(context.get("pass") == PASS.TWO) {
            w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]\n", actuator.getPin(), actuator.getName()));
            return;
        }
    }


    @Override
    public void visit(Sensor sensor) {
        if(context.get("pass") == PASS.ONE) {
            w(String.format("\nboolean %sBounceGuard = false;\n", sensor.getName()));
            w(String.format("long %sLastDebounceTime = 0;\n", sensor.getName()));
            return;
        }
        if(context.get("pass") == PASS.TWO) {
            w(String.format("  pinMode(%d, INPUT);  // %s [Sensor]\n", sensor.getPin(), sensor.getName()));
            return;
        }
    }

    @Override
    public void visit(State state) {
        if(context.get("pass") == PASS.ONE){
            w(state.getName());
            return;
        }
        if (context.get("pass") == PASS.TWO) {
            w("\t\tcase " + state.getName() + ":\n");
            for (Action action : state.getActions()) {
                action.accept(this);
            }

            if (state.getTransition() != null) {
                state.getTransition().accept(this);
            }

            // Handling temporal transitions
            for (TemporalTransition t : appReference.getTemporalTransitions()) {
                if (t.getSourceState().equals(state)) {
                    String durationVar = t.getSourceState().getName() + "Duration";
                    String stateEntryTimeVar = t.getSourceState().getName() + "EntryTime";

                    w(String.format("\t\t\tif (currentState == %s && millis() - %s > %s) {\n",
                            state.getName(), stateEntryTimeVar, durationVar));
                    w(String.format("\t\t\t\tcurrentState = %s;\n", t.getNext().getName()));
                    w(String.format("\t\t\t\t%s = millis();\n", stateEntryTimeVar));
                    w("\t\t\t}\n");
                }
            }

            w("\t\t\tbreak;\n");
        }

    }
    @Override
    public void visit(TemporalTransition transition) {
        if(context.get("pass") == PASS.TWO) {
            String stateEntryTimeVar = transition.getSourceState().getName() + "EntryTime";
            w(String.format("\t\t\tif(millis() - %s > %d) {\n", stateEntryTimeVar, transition.getDelay()));
            w(String.format("\t\t\t\tcurrentState = %s;\n", transition.getNext().getName()));
            w("\t\t\t}\n");
        }
    }


    @Override
    public void visit(Transition transition) {
        if(context.get("pass") == PASS.TWO) {
            List<Condition> conditions = transition.getConditions();

            if (!conditions.isEmpty()) {
                StringBuilder conditionStatement = new StringBuilder();
                for (Condition cond : conditions) {
                    String sensorName = cond.getSensor().getName();
                    String sensorCondition = String.format("digitalRead(%d) == %s && millis() - %sLastDebounceTime > debounce",
                            cond.getSensor().getPin(),
                            cond.getSignal(),
                            sensorName);

                    if (conditionStatement.length() > 0) {
                        String logicalOperator = cond.isAndCondition() ? " && " : " || ";
                        conditionStatement.append(logicalOperator);
                    }
                    conditionStatement.append(sensorCondition);
                }

                // Generate the transition code with debouncing
                w(String.format("\t\t\tif(%s) {\n", conditionStatement.toString()));
                w(String.format("\t\t\t\t%sLastDebounceTime = millis();\n", conditions.get(0).getSensor().getName()));
                w(String.format("\t\t\t\tcurrentState = %s;\n", transition.getNext().getName()));
                w("\t\t\t}\n");
            }
        }
    }




    @Override
    public void visit(Action action) {
        if(context.get("pass") == PASS.ONE) {
            return;
        }
        if(context.get("pass") == PASS.TWO) {
            w(String.format("\t\t\tdigitalWrite(%d,%s);\n",action.getActuator().getPin(),action.getValue()));
            return;
        }
    }

}