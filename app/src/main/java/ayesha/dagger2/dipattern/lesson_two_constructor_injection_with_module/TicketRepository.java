package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

// 3rd party class which is not open for modification
public class TicketRepository {

    public TicketRepository() {
    }

    public String getTickets() {
        return "Tickets are here";
    }

}
