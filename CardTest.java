package BlackJack;

public class CardTest {
    public static void main(String[] args) {

        //make a deck.
        Deck test = new Deck();
        //print every card in the deck - make sure all 52 are there.
        while(test.hasCards()){
            Card a = test.dealCard();
            System.out.println(a.toString());
        }
        //shuffle the deck, print them all again, make sure they are randomized.

    }
}