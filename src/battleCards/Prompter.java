package battleCards;

import battleCards.cardGame.Card;
import battleCards.cardGame.CardDeck;
import battleCards.cardGame.Player;



import java.util.Scanner;

public class Prompter {
	private Game game;
	private Scanner scanner;

	public Prompter(Game game) {

		this.game = game;
		scanner = new Scanner(System.in);
	}

	public void promptForAction() { //TODO: IGUAL LE PUEDO LLAMAR ACTION SIN MÁS? DESPUÉS DE TODO ES UN PROMPTER...
		System.out.println("Que quieres hacer? \n");
		System.out.println("1) Remover la baraja.\n");
		System.out.println("2) Jugar a las cartas\n");
		System.out.println("3) Mostrar la baraja\n\n\n");
		System.out.println("0) Salir del juego");

		int option = scanner.nextInt();

		switch (option) {
			case 1: game.getCardDeck().shuffle();
				System.out.println("Removiendo la baraja...");
				break;
			case 2:
				prompForPlayers();
				promptForPick();
				Player winner = game.fight();
				showWinner(winner);
				break;
			case 3:
				System.out.println(game.getCardDeck());
				break;
			case 0:
				System.out.println("¡Gracias por jugar!");
				System.exit(1);
				break;
			default:
				System.out.println("Debes elegir uno de los valores propuestos (1, 2 ó 0)");
		}
	}

	private void promptForPick() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Reparto número: " + (i + 1));
			if (!game.isCardHandComplete(game.getPlayerA())) {
				System.out.println(game.getPlayerA().getName());
				keepOrDiscard(game.getPlayerA(), game.getPlayerA().pickCard(game.getCardDeck()));
			}

			if (!game.isCardHandComplete(game.getPlayerB())) {
				System.out.println(game.getPlayerB().getName());
				keepOrDiscard(game.getPlayerB(), game.getPlayerB().pickCard(game.getCardDeck()));
			}
		}

		if (!game.isCardHandComplete(game.getPlayerA()) || !game.isCardHandComplete(game.getPlayerB())) {
			throw new RuntimeException("Debeis tener los dos jugadores tres cartas para poder jugar!");
		}

		System.out.println(game.getPlayerA());
		System.out.println(game.getPlayerB());
	}

	/**
	 * Given a card, Prompts the user to decide if he wants to keep it or discard it.
	 * @param card
	 */
	public void keepOrDiscard(Player player, Card card) {

		if (player.getCardHand().size() > game.MAX_CARDS) { //TODO EL MAXIMO DE CARTAS ES COSA DEL JUEGO, NO DEL PROMPT...
			throw new RuntimeException("No deberías poder coger más de tres cartas!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Te quieres quedar esta carta? (Y/N)\nCarta: " + card);
		String option = scanner.nextLine();
		if (option.equals("N")) {
			System.out.println("Has descartado la carta: " + card);
		} else {
			;
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
