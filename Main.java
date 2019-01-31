package carddeck;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Card c = deck.dealCard();
		Card c2 = deck.dealCard();
		Card c3 = deck.dealCard();
		Card c4 = deck.dealCard();
		Card c5 = deck.dealCard();
		
		Hand hand = new Hand();
		hand.addCard(c);
		hand.addCard(c2);
		hand.addCard(c3);
		hand.addCard(c4);
		hand.addCard(c5);
		
		System.out.println(hand);

	}

}
