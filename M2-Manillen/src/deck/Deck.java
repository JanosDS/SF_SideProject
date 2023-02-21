package deck;

import deck.card.Card;
import deck.card.Suit;
import deck.card.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	ArrayList<Card> cards = new ArrayList<>();

	public Deck() {}

	public Deck(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public boolean contains(Card card) {
		if (cards.contains(card)) {
			return true;
		}
		return false;
	}

	public int getAmountOfCards() {
		return cards.size();
	}

	public Card getTopCard(){
		return cards.remove(0);
	}
	public void shuffleDeck(){
		long seed = System.nanoTime();
		Collections.shuffle(cards, new Random(seed));
	}
	public void fillDeck() {
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				Card newCard = new Card(value, suit);
				if (!contains(newCard)) {
					cards.add(newCard);
				}
			}
		}
	}

	public void addCard(Card card){
		cards.add(card);
	}
	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("Deck: ");
		for (Card card : cards) {
			strb.append(card.toString());
			strb.append(", ");
		}
		return strb.toString();
	}
}
