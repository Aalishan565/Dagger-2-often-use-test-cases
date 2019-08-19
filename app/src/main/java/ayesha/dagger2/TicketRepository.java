package ayesha.dagger2;

import javax.inject.Inject;

public class TicketRepository {
    @Inject
    public TicketRepository() {
    }

    public String getTickets() {
        return "Tickets are here";
    }

}
