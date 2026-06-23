package lab7.flights;

import java.time.LocalDate;
import java.util.List;


public interface FlightTicketService {
    String airlineName();

    List<Ticket> search(String from, String to, LocalDate when);
}
