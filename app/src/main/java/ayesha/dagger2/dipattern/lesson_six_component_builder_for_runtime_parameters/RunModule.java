package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

import dagger.Module;
import dagger.Provides;

@Module
public class RunModule {

   /* private String obj;

    public RunModule(String run) {
        this.obj = run;
    }

    @Provides
    public Run provideRun() {
        return new Run(obj);
    }*/

    @Provides
    public Run provideRun(String run) {
        return new Run(run);
    }
}
