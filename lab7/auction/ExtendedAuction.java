package lab7.auction;

public class ExtendedAuction extends Auction {

    public ExtendedAuction(String name, String description, double startingPrice,
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
        boolean bidThisRound = bids.stream().anyMatch(b -> b.getRound() == currentRound);
        if (currentRound >= durationInRounds && !bidThisRound) {
            int last = lastRoundWithBids();
            Bid best = last < 0 ? null : highestBidInRound(last);
            finish(best == null ? null : best.getBidder());
        }
    }

    @Override
    public AuctionType getType() {
        return AuctionType.EXTENDED;
    }
}
