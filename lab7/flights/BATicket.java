package lab7.flights;

import java.time.LocalDateTime;


public class BATicket {
    private final Airport from;
    private final Airport to;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;
    private final double ticketPrice;
    private final int stops;

    public BATicket(Airport from, Airport to, LocalDateTime departureTime,
                    LocalDateTime arrivalTime, double ticketPrice, int stops) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
        this.stops = stops;
    }

    public Airport getFrom() { return from; }
    public Airport getTo() { return to; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public double getTicketPrice() { return ticketPrice; }
    public int getStops() { return stops; }
}
