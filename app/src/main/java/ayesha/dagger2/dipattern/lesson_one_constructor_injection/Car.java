package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import javax.inject.Inject;

public class Car {

    // Separate class need to make car functional
    public Engine engine;

    // Separate class need to make car functional
    public Wheels wheels;

    // Need to tell dagger I want to inject this constructor of Car class
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    //Method to confirm car is running
    public String run() {
        return "car is running with the help of engine and wheel";
    }
}
