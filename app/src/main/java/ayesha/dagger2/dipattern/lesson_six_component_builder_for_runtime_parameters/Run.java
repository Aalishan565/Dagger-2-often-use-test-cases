package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

public class Run {

    private String runner;

    public Run(String runner) {
        this.runner = runner;
    }

    String whoIsRunning() {
        return runner;
    }
}
