import java.util.ArrayList;

public class ThreeOfAKind extends HandRanker {
    public ThreeOfAKind(HandRanker nextRanker) {
        super("Three Of The Kind", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 0; i < cards.size() - 2; i++) {
            if (cards.get(i).value == cards.get(i + 2).value) {
                this.winnerValues.add(cards.get(i).value);
                return true;
            }
        }
        return false;
    }

}
