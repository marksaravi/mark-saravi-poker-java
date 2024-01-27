import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    public static int NUM_OF_CARDS = 5;
    public String name;
    public int rank;
    public ArrayList<Card> cards;
    public ArrayList<Integer> winnerValues;

    public Hand(ArrayList<String> cards) throws Exception {
        if (cards == null || cards.size() != NUM_OF_CARDS) {
            throw new Exception("not enough cards...");
        }
        this.cards = new ArrayList<Card>();
        for (String card : cards) {
            this.cards.add(new Card(card));
        }
        Collections.sort(this.cards, Comparator.comparing(Card::value));
        this.rank = 0;
        this.name = "";
    }

    public void print() {
        System.out.print("[");
        for (Card card : this.cards) {
            card.print();
            System.out.print(" ");
        }
        System.out.print("]");
    }

    @Override
    public int compareTo(Hand other) {
        if (this.rank != other.rank) {
            return this.rank > other.rank ? 1 : -1;
        }
        for (int i = this.winnerValues.size() - 1; i >= 0; i--) {
            if (this.winnerValues.get(i) != other.winnerValues.get(i)) {
                return this.winnerValues.get(i) > other.winnerValues.get(i) ? 1 : -1;
            }
        }
        for (int i = this.cards.size() - 1; i >= 0; i--) {
            if (this.cards.get(i).value != other.cards.get(i).value) {
                return this.cards.get(i).value > other.cards.get(i).value ? 1 : -1;
            }
        }
        return 0;
    }
}
