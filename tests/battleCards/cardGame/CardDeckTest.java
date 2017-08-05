package battleCards.cardGame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardDeckTest {

	private CardDeck cardDeck;

	@Before
	public void setUp() {
		cardDeck = new CardDeck();  //ARRANGE
	}

	@Test
	public void shuffleDoesNotLoseAnyCard() throws Exception {
		CardDeck cardDeckToShuffle = new CardDeck(); //ARRANGE
		boolean sameDeckButShuffled = false; //ARRANGE


		cardDeckToShuffle.shuffle(); //ACT
		//todo: ME ESTÁ DICIENDO QUE NO SON IGUALES PORQUE PARA ÉL TIENEN QUE SER EL MISMO OBJETO!!!
		//TODO: HE HECHO OVERRIDE AL MÉTODO EQUALS PARA QUE LOS HICIESE COMPARABLES.
		//PARA PROBAR QUE FALLARÍA PODEMOS FORZAR QUE TENGAN DIFERENTE NÚMERO...
		//cardDeck.pickCard();

		assertEquals("No tienen el mismo número de cartas", cardDeck.getCardDeck().size(), cardDeckToShuffle.getCardDeck().size()); //ASSERT

	}

	@Test
	public void shuffleReturnsAShuffledDeck() throws Exception {
		CardDeck cardDeckToShuffle = new CardDeck(); //ARRANGE

		cardDeckToShuffle.shuffle(); //ACT

		assertTrue("No contienen las mismas cartas",cardDeck.getCardDeck().containsAll(cardDeckToShuffle.getCardDeck())); //ASSERT

	}

	@Test
	public void allCardsHaveApropiateValues() throws Exception {

		boolean sumTen = true;

		for (Card card : cardDeck.getCardDeck()) {
			sumTen = sumTen && (card.getIntelligence() + card.getMagic() + card.getStrength() == 10);
		}

		assertTrue("No todas las cartas suman 10!", sumTen);

	}
}