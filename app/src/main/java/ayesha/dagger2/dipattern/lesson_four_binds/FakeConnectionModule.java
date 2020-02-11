package ayesha.dagger2.dipattern.lesson_four_binds;

import dagger.Module;
import dagger.Provides;

@Module
public class FakeConnectionModule {

    @Provides
    Connection provideConnection(FakeConnection fakeConnection) {
        return fakeConnection;
    }
}

