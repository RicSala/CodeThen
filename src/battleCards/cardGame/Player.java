package battleCards.cardGame;

/**
 * Player Class.
 * Properties:  name: Name of the player
 *              cardHand: List of the cards "in the hand" of the player (List<Cards>)
 */
public class Player {
	private String name;
	private CardHand cardHand;

	public Player(String name) {
		this.name = name;
		cardHand = new CardHand();
	}


	public CardHand getCardHand() {
		return cardHand;
	}

	/**
	 * @return: Player name: [Player.name]
	 *          Mano actual: [Player.cardHand]
	 */
	@Override
	public String toString() {
		return "Player name: " + this.name + "\n" +
				"Mano actual: " + cardHand;
	}

	/**
	 * Given a CardDeck, the Player picks a card of it.
	 * @param cardDeck
	 * @return the picked Card
	 */
	public Card pickCard(CardDeck cardDeck) {
		return cardDeck.pickCard(); //Todo: FERRAN, estoy llamando a dos métodos de la misma forma, sé que no pasa nada pero...¿Es buena práctica? A mí me queda muy claro...uno hace la acción el otro la recibe, pero tiene sentido que la acción se llame igual...¿Cómo se suele hacer?
	}




	public String getName() {
		return name;
	}
}
