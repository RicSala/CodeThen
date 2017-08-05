package battleCards;

import battleCards.cardGame.CardDeck;
import battleCards.cardGame.Player;

//TODO: EL JUEGO NO NECESITA EL CARDDECK??? PUEDE QUE TENGA SENTIDO --> LAS REGLAS DEL JUEGO SON LAS MISMAS CON INDEPENDENCIA DE LA BARAJA!

class Game {

	public static final int MAX_CARDS = 3;
	private final CardDeck cardDeck;
	private Player playerA;
	private Player playerB;

	public Game(CardDeck cardDeck) {
		this.cardDeck = cardDeck;
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

		//System.out.println(player.getName() + ", tu mano tiene valores: " + values[0] + " - " + values[1] + " - " + values[2] + "\n");

		return values;
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
	 *
	 * @return
	 * TODO:    ME LO TRAIGO AQUÍ PORQUE CREO QUE TIENE SENTIDO QUE EL QUE TE DIGA SI PUEDES COGER MÁS CARTAS SEA EL JUEGO...
	 */
	public boolean isCardHandComplete(Player player) {
		return player.getCardHand().size() == MAX_CARDS;
	}


	public void setPlayerA(Player playerA) {
		this.playerA = playerA;
	}

	public void setPlayerB(Player playerB) {
		this.playerB = playerB;
	}

	public Player getPlayerA() {
		return playerA;
	}

	public Player getPlayerB() {
		return playerB;
	}

	public CardDeck getCardDeck() {
		return cardDeck;
	}
}
