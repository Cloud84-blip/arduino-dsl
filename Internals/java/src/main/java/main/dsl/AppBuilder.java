package main.dsl;


import main.kernel.Root;
import main.kernel.behavioral.State;
import main.kernel.structural.Alarm;
import main.kernel.structural.Component;
import main.kernel.structural.Sensor;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppBuilder {

    Root theRoot = null;

    /*********************
     ** Creating an App **
     *********************/

    public static AppBuilder application(String name) {
        AppBuilder inst = new AppBuilder();
        inst.theRoot = new Root();
        inst.theRoot.setName(name);
        return inst;
    }

    public Root build() { return theRoot; }

    private AppBuilder() { }

    /**********************
     ** Declaring Bricks **
     **********************/

    public AppBuilder uses(Component b) {
        this.theRoot.getBricks().add(b);
        return this;
    }

    public static Component sensor(String name, int port) { return createBrick(Sensor.class, name, port);  }
    public static Component actuator(String name, int port) { return createBrick(Alarm.class, name, port);  }

    private static Component createBrick(Class< ? extends Component> kind, String name, int port) {
        try {
            Component b = kind.newInstance();
            if(name.isEmpty() || !Character.isLowerCase(name.charAt(0)))
                throw new IllegalArgumentException("Illegal brick name: ["+name+"]");
            b.setName(name);
            if(port < 1 || port > 12)
                throw new IllegalArgumentException("Illegal brick port: ["+port+"]");
            b.setPin(port);
            return b;
        } catch (InstantiationException | IllegalAccessException iae) {
            throw new IllegalArgumentException("Unable to instantiate " + kind.getCanonicalName());
        }
    }


    /**********************
     ** Declaring States **
     **********************/

    public StateBuilder hasForState(String name) { return new StateBuilder(this, name); }

    /*******************************
     ** Declaring TransitionTable **
     *******************************/

    public TransitionTableBuilder beginTransitionTable() {

        Map<String, State> stateTable =
                theRoot.getStates().stream().collect(Collectors.toMap(State::getName, Function.identity()));

        Map<String, Sensor> sensorTable =
                theRoot.getBricks().stream()
                        .filter(b -> b instanceof Sensor)
                        .map( b -> (Sensor) b)
                        .collect(Collectors.toMap(Component::getName, Function.identity()));

        return new TransitionTableBuilder(this, stateTable, sensorTable);
    }


    /***********************************************************************************
     ** Helpers to avoid a symbol table for Bricks (using the App under construction) **
     ***********************************************************************************/

    Optional<Alarm> findActuator(String name) {
        Optional<Component> b = theRoot.getBricks()
                .stream()
                    .filter( brick    -> brick instanceof Alarm)
                    .filter( actuator -> actuator.getName().equals(name))
                .findFirst();
        return b.map(sensor -> Optional.of((Alarm) sensor)).orElse(Optional.empty());
    }

}
