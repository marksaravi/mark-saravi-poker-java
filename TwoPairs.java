import java.util.ArrayList;

public class TwoPairs extends HandRanker {
    public TwoPairs(HandRanker nextRanker) {
        super("Two Pairs", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        int prevValue = -1;
        for (int i = 1; i < cards.size(); i++) {
            if (cards.get(i).value == cards.get(i - 1).value && cards.get(i).value != prevValue) {
                this.winnerValues.add(cards.get(i).value);
                if (this.winnerValues.size() == 2) {
                    return true;
                }
                prevValue = cards.get(i).value;
            }
        }

        return false;
    }

}
