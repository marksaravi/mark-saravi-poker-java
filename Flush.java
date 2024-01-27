import java.util.ArrayList;

public class Flush extends HandRanker {
    public Flush(HandRanker nextRanker) {
        super("Flush", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).suit != cards.get(0).suit) {
                return false;
            }
        }
        return true;
    }

}
