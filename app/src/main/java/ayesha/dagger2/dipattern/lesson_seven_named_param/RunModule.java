package ayesha.dagger2.dipattern.lesson_seven_named_param;

import javax.inject.Named;

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
    public Run provideRun(@Named("runner")String run, @Named("speed")String speed) {
        return new Run(run,speed);
    }
}
