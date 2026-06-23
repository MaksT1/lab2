package lab7.flights;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MockBATicketService implements BATicketService {
    private final Random random = new Random(2);

    @Override
    public List<BATicket> getTicketInfo(Airport from, Airport to, LocalDate when) {
        List<BATicket> tickets = new ArrayList<>();
        int count = 3 + random.nextInt(3);
        for (int i = 0; i < count; i++) {
            int depHour = 5 + random.nextInt(15);
            int stops = random.nextInt(3);
            int durationMinutes = 110 + stops * 100 + random.nextInt(130);
            LocalDateTime departure = LocalDateTime.of(when, LocalTime.of(depHour, 30));
            LocalDateTime arrival = departure.plusMinutes(durationMinutes);
            double price = 220 + stops * 55 + random.nextInt(450);
            tickets.add(new BATicket(from, to, departure, arrival, price, stops));
        }
        return tickets;
    }
}
