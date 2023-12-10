package main.kernel.behavioral;

import main.kernel.generator.Visitor;
import main.kernel.structural.SIGNAL;
import main.kernel.structural.Sensor;

public class PinBased extends Transition{

    private Sensor[] sensors;
    private SIGNAL[] values;

    public Sensor[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensor sensor) {
        this.sensors = new Sensor[]{sensor};
    }

    public void addSensor(Sensor sensor) {
        if (this.sensors == null) {
            setSensors(sensor);
        } else if(this.sensors.length ==1) {
            this.sensors = new Sensor[]{this.sensors[0], sensor};
        } else {
            throw new IllegalArgumentException("Can't have more than two pins attached to a transition: ["
                    +this.sensors[0].getName()+", "+this.sensors[1].getName()+"]");
        }
    }

    public SIGNAL[] getValues() {
        return values;
    }

    public void setValues(SIGNAL value) {
        this.values = new SIGNAL[this.sensors.length];
        for(int i = 0; i < this.sensors.length; i++) {
            this.values[i] = value;
        }
    }

    @Override
    public int getType(){
        return 1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
