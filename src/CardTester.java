/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {

    public static void main(String[] args) {
        Card card1 = new Card("Ace", "Spades", 1);
        Card card2 = new Card("Three", "Clubs", 3);
        Card card3 = new Card("Ten", "Diamonds", 10);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println(card1.matches(card3));
        System.out.println(card1.matches(card2));
        System.out.println(card2.matches(card3));

    }

}
