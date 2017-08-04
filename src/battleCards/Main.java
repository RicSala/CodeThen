package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.CardGameTest;

//TODO: CREO QUE YA ESTÁ!! --> FERRAN, ¿Cómo podría separar aquí la lógica del prompter? No lo acabo de ver... -->

public class Main {

	public static void main(String[] args) {

		CardDeck cardDeck = new CardDeck(); //CREO LA BARAJA
		Game game = new Game();     //CREO EL JUEGO....
		Prompter prompter = new Prompter(game, cardDeck);   //LE PASO BARAJA Y JUEGO AL PROMPTER

		int option = 1;
		while (option != 0) {   //Y JUEGO MIENTRAS NO ME DIGAN LO CONTRARIO
			prompter.promptForAction();
		}

		CardGameTest.runTest(); //Todo: FERRAN, sería ésta la forma correcta de hacerlo? static y desde la clase directamente ¿o instancio los test?

	}
}
