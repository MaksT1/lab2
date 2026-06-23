package lab7.flights;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class BAServiceAdapter implements FlightTicketService {
    private static final String AIRLINE = "British Airways";

    private final BATicketService delegate;

    public BAServiceAdapter(BATicketService delegate) {
        this.delegate = delegate;
    }

    @Override
    public String airlineName() {
        return AIRLINE;
    }

    @Override
    public List<Ticket> search(String from, String to, LocalDate when) {
        List<Ticket> result = new ArrayList<>();
        Airport fromAirport = new Airport(from);
        Airport toAirport = new Airport(to);
        for (BATicket ticket : delegate.getTicketInfo(fromAirport, toAirport, when)) {
            result.add(new Ticket(
                    AIRLINE,
                    ticket.getFrom().getAirportCode(),
                    ticket.getTo().getAirportCode(),
                    ticket.getDepartureTime(),
                    ticket.getArrivalTime(),
                    ticket.getTicketPrice(),
                    ticket.getStops()));
        }
        return result;
    }
}
