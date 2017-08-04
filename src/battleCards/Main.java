package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.CardGameTest;
import battleCards.cardGame.Player;

//TODO: FERRAN, ¿Cómo podría separar aquí la lógica del prompter? No lo acabo de ver...

public class Main {

	public static void main(String[] args) {

		CardDeck cardDeck = new CardDeck();
		cardDeck.shuffle();
		Game game = new Game(cardDeck);

		Player winner = game.play(cardDeck);

		if (winner.getName() != null) {
			System.out.println(winner.getName() + " WINS!!!!");
		} else {
			System.out.println("¡WE HAVE A TIE!");
		}


		CardGameTest.runTest(); //Todo: FERRAN, sería ésta la forma correcta de hacerlo? static y desde la clase directamente ¿o instancio los test?

	}
}
