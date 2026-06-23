package lab7.auction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AuctionSystem {
    private final List<Auction> auctions = new ArrayList<>();
    private int currentRound = 1;

    public Auction createAuction(AuctionType type, String name, String description,
                                 double startingPrice, int durationInRounds,
                                 int minTrustPoints, User seller) {
        Auction auction = AuctionFactory.createAuction(type, name, description,
                startingPrice, durationInRounds, minTrustPoints, seller);
        auctions.add(auction);
        return auction;
    }

    public void nextRound() {
        currentRound++;
        for (Auction auction : auctions) {
            auction.advanceRound();
        }
    }

    public int getCurrentRound() {
        return currentRound;
    }


    public List<Auction> findActiveAuctions() {
        return auctions.stream()
                .filter(a -> !a.isFinished())
                .collect(Collectors.toList());
    }

    public List<Auction> findFinishedAuctions() {
        return auctions.stream()
                .filter(Auction::isFinished)
                .collect(Collectors.toList());
    }

    public List<Auction> findAuctionsBySeller(String login) {
        return auctions.stream()
                .filter(a -> a.getSeller().getLogin().equals(login))
                .collect(Collectors.toList());
    }

    public List<Auction> getAllAuctions() {
        return new ArrayList<>(auctions);
    }

    public void awardTrustPoint(User seller, User buyer) {
        requireDifferent(seller, buyer);
        buyer.addTrustPoint();
    }

    public void revokeTrustPoint(User seller, User buyer) {
        requireDifferent(seller, buyer);
        buyer.removeTrustPoint();
    }

    private void requireDifferent(User seller, User buyer) {
        if (seller.getLogin().equals(buyer.getLogin())) {
            throw new IllegalArgumentException("A seller cant rate themselves");
        }
    }
}
