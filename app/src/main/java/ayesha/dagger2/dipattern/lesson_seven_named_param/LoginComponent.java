package ayesha.dagger2.dipattern.lesson_seven_named_param;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(LessonSevenActivity lessonSevenActivity);

    @Component.Builder
    interface Builder {
        LoginComponent build();

        @BindsInstance
        Builder setUserName(@Named("username") String username);

        @BindsInstance
        Builder setPassword(@Named("password") String password);

    }
}
