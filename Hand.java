package carddeck;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hand {
	private List<Card> handOfCards;
	
	public Hand() { //constructor
		handOfCards = new LinkedList<>();
	}
	
	public void addCard(Card c){
		if (c == null) {
			throw new NullPointerException("No card");
		}handOfCards.add(c);
	}
	public void removeCard(Card c){
		if (c == null) {
			throw new NullPointerException("No card");
		}handOfCards.remove(c);
	}
	public void removeCard(int index) {
		if (index < 0 || index >= getCardCount()) {
			throw new IllegalArgumentException("Out of bounds");
		} handOfCards.remove(index);
	}
	public int getCardCount(){
		return handOfCards.size();
	}
	public String toString() {
		StringBuffer buf = new StringBuffer();
		Iterator <Card> it = handOfCards.iterator();
		while (it.hasNext()) {
			Card c = it.next();
			buf.append(c + "\n");
		}
		return buf.toString();
	}
	public void sortByValue(){
		LinkedList<Card> temp = new LinkedList<>();
		
		while(handOfCards.size() > 0) {
			int minIndex = 1000;
			int minValue = 1000;
			
			for(int i = 0; i < handOfCards.size(); i++) { 
				Card c = handOfCards.get(i);
				if (c.getValue()< minValue) {
					minValue = c.getValue();
					minIndex = i;
				}
			}
		
		
		}
		handOfCards = temp;
	}
	public getHandAsString() {
		
	}
	
	
	
	/*sortBySuit(){
		
	}*/

}
