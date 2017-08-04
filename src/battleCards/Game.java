package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.Player;

import java.util.Scanner;

class Game {

	private Player playerA;
	private Player playerB;
	private CardDeck cardDeck;

	public Player play(CardDeck cardDeck) {

		pickCards();
		Player winner = fight();
		return winner;
	}

	/**
	 * Prompts for the Players name and creates Players.
	 */
	public Game(CardDeck cardDeck) {

		this.cardDeck = cardDeck;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Jugador A, escribe tu nombre: ");
		this.playerA = new Player(scanner.nextLine());

		System.out.println("Jugador B, escribe tu nombre: ");
		this.playerB = new Player(scanner.nextLine());

		System.out.println(playerA);
		System.out.println("***------VS------***");
		System.out.println(playerB);
	}

	/**
	 * Given a cardDeck and two players, it prompts them pick cards in turns five times.
	 *
	 * @throws RuntimeException if any of the Player's cardHand is not complete at the end of the pick cards phase.
	 */
	public void pickCards() {

		for (int i = 0; i < 5 && !(playerA.isCardHancComplete() && playerB.isCardHancComplete()); i++) {

			System.out.println();
			System.out.println("Reparto número: " + (i + 1) + "\n");
			if (!playerA.isCardHancComplete()) {
				System.out.println(playerA.getName());
				playerA.keepOrDiscard(playerA.pickCard(cardDeck));
			}

			if (!playerB.isCardHancComplete()) {
				System.out.println(playerB.getName());
				playerB.keepOrDiscard(playerB.pickCard(cardDeck));
			}
		}

		if (!playerA.isCardHancComplete() || !playerB.isCardHancComplete()) {
			throw new RuntimeException("¡Tienes que coger al menos 3 cartas para poder jugar una partida!"); //TODO: Lanzo una excepción para el caso que no cojan suficientes cartas...Me gustaría poder "volver a empezar el programa (tiene sentido), ¿Cómo lo hago? Como hago dentro de un programa "javac ... java..."
		}
		System.out.println(playerA.toString());
		System.out.println(playerB.toString());
	}

	/**
	 * Given two Players with their cardHands (3 {@link battleCards.cardGame.Card}) it determines the winner.
	 * The card hand that outperforms the other in more values, wins.
	 *
	 * @return the winner of the fight. Null in case of a tie.
	 */
	public Player fight() {

		int[] handValuesA = getcardHandValues(playerA);
		int[] handValuesB = getcardHandValues(playerB);

		int pointsA = (handValuesA[0] > handValuesB[0] ? 1 : -1) +
				(handValuesA[1] > handValuesB[1] ? 1 : -1) +
				(handValuesA[2] > handValuesB[2] ? 1 : -1);

		if (pointsA > 0) {
			return playerA;
		} else if (pointsA < 0) {
			return playerB;
		} else return null;
	}

	/**
	 * Give a Player with his/her cardHand, it
	 *
	 * @return the values of the cardHand. (i.e. the sum of the values of the different Cards)
	 */
	private int[] getcardHandValues(Player player) {  //TODO ---> LO SUYO SERÍA HACER UNA CLASE CARHAND
		int[] values = new int[3];

		values[0] = player.getCardHand().get(0).getMagic() + player.getCardHand().get(1).getMagic() + player.getCardHand().get(2).getMagic();
		values[1] = player.getCardHand().get(0).getStrength() + player.getCardHand().get(1).getStrength() + player.getCardHand().get(2).getStrength();
		values[2] = player.getCardHand().get(0).getIntelligence() + player.getCardHand().get(1).getIntelligence() + player.getCardHand().get(2).getIntelligence();

		System.out.println(player.getName() + ", tu mano tiene valores: " + values[0] + " - " + values[1] + " - " + values[2] + "\n");

		return values;
	}
}
