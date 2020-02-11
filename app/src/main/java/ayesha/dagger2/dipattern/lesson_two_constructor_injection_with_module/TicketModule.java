package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

import dagger.Module;
import dagger.Provides;

//Create a class which is responsible of getting the obj creation of Ticket Repo or 3rd party
@Module
public class TicketModule {

    // Create a provide method which will give the instance of Ticket repo
    @Provides
    public static TicketRepository getTicketRepo() {
        return new TicketRepository();
    }
}
