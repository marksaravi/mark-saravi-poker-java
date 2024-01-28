import java.util.ArrayList;

class App {
    HandRanker handrankers;

    public App() {
        HandRanker highCards = new HighCards(null);
        HandRanker pair = new Pair(highCards);
        HandRanker twoPairs = new TwoPairs(pair);
        HandRanker threeofthekind = new ThreeOfAKind(twoPairs);
        HandRanker straight = new Straight(threeofthekind);
        HandRanker flush = new Flush(straight);
        HandRanker fullHouse = new FullHouse(flush);
        HandRanker fourOfAKind = new FourOfAKind(fullHouse);
        HandRanker straightFlush = new StraightFlush(fourOfAKind);
        HandRanker royalFlush = new RoyalFlush(straightFlush);
        this.handrankers = royalFlush;
    }

    public void Play() {
        HandReader reader = new HandReader();
        int score1 = 0, score2 = 0;
        while (reader.hasNextHand()) {
            try {
                ArrayList<ArrayList<String>> hands = reader.getHands();
                Hand player1 = new Hand(hands.get(0));
                this.handrankers.rankHand(player1);
                Hand player2 = new Hand(hands.get(1));
                this.handrankers.rankHand(player2);
                int winner = player1.compareTo(player2);
                if (winner == 0) {
                    throw new Exception("hands can't have same rank");
                }
                if (winner > 0)
                    score1++;
                else
                    score2++;

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }

        }
        System.out.printf("player 1: %d\n", score1);
        System.out.printf("player 2: %d\n", score2);
        reader.close();
    }

    public static void main(String args[]) {
        App app = new App();
        app.Play();
    }
}
