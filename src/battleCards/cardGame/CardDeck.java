package battleCards.cardGame;

import java.util.*;

public class CardDeck {  //Todo FERRAN: Creo que lo podría haber hecho extendiendo la clase List de forma más eficiente, pero no sé como.

	private List<Card> cardDeck = new ArrayList<>();

	/**
	 * Constructor of CardDeck. It creates the cards and fill the cardDeck with them.
	 * The sum of the properties of any give card must be <11.
	 * Any property of any card must be > 1.
	 */

	public CardDeck() {
		Card card;

		for (int i = 1; i < 10; i++){
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10 && i + j + k <= 10; k ++) {
					card = new Card(i, j, k);
					cardDeck.add(card);
				}
			}
		}
	}



	public List<Card> getCardDeck() {
		return cardDeck;
	}


	/**
	 * Shuffles the cardDeck.
	 * Creates a Card array of the same size os the cardDeck. Then iterate the newly created array an assign to each
	 * position i a random card taken from the original deck. Then returns the shuffled deck converted to ArrayList.
	 */

	public void shuffle() {
		int size = cardDeck.size();
		Card cardHolder;

		for (int i = 0; i < size; i++) {
			cardHolder = cardDeck.remove(i);
			Random random = new Random();
			cardDeck.add(random.nextInt(size-1), cardHolder);
		}
	}




	@Override
	public String toString() {
		String cardDeckString = "";
		for (Card card : cardDeck) {
			cardDeckString += card.toString() + "\n";
		}
		return cardDeckString;
	}

	/**
	 * Removes the card located at index = size - 1 and
	 *
	 * @return the cardPicked (removed)
	 */
	public Card pickCard() {
		Card carPicked;
		carPicked = this.getCardDeck().get(this.getCardDeck().size() - 1);
		this.cardDeck.remove(cardDeck.size() - 1);
		return carPicked; //Todo: Entiendo que coge la de más arriba - Aquí podríamos haber usado una QUEUE! Y hacer pulls...
	}
}


	/* TODO: NO ESTÁ MAL PERO ES ALGO ENREVERSADO!
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
	*/

		/*TAMBIÉN FUNCIONA, ES UNA ALTERNATIVA MÁS "CARA"
	public void shuffleAlt() {
		Random random = new Random();
		System.out.println("Removiendo la baraja......\n"); //TODO: Ferran, no sé si en las clases conviene meter esto, me parece que "enguarra" un poco...
		Card[] shuffledDeck = new Card[cardDeck.size()]; //Lo hago con un array para poder crearla con una tamaño fijo y acceder las posiciones antes para ver si están vacías.
		int i = 0;
		while (cardDeck.size() > 0) {
			int extractionIndex = random.nextInt(cardDeck.size());
			shuffledDeck[i] = cardDeck.remove(extractionIndex);
			i++;
		}
		this.cardDeck = new ArrayList<>(Arrays.asList(shuffledDeck)); //Todo: Estoy seguro de que ésta forma no es nada eficiente... (en general, el método). Podría hacer un shuffle con Collections.
	}
	*/
