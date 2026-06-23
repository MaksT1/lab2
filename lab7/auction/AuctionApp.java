package lab7.auction;


public class AuctionApp {
    public static void main(String[] args) {
        AuctionSystem system = new AuctionSystem();

        User alice = new User("Alice", "Nowak", "alice", "alice@mail.com", 5);
        User bob = new User("Bob", "Kowalski", "bob", "bob@mail.com", 3);
        User carol = new User("Carol", "Wisniewska", "carol", "carol@mail.com", 1);

        System.out.println("-- SIMPLE auction --");
        Auction simple = system.createAuction(AuctionType.SIMPLE,
                "dasas1", "addsaahb njsgnjas", 100, 2, 2, alice);
        System.out.println("carol (trust 1) bids 120: " + simple.placeBid(carol, 120)
                + "  <- rejected, not enough trust");
        System.out.println("bob bids 120: " + simple.placeBid(bob, 120));
        system.nextRound();
        System.out.println("bob bids 150 (last round): " + simple.placeBid(bob, 150));
        system.nextRound();
        System.out.println("Winner: " + (simple.getWinner() == null ? "none" : simple.getWinner().getLogin()));

        System.out.println("\n-- EXTENDED auction --");
        AuctionSystem extSystem = new AuctionSystem();
        Auction extended = extSystem.createAuction(AuctionType.EXTENDED,
                "t shirt", "cool one", 50, 1, 0, alice);
        extended.placeBid(bob, 60);
        extSystem.nextRound();
        extended.placeBid(carol, 70);
        extSystem.nextRound();
        extended.placeBid(bob, 80);
        extSystem.nextRound();
        System.out.println("Active after activity? " + !extended.isFinished());
        extSystem.nextRound();
        System.out.println("Winner: " + (extended.getWinner() == null ? "none" : extended.getWinner().getLogin()));

        System.out.println("\n-- REVERSE auction --");
        AuctionSystem revSystem = new AuctionSystem();
        ReverseAuction reverse = (ReverseAuction) revSystem.createAuction(AuctionType.REVERSE,
                "ticket", "nba finals game", 200, 10, 0, alice);
        reverse.placeBid(bob, 0);
        System.out.println("After bob's bid price is: " + reverse.getCurrentPrice());
        reverse.placeBid(bob, 0);
        System.out.println("After another bid price is: " + reverse.getCurrentPrice()
                + " (bob spent " + reverse.getSpentBy(bob) + ")");
        reverse.accept(bob);
        System.out.println("bob accepts. Winner: " + reverse.getWinner().getLogin()
                + " at price " + reverse.getCurrentPrice());

        System.out.println("\n-- System queries --");
        System.out.println("Active auctions: " + system.findActiveAuctions().size());
        System.out.println("Finished auctions: " + system.findFinishedAuctions().size());
        System.out.println("Auctions by @alice: " + system.findAuctionsBySeller("alice").size());

        System.out.println("\n-- Trust points --");
        System.out.println("bob trust before: " + bob.getTrustPoints());
        system.awardTrustPoint(alice, bob);
        System.out.println("bob trust after award: " + bob.getTrustPoints());
        system.revokeTrustPoint(alice, bob);
        System.out.println("bob trust after revoke: " + bob.getTrustPoints());
    }
}
