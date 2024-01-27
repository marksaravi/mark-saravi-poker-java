import java.util.ArrayList;

public class RoyalFlush extends HandRanker {
    public RoyalFlush(HandRanker nextRanker) {
        super("Royal Flush", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        if (cards.get(0).value != 10 ||
                cards.get(1).value != 11 ||
                cards.get(2).value != 12 ||
                cards.get(3).value != 13 ||
                cards.get(4).value != 14) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (cards.get(i).suit != cards.get(0).suit) {
                return false;
            }
        }
        return true;
    }

}
