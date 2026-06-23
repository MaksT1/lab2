package lab7.flights;

import java.time.LocalDate;
import java.util.List;


public interface UATicketService {
    List<UATicketInfo> getTicketInfo(String from, String to, LocalDate when);
}
