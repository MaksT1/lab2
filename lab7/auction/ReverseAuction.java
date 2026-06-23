package lab7.auction;

import java.util.HashMap;
import java.util.Map;


public class ReverseAuction extends Auction {
    private double currentPrice;
    private final Map<String, Double> spentByLogin = new HashMap<>();

    public ReverseAuction(String name, String description, double startingPrice,
                          int durationInRounds, int minTrustPoints, User seller) {
        super(name, description, startingPrice, durationInRounds, minTrustPoints, seller);
        this.currentPrice = startingPrice;
    }


    @Override
    protected boolean doPlaceBid(User bidder, double amount) {
        if (currentPrice <= 0) return false;
        currentPrice -= 1;
        spentByLogin.merge(bidder.getLogin(), 1.0, Double::sum);
        bids.add(new Bid(bidder, currentPrice, currentRound));
        return true;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getSpentBy(User user) {
        return spentByLogin.getOrDefault(user.getLogin(), 0.0);
    }

    public boolean accept(User user) {
        if (finished) return false;
        finish(user);
        return true;
    }

    @Override
    protected void onRoundEnd() {
        if (currentRound >= durationInRounds) {
            finish(null);
        }
    }

    @Override
    public AuctionType getType() {
        return AuctionType.REVERSE;
    }
}
