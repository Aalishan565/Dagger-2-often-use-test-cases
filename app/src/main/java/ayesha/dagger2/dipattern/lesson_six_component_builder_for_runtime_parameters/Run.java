package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

public class Run {

    private String obj;

    public Run(String obj) {
        this.obj = obj;
    }

    String objRunning() {
        return obj;
    }
}
