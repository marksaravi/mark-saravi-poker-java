import java.util.ArrayList;

public class FullHouse extends HandRanker {
    public FullHouse(HandRanker nextRanker) {
        super("Full House", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        if (cards.get(0).value == cards.get(2).value && cards.get(3).value == cards.get(4).value) {
            this.winnerValues.add(cards.get(0).value);
            this.winnerValues.add(cards.get(4).value);
            return true;
        }
        if (cards.get(0).value == cards.get(1).value && cards.get(2).value == cards.get(4).value) {
            this.winnerValues.add(cards.get(0).value);
            this.winnerValues.add(cards.get(4).value);
            return true;
        }
        return false;
    }

}
