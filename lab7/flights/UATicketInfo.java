package lab7.flights;

import java.time.LocalDateTime;

public class UATicketInfo {
    private final String from;
    private final String to;
    private final LocalDateTime dateTime;   // departure
    private final LocalDateTime arrival;
    private final double price;
    private final int stops;

    public UATicketInfo(String from, String to, LocalDateTime dateTime, LocalDateTime arrival, double price, int stops) {
        this.from = from;
        this.to = to;
        this.dateTime = dateTime;
        this.arrival = arrival;
        this.price = price;
        this.stops = stops;
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public LocalDateTime getDateTime() { return dateTime; }
    public LocalDateTime getArrival() { return arrival; }
    public double getPrice() { return price; }
    public int getStops() { return stops; }
}
