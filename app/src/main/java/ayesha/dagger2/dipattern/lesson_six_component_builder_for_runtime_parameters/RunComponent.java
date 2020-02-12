package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = RunModule.class)
public interface RunComponent {

    void inject(LessonSixActivity lessonSixActivity);

    @Component.Builder
    interface Builder {
        RunComponent build();

        @BindsInstance
        Builder setRunner(String runner);

    }
}
