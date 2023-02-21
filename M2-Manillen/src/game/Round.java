package game;

import deck.card.Suit;


public class Round {
	private Suit trump;
	private static int COUNTER = 1;
	private Set[] set = new Set[8];

	public Round() {
		COUNTER++;
	}

	public Round(Suit trump) {
		this.trump = trump;
	}

	@Override
	public String toString() {
		return "Round " + COUNTER + ": trump=" + trump.toString();
	}
}
