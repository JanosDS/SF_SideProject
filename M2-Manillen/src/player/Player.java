package player;

import deck.card.Card;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> handcards = new ArrayList<>();
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void getDealtCard(Card card){
		handcards.add(card);
	}

	public ArrayList<Card> getHandcards(){
		return handcards;
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append(name +": ");
		for(Card card : handcards){
			strb.append(card.toString() + ", ");
		}
		return strb.toString();
	}
}
