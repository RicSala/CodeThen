package battleCards;

import battleCards.cardGame.Card;
import battleCards.cardGame.CardDeck;
import battleCards.cardGame.CardGameTest;
import battleCards.cardGame.Player;

//TODO: FERRAN, ¿Cómo podría separar aquí la lógica del prompter? No lo acabo de ver...

public class Main {

	public static void main(String[] args) {

		CardDeck cardDeck = new CardDeck();
		Game game = new Game(cardDeck);
		Prompter prompter = new Prompter(game, cardDeck);

		int option = 1;
		while (option != 0) {
			prompter.showMenu();
		}

		CardGameTest.runTest(); //Todo: FERRAN, sería ésta la forma correcta de hacerlo? static y desde la clase directamente ¿o instancio los test?

	}
}
