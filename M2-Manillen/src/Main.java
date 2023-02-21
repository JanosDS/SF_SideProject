import java.util.*;
import deck.Deck;
import deck.DeckHandler;
import deck.card.Suit;
import game.Game;
import game.Round;
import player.Player;

public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		DeckHandler deckHandler = new DeckHandler();
		Deck deck = deckHandler.createManillenDeck();
		deck.shuffleDeck();

		Player player1 = new Player("Janos");
		Player player2 = new Player("Tom");
		Player player3 = new Player("Miguel");
		Player player4 = new Player("Aaron");
		Player[] team1 = {player1, player3};
		Player[] team2 = {player2, player4};
		Player[] players = {player1, player2, player3, player4};

		Game game = new Game("Test",team1, team2 );
		deckHandler.dealDeck(deck, players);
		System.out.println(game.toString());

		System.out.println(players[0].toString());
		String trump = "";
		while(!Suit.validateSuit(trump)){
			System.out.println("Chose trump:");
			trump = myObj.nextLine();
		}
		Round round = new Round(Suit.getSuit(trump));
		System.out.println(round.toString());

	}
}