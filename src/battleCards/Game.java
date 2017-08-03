package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.Player;

class Game {


	public void pickCards(CardDeck cardDeck, Player playerA, Player playerB) {

		for (int i = 0; i < 5 && !(playerA.isCardHancComplete() && playerB.isCardHancComplete()); i++) {

			System.out.println("Reparto número: " + i + "\n");
			if (!playerA.isCardHancComplete()) {
				System.out.println("\n" + playerA.getName() + ", ¿Te quieres quedar esta carta?");
				playerA.keepOrDiscard(playerA.pickCard(cardDeck));
			}

			if (!playerB.isCardHancComplete()) {
				System.out.println("\n" + playerB.getName() + ", ¿Te quieres quedar esta carta?");
				playerB.keepOrDiscard(playerB.pickCard(cardDeck));
			}
			System.out.println();
		}

		if (!playerA.isCardHancComplete() || !playerB.isCardHancComplete()) {
			throw new RuntimeException("¡Tienes que coger al menos 3 cartas para poder jugar una partida!"); //TODO: Lanzo una excepción para el caso que no cojan suficientes cartas...Me gustaría poder "volver a empezar el programa (tiene sentido), ¿Cómo lo hago? Como hago dentro de un programa "javac ... java..."
		}
	}


	public Player fight(Player playerA, Player playerB) {

		int[] handValuesA = getcardHandValues(playerA);
		int[] handValuesB = getcardHandValues(playerB);

		int pointsA = (handValuesA[0] > handValuesB[0] ? 1 : -1) +
				(handValuesA[1] > handValuesB[1] ? 1 : -1) +
				(handValuesA[2] > handValuesB[2] ? 1 : -1);

		if (pointsA > 0) {
			return playerA;
		}

		else if (pointsA < 0) {
			return playerB;
		} else return null;
	}

	private int[] getcardHandValues(Player player) {  //TODO ---> LO SUYO SERÍA HACER UNA CLASE CARHAND
		int[] values = new int[3];

		values[0] = player.getCardHand().get(0).getMagic() + player.getCardHand().get(1).getMagic() + player.getCardHand().get(2).getMagic();
		values[1] = player.getCardHand().get(0).getStrength() + player.getCardHand().get(1).getStrength() + player.getCardHand().get(2).getStrength();
		values[2] = player.getCardHand().get(0).getIntelligence() + player.getCardHand().get(1).getIntelligence() + player.getCardHand().get(2).getIntelligence();

		System.out.println(player.getName() + ", tu mano tiene valores: " + values[0] + " - " + values[1] + " - " + values[2]+ "\n");

		return values;
	}
}
