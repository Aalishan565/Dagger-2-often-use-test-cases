package ayesha.dagger2.dipattern.lesson_seven_named_param;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = RunModule.class)
public interface RunComponent {

    void inject(NamedParamsActivity namedParamsActivity);

    @Component.Builder
    interface Builder {
        RunComponent build();

        @BindsInstance
        Builder setRunner(@Named("runner") String runner);

        @BindsInstance
        Builder setSpeed(@Named("speed") String speed);

    }
}
