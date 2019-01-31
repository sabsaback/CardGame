package carddeck;

public class Card {
	//suits in numbers
	public static final int SPADES = 0;
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;

	private final int value;
	private final int suit;
	
	public Card(int v, int s) { 
		value = v;
		suit = s;		
	}
	public int getValue() {
		return value;
	}
	public int getSuit() {
		return suit;
	}
	public String toString() {
		String returnValue = "";
		switch(value) {
		case 1: returnValue += "Ace";
		break;
		case 11: returnValue += "Jack";
		break;
		case 12: returnValue += "Queen";
		break;
		case 13: returnValue += "King";
		break;
		default: returnValue += value;
		}
		
		returnValue += " of ";
		
		switch(suit) {
		case SPADES: returnValue += "spades";
		break;
		case HEARTS: returnValue += "hearts";
		break;
		case DIAMONDS: returnValue += "diamonds";
		break;
		case CLUBS: returnValue += "clubs";
		break;
		}
		return returnValue;
		
	}
}
