import java.util.ArrayList;

public class Pair extends HandRanker {
    public Pair(HandRanker nextRanker) {
        super("Pair", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 0; i < cards.size() - 1; i++) {
            if (cards.get(i).value == cards.get(i + 1).value) {
                this.winnerValues.add(cards.get(i).value);
                return true;
            }
        }
        return false;
    }
}
