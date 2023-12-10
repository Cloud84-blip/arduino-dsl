package main;

import main.kernel.Root;
import main.kernel.generator.ToWiring;
import main.kernel.generator.Visitor;

import static main.dsl.AppBuilder.*;

public class Main {


    public static void main (String[] args) {

        //Root myRoot = BasicScenario1();
        //Root myRoot = BasicScenario2();
        //Root myRoot = BasicScenario3();
        Root myRoot = BasicScenario4();
        //Root myRoot = ScenarioTemporalTransition();

        Visitor codeGenerator = new ToWiring();
        myRoot.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
    }

    private static Root BasicScenario1(){
        return application("BasicScenario1")
                .uses(sensor("button", 9))
                .uses(actuator("led", 11))
                .uses(actuator("buzzer", 12))
                .hasForState("on")
                .setting("led").toHigh()
                .setting("buzzer").toHigh()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .setting("buzzer").toLow()
                .endState()
                .beginTransitionTable()
                .from("on").when("button").isHigh().goTo("off")
                .from("off").when("button").isHigh().goTo("on")
                .endTransitionTable()
                .build();
    }

    private static Root BasicScenario2(){
        return application("BasicScenario2")
                .uses(sensor("button1", 8))
                .uses(sensor("button2", 9))
                .uses(actuator("led", 12))
                .hasForState("on")
                .setting("led").toHigh()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .endState()
                .beginTransitionTable()
                .from("on").when("button1").and("button2").isHigh().goTo("off")
                .from("off").when("button1").and("button2").isHigh().goTo("on")
                .endTransitionTable()
                .build();
    }

    private static Root BasicScenario3(){
        return application("BasicScenario3")
                .uses(sensor("button", 9))
                .uses(actuator("led", 11))
                .uses(actuator("buzzer", 12))
                .hasForState("on")
                .setting("led").toHigh()
                .setting("buzzer").toHigh()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .setting("buzzer").toLow()
                .endState()
                .beginTransitionTable()
                .from("on").when("button").isHigh().goTo("off")
                .from("off").when("button").isHigh().goTo("on")
                .endTransitionTable()
                .build();
    }

    private static Root BasicScenario4(){
        return application("BasicScenario4")
                .uses(sensor("button", 9))
                .uses(actuator("led", 11))
                .uses(actuator("buzzer", 12))
                .hasForState("buz_on")
                .setting("led").toLow()
                .setting("buzzer").toHigh()
                .endState()
                .hasForState("led_on")
                .setting("led").toHigh()
                .setting("buzzer").toLow()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .setting("buzzer").toLow()
                .endState()
                .beginTransitionTable()
                .from("led_on").when("button").isHigh().goTo("off")
                .from("off").when("button").isHigh().goTo("buz_on")
                .from("buz_on").when("button").isHigh().goTo("led_on")
                .endTransitionTable()
                .build();
    }

    private static Root ScenarioTemporalTransition(){
        return application("ScenarioTemporalTransition")
                .uses(sensor("button", 9))
                .uses(actuator("led", 11))
                .hasForState("on")
                .setting("led").toHigh()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .endState()
                .beginTransitionTable()
                .from("on").whenTime(1000).goTo("off")
                .from("off").when("button").isHigh().goTo("on")
                .endTransitionTable()
                .build();
    }

}
