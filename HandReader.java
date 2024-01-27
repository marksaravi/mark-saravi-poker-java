import java.util.ArrayList;
import java.util.Scanner;

public class HandReader {
    private Scanner scanner;

    public HandReader() {
        scanner = new Scanner(System.in);
    }

    public boolean hasNextHand() {
        return scanner.hasNextLine();
    }

    public ArrayList<ArrayList<String>> getHands() throws Exception {
        String hands = scanner.nextLine();
        String[] cards = hands.split(" ", 10);
        if (cards.length != 10) {
            throw new Exception("needs 10 cards");
        }
        ArrayList<ArrayList<String>> playerHands = new ArrayList<ArrayList<String>>(2);
        for (int i = 0; i < 2; i++)
            playerHands.add(new ArrayList<String>(5));
        for (int i = 0; i < 10; i++) {
            playerHands.get(i / 5).add(cards[i]);
        }
        return playerHands;
    }

    public void close() {
        scanner.close();
    }
}
