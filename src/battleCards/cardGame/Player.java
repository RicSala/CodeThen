package battleCards.cardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Player Class.
 * Properties:  name: Name of the player
 *              carHand: List of the cards "in the hand" of the player (List<Cards>)
 */
public class Player {
	private String name;
	private List<Card> cardHand;

	public Player(String name) {
		this.name = name;
		cardHand = new ArrayList<>();
	}


	public List<Card> getCardHand() {
		return cardHand;
	}

	/**
	 *
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

	/**
	 *
	 * @return
	 * TODO:    Ferran, cuando hablo de que no me convence la estructura, me refiero a este método por ejemplo.
	 * TODO:    Porque...¿No tendría más sentido que estuviese en "Game" o algo fuera de la clase player? Que la mano está completa depende de cuantas cartas se puedan coger en ese juego...
	 */
	public boolean isCardHancComplete() {
		return cardHand.size() == 3;
	}

	/**
	 * Given a card, Prompts the user to decide if he wants to keep it or discard it.
	 * @param card
	 */
	public void keepOrDiscard(Card card) {

		if (cardHand.size() > 2) {
			throw new RuntimeException("No deberías poder coger más de tres cartas!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Te quieres quedar esta carta? (Y/N)\nCarta: " + card);  //TODO: Ferran, Por qué no me está pidiendo que haga un try / catch??
		String option = scanner.nextLine();
		if (option.equals("N")) {
			System.out.println("Has descartado la carta: " + card);
		} else {
			cardHand.add(card);
		}
	}

	public String getName() {
		return name;
	}
}
