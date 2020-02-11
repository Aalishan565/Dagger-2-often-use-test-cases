package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import javax.inject.Inject;

public class Car {

    public Engine engine;

    public Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public String run(){
        return "car is running with the help of engine and wheel";
    }
}
