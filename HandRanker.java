import java.util.ArrayList;

/*
 * Chain of Responsibility Pattern to set the rank of the cards
 */
public abstract class HandRanker {
    public final int rank;
    public final String name;
    public ArrayList<Integer> winnerValues;
    private HandRanker nextHandRanker;

    public HandRanker(String name, HandRanker nextRanker) {
        this.nextHandRanker = nextRanker;
        if (nextRanker == null) {
            this.rank = 1;
        } else
            this.rank = nextRanker.rank + 1;
        this.name = name;
    }

    public void rankHand(Hand hand) {
        this.winnerValues = new ArrayList<Integer>();
        if (this.matchRank(hand.cards)) {
            hand.rank = this.rank;
            hand.name = this.name;
            hand.winnerValues = new ArrayList<Integer>();
            for (Integer value : this.winnerValues) {
                hand.winnerValues.add(value);
            }
        } else if (this.nextHandRanker != null) {
            this.nextHandRanker.rankHand(hand);
        }
    }

    protected abstract boolean matchRank(ArrayList<Card> cards);

}
