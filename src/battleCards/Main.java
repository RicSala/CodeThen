package battleCards;

import battleCards.cardGame.CardDeck;

//TODO: CREO QUE YA ESTÁ!! --> FERRAN, ¿Cómo podría separar aquí la lógica del prompter? No lo acabo de ver... -->

public class Main {

	public static void main(String[] args) {

		CardDeck cardDeck = new CardDeck(); //CREO LA BARAJA
		Game game = new Game(cardDeck);     //CREO EL JUEGO....
		Prompter prompter = new Prompter(game);   //LE PASO BARAJA Y JUEGO AL PROMPTER

		int option = 1;
		while (option != 0) {   //Y JUEGO MIENTRAS NO ME DIGAN LO CONTRARIO
			prompter.promptForAction();
		}
	}
}
