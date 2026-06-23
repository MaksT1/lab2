package lab7.auction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Auction {
    protected final String name;
    protected final String description;
    protected final double startingPrice;
    protected final int durationInRounds;
    protected final int minTrustPoints;
    protected final User seller;

    protected final List<Bid> bids = new ArrayList<>();
    protected int currentRound = 1;
    protected boolean finished = false;
    protected User winner;

    protected Auction(String name, String description, double startingPrice,
                      int durationInRounds, int minTrustPoints, User seller) {
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.durationInRounds = durationInRounds;
        this.minTrustPoints = minTrustPoints;
        this.seller = seller;
    }


    public final boolean placeBid(User bidder, double amount) {
        if (finished) return false;
        if (bidder.getLogin().equals(seller.getLogin())) return false;   // seller cannot bid
        if (bidder.getTrustPoints() < minTrustPoints) return false;      // not trusted enough
        return doPlaceBid(bidder, amount);
    }

    protected abstract boolean doPlaceBid(User bidder, double amount);


    public final void advanceRound() {
        if (finished) return;
        onRoundEnd();
        if (!finished) currentRound++;
    }

    protected abstract void onRoundEnd();

    protected void finish(User winner) {
        this.finished = true;
        this.winner = winner;
    }

    protected Bid highestBidInRound(int round) {
        return bids.stream()
                .filter(b -> b.getRound() == round)
                .max(Comparator.comparingDouble(Bid::getAmount))
                .orElse(null);
    }

    protected int lastRoundWithBids() {
        return bids.stream().mapToInt(Bid::getRound).max().orElse(-1);
    }

    protected double currentHighestAmount() {
        return bids.stream().mapToDouble(Bid::getAmount).max().orElse(startingPrice);
    }

    public boolean isFinished() { return finished; }
    public User getWinner() { return winner; }
    public User getSeller() { return seller; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getStartingPrice() { return startingPrice; }
    public int getDurationInRounds() { return durationInRounds; }
    public int getMinTrustPoints() { return minTrustPoints; }
    public int getCurrentRound() { return currentRound; }

    public abstract AuctionType getType();

    @Override
    public String toString() {
        String state = finished
                ? "FINISHED, winner: " + (winner == null ? "none" : winner.getLogin())
                : "ACTIVE, round " + currentRound + "/" + durationInRounds;
        return String.format("[%s] \"%s\" by @%s, start %.2f, minTrust %d - %s",
                getType(), name, seller.getLogin(), startingPrice, minTrustPoints, state);
    }
}
