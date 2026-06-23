package lab7.flights;

import java.time.LocalDate;
import java.util.List;


public class FlightSearchApp {
    public static void main(String[] args) {
        TicketSearchEngine engine = new TicketSearchEngine();

        engine.registerAirline(new UAServiceAdapter(new MockUATicketService()));
        engine.registerAirline(new BAServiceAdapter(new MockBATicketService()));

        LocalDate when = LocalDate.of(2026, 7, 1);
        List<Ticket> tickets = engine.search("LAX", "WAW", when);

        System.out.println("-- LAX -> WAW on " + when + " --");
        tickets.forEach(System.out::println);

        System.out.println("\n-- Sorted by price -- ");
        engine.sort(tickets, TicketSearchEngine.BY_PRICE).forEach(System.out::println);

        System.out.println("\n-- Sorted by duration --");
        engine.sort(tickets, TicketSearchEngine.BY_DURATION).forEach(System.out::println);

        System.out.println("\n-- Only direct - sorted by price --");
        List<Ticket> direct = engine.filter(tickets, TicketSearchEngine.maxStops(0));
        engine.sort(direct, TicketSearchEngine.BY_PRICE).forEach(System.out::println);

    }
}
