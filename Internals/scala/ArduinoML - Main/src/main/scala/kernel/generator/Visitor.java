package kernel.generator;

import kernel.behavioral.*;
import kernel.structural.*;
import kernel.App;

import java.util.HashMap;
import java.util.Map;

public abstract class Visitor<T> {

    public abstract void visit(App app);

    public abstract void visit(State state);
    public abstract void visit(Transition transition);
    public abstract void visit(TemporalTransition transition);

    public abstract void visit(Action action);

    public abstract void visit(Actuator actuator);
    public abstract void visit(Sensor sensor);


    /***********************
     ** Helper mechanisms **
     ***********************/

    protected Map<String,Object> context = new HashMap<>();

    protected T result;

    public T getResult() {
        return result;
    }

}
