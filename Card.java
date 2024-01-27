public class Card {
    public final String name;
    public final int value;
    public final char suit;

    public Card(String card) throws Exception {
        this.name = card;
        if (card.length() != 2) {
            throw new Exception("card " + card + " is undefined");
        }
        if (!(card.charAt(0) >= '2' && card.charAt(0) <= '9' ||
                card.charAt(0) == 'T' ||
                card.charAt(0) == 'J' ||
                card.charAt(0) == 'Q' ||
                card.charAt(0) == 'K' ||
                card.charAt(0) == 'A')) {
            throw new Exception("card " + card + " is undefined");
        }
        if (card.charAt(1) != 'D' &&
                card.charAt(1) != 'S' &&
                card.charAt(1) != 'H' &&
                card.charAt(1) != 'C') {
            throw new Exception("card " + card + " is undefined");
        }
        int value = 0;
        switch (card.charAt(0)) {
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                value = (int) card.charAt(0) - (int) '0';
                break;
            case 'T':
                value = 10;
                break;
            case 'J':
                value = 11;
                break;
            case 'Q':
                value = 12;
                break;
            case 'K':
                value = 13;
                break;
            case 'A':
                value = 14;
                break;
        }
        this.value = value;
        this.suit = card.charAt(1);
    }

    public int value() {
        return this.value;
    }

    public void print() {
        if (this.value < 10) {
            System.out.print((char) ((int) '0' + this.value));
        } else if (this.value == 10) {
            System.out.print('T');
        } else if (this.value == 11) {
            System.out.print('J');
        } else if (this.value == 12) {
            System.out.print('Q');
        } else if (this.value == 13) {
            System.out.print('K');
        } else if (this.value == 14) {
            System.out.print('A');
        }
        System.out.print(this.suit);
    }
}
