package lab7.auction;


public class SimpleAuction extends Auction {

    public SimpleAuction(String name, String description, double startingPrice,
                         int durationInRounds, int minTrustPoints, User seller) {
        super(name, description, startingPrice, durationInRounds, minTrustPoints, seller);
    }

    @Override
    protected boolean doPlaceBid(User bidder, double amount) {
        if (amount <= currentHighestAmount()) return false;
        bids.add(new Bid(bidder, amount, currentRound));
        return true;
    }

    @Override
    protected void onRoundEnd() {
        if (currentRound >= durationInRounds) {
            Bid best = highestBidInRound(currentRound);
            finish(best == null ? null : best.getBidder());
        }
    }

    @Override
    public AuctionType getType() {
        return AuctionType.SIMPLE;
    }
}
