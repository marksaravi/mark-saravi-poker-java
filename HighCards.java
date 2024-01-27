import java.util.ArrayList;

public class HighCards extends HandRanker {
    public HighCards(HandRanker nextRanker) {
        super("High Cards", nextRanker);
    }

    @Override
    public boolean matchRank(ArrayList<Card> cards) {
        return true;
    }

}
