package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

import dagger.Module;
import dagger.Provides;

@Module
public class RunModule {

    private String obj;

    public RunModule(String run) {
        this.obj = run;
    }

    @Provides
    public Run provideRun() {
        return new Run(obj);
    }
}
