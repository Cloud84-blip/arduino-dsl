package chahan;

import chahan.ArduinoDSLParser;
import java.util.HashMap;
import java.util.Map;


public class CodeGenerator extends ArduinoDSLBaseVisitor<Void> {

    private StringBuilder setupCode = new StringBuilder();
    private StringBuilder loopCode = new StringBuilder();
    private StringBuilder definitionCode = new StringBuilder();
    private StringBuilder code = new StringBuilder();
    private int indentationLevel = 0;
    private Map<String, String> componentTypes = new HashMap<>(); // Pour stocker le type de chaque composant

    private void indent() {
        for (int i = 0; i < indentationLevel; i++) {
            code.append("  ");
        }
    }

    private void indentIn(StringBuilder sb) {
        for (int i = 0; i < indentationLevel; i++) {
            sb.append("  ");
        }
    }

    @Override
    public Void visitRoot(ArduinoDSLParser.RootContext ctx) {
        // Visite chaque partie dans l'ordre défini par la grammaire
        visitComponents(ctx.components());
        code.append(definitionCode.toString()); // Ajoute le code de définition
        visitStates(ctx.states()); // Ajoute le code des états
        code.append("void setup() {\n");
        indentationLevel++;
        code.append(setupCode.toString()); // Ajoute le code de setup
        indentationLevel--;
        code.append("}\n\nvoid loop() {\n");
        indentationLevel++;
        code.append(loopCode.toString()); // Ajoute le code de loop
        indentationLevel--;
        code.append("}\n");
        
        return null;
    }

    @Override
    public Void visitComponents(ArduinoDSLParser.ComponentsContext ctx) {
        // Visite chaque composant (alarme ou capteur
        for (ArduinoDSLParser.AlarmContext alarmCtx : ctx.alarm()) {
            visitAlarm(alarmCtx);
        }
        for (ArduinoDSLParser.SensorContext sensorCtx : ctx.sensor()) {
            visitSensor(sensorCtx);
        }
        return null;
    }

    @Override
    public Void visitAlarm(ArduinoDSLParser.AlarmContext ctx) {
        String alarmName = ctx.location().name.getText();
        definitionCode.append("int ").append(alarmName).append(";\n");
        visitLocation(ctx.location());
        indentationLevel++;
        indentIn(setupCode);
        setupCode.append("pinMode(").append(alarmName).append(", OUTPUT); // Initialisation de l'alarme\n");
        indentationLevel--;
        componentTypes.put(alarmName, "OUTPUT");
        return null;
    }

    public Void visitLocation(ArduinoDSLParser.LocationContext ctx){
        String name = ctx.name.getText();
        String pin = ctx.pin.getText();
        indentationLevel++;
        indentIn(setupCode);
        indentationLevel--;
        setupCode.append(name).append(" = ").append(pin).append(";\n");
        return null;
    }

    @Override
    public Void visitSensor(ArduinoDSLParser.SensorContext ctx) {
        String sensorName = ctx.location().name.getText();
        indentIn(definitionCode);
        definitionCode.append("int ").append(sensorName).append(";\n");
        visitLocation(ctx.location());
        indentationLevel++;
        indentIn(setupCode);
        indentationLevel--;
        setupCode.append("pinMode(").append(sensorName).append(", INPUT); // Initialisation du capteur\n");
        componentTypes.put(sensorName, "INPUT");
        // Ajoutez ici du code pour lire l'état du capteur dans loop() si nécessaire
        return null;
    }

    @Override
    public Void visitStates(ArduinoDSLParser.StatesContext ctx) {
        for (ArduinoDSLParser.StateContext stateCtx : ctx.state()) {
            visitState(stateCtx);
        }
        return null;
    }


    @Override
    public Void visitState(ArduinoDSLParser.StateContext ctx){
        indent();
        if (ctx.initial() != null) {
            System.out.println("Initial state");
            code.append("// Initial State\n");
            indentationLevel++;
            indentIn(loopCode);
            loopCode.append(ctx.stateName.getText()).append("();\n");
            indentationLevel--;
        }

        if(ctx.action() != null){
            code.append("void ").append(ctx.stateName.getText()).append("() {\n");
            indentationLevel++;
            for (ArduinoDSLParser.ActionContext actionCtx : ctx.action()) {
                visitAction(actionCtx);
            }
        }
        
        if(ctx.transition() != null){
            for (ArduinoDSLParser.TransitionContext transitionCtx : ctx.transition()) {
                visitTransition(transitionCtx);
            }
        } else {
            System.out.println("-----------No transition----------");
            System.out.println("Transition: " + ctx.transition());
        }
        // System.out.println("Trigger: " + ctx.transition().trigger.getText());
        // System.out.println("Value: " + ctx.transition().value.getText());
        // System.out.println("Next: " + ctx.transition().next.getText());
        //visitTransition(ctx.transition());
        
        indentationLevel--;
        indent();
        code.append("}\n\n");
        return null;
    }

    @Override
    public Void visitAction(ArduinoDSLParser.ActionContext ctx) {
        indent();
        code.append("digitalWrite(").append(ctx.receiver.getText()).append(", ").append(ctx.value.getText()).append(");\n");
        return null;
    }

    @Override
    public Void visitTransition(ArduinoDSLParser.TransitionContext ctx) {
        indent();
        code.append("if (");

        // Visite chaque condition dans la transition et les lie avec des opérateurs logiques
        for (int i = 0; i < ctx.conditions().condition().size(); i++) {
            ArduinoDSLParser.ConditionContext condCtx = ctx.conditions().condition(i);
            // String signal = (condCtx.value.getText().equals("HIGH")) ? "1" : "0";
            code.append("digitalRead(").append(condCtx.trigger.getText()).append(") == ").append(condCtx.value.getText());

            // Si il y a un opérateur logique après cette condition, l'ajouter
            if (i < ctx.conditions().condition().size() - 1) {
                String operator = (ctx.conditions().logicalOP(i).getText().equals("AND")) ? "&&" : "||";
                code.append(" ").append(operator).append(" ");
            }
        }

    code.append(") {\n");
    indentationLevel++;
    indent();
    code.append(ctx.next.getText()).append("();\n");
    indentationLevel--;
    indent();
    code.append("}\n");

    return null;
}

    public String getCode() {
        return code.toString();
    }
}
