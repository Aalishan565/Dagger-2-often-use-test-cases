package ayesha.dagger2.dipattern.lesson_seven_named_param;

import javax.inject.Inject;
import javax.inject.Named;

public class Run {

    private String obj;
    private String speed;


    public Run(@Named("runner")String obj, @Named("speed")String speed) {
        this.obj = obj;
        this.speed = speed;
    }

    String objRunning() {
        return obj + " " + speed;
    }
}
