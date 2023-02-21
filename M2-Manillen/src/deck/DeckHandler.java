package deck;

import deck.card.Card;
import deck.card.Suit;
import deck.card.Value;
import player.Player;

public class DeckHandler {

	public Deck createManillenDeck(){
		Deck manillenDeck = new Deck();
		for(Suit suit : Suit.values()){
			for(Value value : Value.values()){
				if(value.getValue() > 6 || value.getValue() == 1){
					Card newCard = new Card(value, suit);
					if(!manillenDeck.contains(newCard)){
						manillenDeck.addCard(newCard);
					}
				}
			}
		}
		return manillenDeck;
	}

	public void dealDeck(Deck deck, Player[] players){
		// 3 - 2 - 3
		for(Player player : players){
			dealCards(3, deck, player);
		}
		for(Player player : players){
			dealCards(2, deck, player);
		}
		for(Player player : players){
			dealCards(3, deck, player);
		}
	}

	public void dealCards(int amount, Deck deck, Player player){
		for(int i = 0; i<amount; i++){
			Card cardToBeDealt = deck.getTopCard();
			player.getDealtCard(cardToBeDealt);
		}
	}
}
