package deck.card;

import java.util.Objects;

public class Card {
	private Value value;
	private Suit suit;

	public Card(Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return suit.getShortVal()+value.getValue();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Card card = (Card) o;
		return value == card.value && suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, suit);
	}
}
