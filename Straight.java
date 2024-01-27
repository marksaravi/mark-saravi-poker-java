import java.util.ArrayList;

public class Straight extends HandRanker {
    public Straight(HandRanker nextRanker) {
        super("Straight", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        for (int i = 1; i < 5; i++) {
            if (cards.get(i).value != cards.get(i - 1).value + 1) {
                return false;
            }
        }
        return true;
    }

}
