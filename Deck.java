package carddeck;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
	private List<Card> cards;  
	public Deck() { // constructor creates 52 cards
		cards = new LinkedList<>();
		for(int s = 0; s < 4; s++) { //creates suit
			for(int v = 1; v < 14; v++) { //creates value
				cards.add(new Card(v,s));
			}
		}
	}

	public void shuffle() { //shuffle cards
		Collections.shuffle(cards);
	}
	public Card dealCard(){ //deals card in index 0
		if (cards.size() == 0) {
			throw new IllegalArgumentException();
		}
		return cards.remove(0); //if there's no cards left
	}

	public int cardsLeft(){ //checks how many cards left
		return cards.size();
	}
}
