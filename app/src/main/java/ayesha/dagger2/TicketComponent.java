package ayesha.dagger2;

import dagger.Component;

@Component(modules = {TicketModule.class})
public interface TicketComponent {
    void inject(MainActivity mainActivity);

    TicketRepository getTickets();
}
