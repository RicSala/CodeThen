package battleCards.cardGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
	private Card card;
	private Card cardEqual;
	private Card cardDif;

	@Before
	public void setUp() throws Exception {
		card = new Card(8, 1, 1);
		cardEqual = new Card(8, 1, 1);
		cardDif = new Card(5, 2, 3);

	}

	@Test
	public void equalsTest() throws Exception {

		assertEquals(card, cardEqual);
		assertFalse(card.equals(cardDif));
	}
}