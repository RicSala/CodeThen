package battleCards.cardGame;

import java.util.*;

public class CardDeck {  //Todo FERRAN: Creo que lo podría haber hecho extendiendo la clase List de forma más eficiente, pero no sé como.

	private List<Card> cardDeck = new ArrayList<>();

	public CardDeck() {
		Card card;
		System.out.println("Generando nueva baraja......\n");
		for (int i = 111; i < 1000; i++) {  //Genero números de 111 a 999 y quito los que sus digits sumen > 10.
			int magic = Character.digit(String.valueOf(i).charAt(0), 10);
			int strength = Character.digit(String.valueOf(i).charAt(1), 10);
			int intelligence = Character.digit(String.valueOf(i).charAt(2), 10);
			if (magic + strength + intelligence <= 10) {
				card = new Card(magic, strength, intelligence);
				cardDeck.add(card);
			}
		}
	}

	public List<Card> getCardDeck() {
		return cardDeck;
	}


	public void shuffle() {
		Random random = new Random();
		System.out.println("Removiendo la baraja......\n");
		Card[] shuffledDeck = new Card[cardDeck.size()]; //Lo hago con un array para poder crearla con una tamaño fijo y acceder las posiciones antes para ver si están vacías.
		int i = 0;
		while (cardDeck.size() > 0) {
			int extractionIndex = random.nextInt(cardDeck.size());
			shuffledDeck[i] = cardDeck.remove(extractionIndex);
			i++;
		}
		this.cardDeck = new ArrayList<>(Arrays.asList(shuffledDeck)); //Todo: Estoy seguro de que ésta forma no es nada eficiente... (en general, el método). Podría hacer un shuffle con Collections.
	}

	@Override
	public String toString() {
		String cardDeckString = "";
		for (Card card : cardDeck) {
			cardDeckString += card.toString() + "\n";
		}
		return cardDeckString;
	}

	public Card pickCard() {
		Card carPicked;
		carPicked = this.getCardDeck().get(this.getCardDeck().size() - 1);
		this.cardDeck.remove(cardDeck.size() - 1);
		return carPicked; //Todo: Entiendo que coge la de más arriba - Aquí podríamos haber usado una QUEUE! Y hacer pulls...
	}
}
