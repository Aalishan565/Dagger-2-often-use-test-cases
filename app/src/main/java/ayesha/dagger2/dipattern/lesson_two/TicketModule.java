package ayesha.dagger2.dipattern.lesson_two;

import dagger.Module;
import dagger.Provides;

@Module
public class TicketModule {

    @Provides
    public TicketRepository getTicketRepo() {
        return new TicketRepository();
    }
}
