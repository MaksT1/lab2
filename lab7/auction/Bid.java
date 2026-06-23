package lab7.auction;


public class Bid {
    private final User bidder;
    private final double amount;
    private final int round;

    public Bid(User bidder, double amount, int round) {
        this.bidder = bidder;
        this.amount = amount;
        this.round = round;
    }

    public User getBidder() { return bidder; }
    public double getAmount() { return amount; }
    public int getRound() { return round; }
}
