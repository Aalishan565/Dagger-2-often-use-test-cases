package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

public class Run {

    private String obj;

    public Run(String obj) {
        this.obj = obj;
    }

    String objRunning() {
        return obj;
    }
}
