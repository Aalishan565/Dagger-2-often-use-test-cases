package ayesha.dagger2.dipattern.lesson_seven_named_param;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public Login provideLogin(@Named("username") String username, @Named("password") String password) {
        return new Login(username, password);
    }
}
