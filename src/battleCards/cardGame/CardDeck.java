package battleCards.cardGame;

import java.util.*;

public class CardDeck {

	private List<Card> cardDeck = new ArrayList<>();

	/**
	 * Constructor of CardDeck. It creates the cards and fill the cardDeck with them.
	 * The sum of the properties of any give card must be <11.
	 * Any property of any card must be > 1.
	 */

	public CardDeck() {
		Card card;

		for (int i = 1; i < 9; i++) {
			int j = 1;
			int k = 10 - i - j;
			while ( k != 0) {
				cardDeck.add(new Card(i, j, k));
				j++;
				k--;
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
		return this.cardDeck.remove(cardDeck.size() - 1);
	}
}