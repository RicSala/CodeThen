package battleCards.cardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	@Override
	public String toString() {
		return "Player name: " + this.name + "\n" +
				"Mano actual: " + cardHand;
	}

	public Card pickCard(CardDeck cardDeck) {
		return cardDeck.pickCard(); //Todo: FERRAN, estoy llamando a dos métodos de la misma forma, sé que no pasa nada pero...¿Es buena práctica? A mí me queda muy claro...uno hace la acción el otro la recibe, pero tiene sentido que la acción se llame igual...¿Cómo se suele hacer?
	}

	public boolean isCardHancComplete() {
		return cardHand.size() == 3;
	}

	public void keepOrDiscard(Card card) {

		if (cardHand.size() > 2) {
			throw new RuntimeException("No deberías poder coger más de tres cartas!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Te quieres quedar esta carta? (Y/N)\nCarta: " +card);  //TODO: Ferran, Por qué no me está pidiendo que haga un try / catch??
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
