package lab7.flights;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MockUATicketService implements UATicketService {
    private final Random random = new Random(1);

    @Override
    public List<UATicketInfo> getTicketInfo(String from, String to, LocalDate when) {
        List<UATicketInfo> tickets = new ArrayList<>();
        int count = 3 + random.nextInt(3);
        for (int i = 0; i < count; i++) {
            int depHour = 6 + random.nextInt(14);
            int stops = random.nextInt(3);
            int durationMinutes = 120 + stops * 90 + random.nextInt(120);
            LocalDateTime departure = LocalDateTime.of(when, java.time.LocalTime.of(depHour, 0));
            LocalDateTime arrival = departure.plusMinutes(durationMinutes);
            double price = 250 + stops * 40 + random.nextInt(400);
            tickets.add(new UATicketInfo(from, to, departure, arrival, price, stops));
        }
        return tickets;
    }
}
