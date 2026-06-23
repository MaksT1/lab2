package lab7.flights;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TicketSearchEngine {
    private final List<FlightTicketService> services = new ArrayList<>();

    public void registerAirline(FlightTicketService service) {
        services.add(service);
    }

    public List<Ticket> search(String from, String to, LocalDate when) {
        List<Ticket> all = new ArrayList<>();
        for (FlightTicketService service : services) {
            all.addAll(service.search(from, to, when));
        }
        return all;
    }

    public static final Comparator<Ticket> BY_PRICE =
            Comparator.comparingDouble(Ticket::getPrice);
    public static final Comparator<Ticket> BY_STOPS =
            Comparator.comparingInt(Ticket::getStops);
    public static final Comparator<Ticket> BY_DURATION =
            Comparator.comparingLong(Ticket::getDurationMinutes);

    public List<Ticket> sort(List<Ticket> tickets, Comparator<Ticket> comparator) {
        List<Ticket> copy = new ArrayList<>(tickets);
        copy.sort(comparator);
        return copy;
    }

    public List<Ticket> filter(List<Ticket> tickets, Predicate<Ticket> predicate) {
        return tickets.stream().filter(predicate).collect(Collectors.toList());
    }

    public static Predicate<Ticket> maxPrice(double max) {
        return t -> t.getPrice() <= max;
    }

    public static Predicate<Ticket> maxStops(int max) {
        return t -> t.getStops() <= max;
    }

    public static Predicate<Ticket> maxDurationMinutes(long max) {
        return t -> t.getDurationMinutes() <= max;
    }
}
