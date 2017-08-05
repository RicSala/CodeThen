package battleCards.cardGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//TODO: Fuerzo un poco el test porque de nuevo hay poco que testar


public class PlayerTest {

	private CardDeck cardDeck;
	private Player player;

	@Before

	public void setUp() {

		cardDeck = new CardDeck();
		player = new Player("Ricardo");

	}

	@Test
	public void pickReturnsTheLastCardOfTheDeck() throws Exception {


		Card card = new Card(8, 1, 1);
		assertEquals(player.pickCard(cardDeck), card);

	}
}