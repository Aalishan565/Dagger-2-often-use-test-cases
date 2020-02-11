package ayesha.dagger2.dipattern.lesson_four_binds;

import dagger.Binds;
import dagger.Module;

@Module
public interface RealConnectionModule {

    @Binds
    Connection bindConnection(RealConnection realConnection);
}
