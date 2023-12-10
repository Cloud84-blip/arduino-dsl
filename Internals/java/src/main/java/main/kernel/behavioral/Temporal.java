package main.kernel.behavioral;

import main.kernel.generator.Visitor;

public class Temporal extends Transition{

    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public int getType(){
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
