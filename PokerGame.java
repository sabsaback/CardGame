package carddeck;

import java.util.ArrayList;

public class PokerGame extends Game{
	private ArrayList<Hand> listHand;
	
	public PokerGame() { //constructor
		listHand = new ArrayList<>();
	}
	
	@Override
	void initializeGame() {
		Deck deck = new Deck();
		deck.shuffle();
		
		for(int i = 1; i <= playersCount; i++) {
			Hand hand = new Hand();
			listHand.add(hand);
			for (int j = 0; j < 5; j++) {
				Card c = deck.dealCard();
				hand.addCard(c);	
			}
			hand.sortByValue();
		}
		players.add(h);
		
	}
	int getRank(ArrayList<Card> hand) {
		int rank = 0;
		return rank;
	}

	@Override
	void makePlay(int player) {
		Hand hand = players.get(player);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean endOfGame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void printWinner() {
		// TODO Auto-generated method stub
		
	}
	

}
