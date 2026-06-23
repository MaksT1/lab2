package lab7.flights;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class UAServiceAdapter implements FlightTicketService {
    private static final String AIRLINE = "United Airlines";

    private final UATicketService delegate;

    public UAServiceAdapter(UATicketService delegate) {
        this.delegate = delegate;
    }

    @Override
    public String airlineName() {
        return AIRLINE;
    }

    @Override
    public List<Ticket> search(String from, String to, LocalDate when) {
        List<Ticket> result = new ArrayList<>();
        for (UATicketInfo info : delegate.getTicketInfo(from, to, when)) {
            result.add(new Ticket(
                    AIRLINE,
                    info.getFrom(),
                    info.getTo(),
                    info.getDateTime(),
                    info.getArrival(),
                    info.getPrice(),
                    info.getStops()));
        }
        return result;
    }
}
