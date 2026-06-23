package lab7.flights;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Ticket {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private final String airline;
    private final String from;
    private final String to;
    private final LocalDateTime departure;
    private final LocalDateTime arrival;
    private final double price;
    private final int stops;

    public Ticket(String airline, String from, String to, LocalDateTime departure,
                  LocalDateTime arrival, double price, int stops) {
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.stops = stops;
    }

    public String getAirline() { return airline; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public LocalDateTime getDeparture() { return departure; }
    public LocalDateTime getArrival() { return arrival; }
    public double getPrice() { return price; }
    public int getStops() { return stops; }


    public Duration getDuration() {
        return Duration.between(departure, arrival);
    }

    public long getDurationMinutes() {
        return getDuration().toMinutes();
    }

    @Override
    public String toString() {
        long minutes = getDurationMinutes();
        return String.format("%-16s %s -> %s | dep %s | %dh%02dm | stops: %d | %.2f PLN",
                airline, from, to, departure.format(FMT),
                minutes / 60, minutes % 60, stops, price);
    }
}
