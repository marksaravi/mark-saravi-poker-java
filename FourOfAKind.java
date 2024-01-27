import java.util.ArrayList;

public class FourOfAKind extends HandRanker {
    public FourOfAKind(HandRanker nextRanker) {
        super("Four Of The Kind", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 0; i < cards.size() - 3; i++) {
            if (cards.get(i).value == cards.get(i + 3).value) {
                this.winnerValues.add(cards.get(i).value);
                return true;
            }
        }
        return false;
    }

}
