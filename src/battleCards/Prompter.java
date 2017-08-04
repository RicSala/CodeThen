package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.Player;

import java.util.Scanner;

public class Prompter {
	private final CardDeck cardDeck;
	private Game game;
	private Scanner scanner;

	public Prompter(Game game, CardDeck cardDeck) {

		this.game = game;
		this.cardDeck = cardDeck;
		scanner = new Scanner(System.in);
	}

	public void showMenu() {
		System.out.println("Que quieres hacer? \n");
		System.out.println("1) Remover la baraja.\n");
		System.out.println("2) Jugar a las cartas\n\n\n");
		System.out.println("0) Salir del juego");

		int option = scanner.nextInt();

		switch (option) {
			case 1: cardDeck.shuffle();
				System.out.println("Removiendo la baraja...");
				break;
			case 2:
				prompForPlayers();
				Player winner = game.play();
				showWinner(winner);
				break;
			case 0:
				System.out.println("¡Gracias por jugar!");
				System.exit(1);
				break;
			default:
				System.out.println("Debes elegir uno de los valores propuestos (1, 2 ó 0)");
		}
	}

	public void prompForPlayers() {

		System.out.println("Jugador A, escribe tu nombre: ");
		game.setPlayerA(new Player(scanner.nextLine()));        //TODO: POR QUÉ NO ESPERA A QUE LE ESCRIBA EL NOMBRE??? xD

		System.out.println("Jugador B, escribe tu nombre: ");
		game.setPlayerB(new Player(scanner.nextLine()));

		System.out.println(game.getPlayerA());
		System.out.println("***------VS------***");
		System.out.println(game.getPlayerB());
	}

	public void showWinner(Player winner) {
		if (winner.getName() != null) {
			System.out.println(winner.getName() + " WINS!!!!");
		} else {
			System.out.println("¡WE HAVE A TIE!");
		}
	}
}
