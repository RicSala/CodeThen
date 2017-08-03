package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.CardGameTest;
import battleCards.cardGame.Player;

//TODO: FERRAN, ¿Cómo podría separar aquí la lógica del prompter? No lo acabo de ver...

public class Main {

	public static void main(String[] args) {

		Game game = new Game();


		Player playerA = new Player("Anne");
		Player playerB = new Player("Bob");
		System.out.println(playerA);
		System.out.println("***------VS------***");
		System.out.println(playerB);
		printLines(5);


		CardDeck cardDeck = new CardDeck();
		cardDeck.shuffle();

		game.pickCards(cardDeck, playerA, playerB);
		printLines(20);
		System.out.println(playerA.toString());
		printLines(3);
		System.out.println(playerB.toString());
		printLines(3);

		Player winner = game.fight(playerA, playerB);

		if (winner.getName() != null) {
			System.out.println(winner.getName() + " WINS!!!!");
		} else {
			System.out.println("¡WE HAVE A TIE!");
		}


		CardGameTest.runTest(); //Todo: FERRAN, sería ésta la forma correcta de hacerlo? static y desde la clase directamente ¿o instancio los test?

	}

	public static void printLines(int numberOfLines) {
		for (int i = 0; i < numberOfLines; i++) {
			System.out.println();
		}
	}


}
