package battleCards.cardGame;

public class CardGameTest {

	//TODO: PENDING HACER MÁS TEST!

	public static void runTest() {
		testShuffle();
		System.out.println("Your Class is fine! Yeeeeeeah!");

	}


	/**
	 * Test for method testShuffle: cardDeck size after shuffle,
	 */
	private static void testShuffle() {
		CardDeck cardDeck = new CardDeck();
		int size = cardDeck.getCardDeck().size();
		cardDeck.shuffle();
		assertEquals(cardDeck.getCardDeck().size(), size);
	}


	/**
	 * Checks that 2 values are equal; throws an exception if not.
	 */
	private static void assertEquals(Object actual, Object expected) {
		if (!(actual == null && expected == null) && !actual.equals(expected)) {
			throw new RuntimeException("not equals!! should be " + expected + " and it's " + actual);
		}
	}

}
