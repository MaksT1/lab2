package lab7.auction;


public final class AuctionFactory {

    private AuctionFactory() {
    }

    public static Auction createAuction(AuctionType type, String name, String description,
                                        double startingPrice, int durationInRounds,
                                        int minTrustPoints, User seller) {
        switch (type) {
            case SIMPLE:
                return new SimpleAuction(name, description, startingPrice, durationInRounds, minTrustPoints, seller);
            case EXTENDED:
                return new ExtendedAuction(name, description, startingPrice, durationInRounds, minTrustPoints, seller);
            case REVERSE:
                return new ReverseAuction(name, description, startingPrice, durationInRounds, minTrustPoints, seller);
            default:
                throw new IllegalArgumentException("Unknown auction type: " + type);
        }
    }
}
