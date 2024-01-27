import java.util.ArrayList;

public class StraightFlush extends HandRanker {
    public StraightFlush(HandRanker nextRanker) {
        super("Straight Flush", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 1; i < 5; i++) {
            if (cards.get(i).value != cards.get(i - 1).value + 1 || cards.get(i).suit != cards.get(0).suit) {
                return false;
            }
        }
        return true;
    }

}
