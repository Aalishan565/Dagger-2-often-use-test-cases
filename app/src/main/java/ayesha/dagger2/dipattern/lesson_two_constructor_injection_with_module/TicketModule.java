package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

import dagger.Module;
import dagger.Provides;

@Module
public class TicketModule {

    @Provides
    public TicketRepository getTicketRepo() {
        return new TicketRepository();
    }
}
