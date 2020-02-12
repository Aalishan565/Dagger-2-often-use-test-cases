package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

import dagger.Module;
import dagger.Provides;

@Module
public class RunModule {

    @Provides
    public Run provideRun(String runner) {
        return new Run(runner);
    }
}
