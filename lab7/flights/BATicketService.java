package lab7.flights;

import java.time.LocalDate;
import java.util.List;


public interface BATicketService {
    List<BATicket> getTicketInfo(Airport from, Airport to, LocalDate when);
}
