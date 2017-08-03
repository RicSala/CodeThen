package battleCards.cardGame;

public class CardGameTest {

	public static void runTest() {
		testShuffle();
		System.out.println("Your Class is fine! Yeeeeeeah!");

	}


	private static void testShuffle() {
		CardDeck cardDeck = new CardDeck();
		int size = cardDeck.getCardDeck().size();
		cardDeck.shuffle();
		testSize(cardDeck, size);


	}



	private static void testSize(CardDeck cardDeck, int size) {
		assertEquals(cardDeck.getCardDeck().size(), size);
	}

	/** Checks that 2 values are equal; throws an exception if not. */
	private static void assertEquals(Object actual, Object expected) {
		if (!(actual == null && expected == null) && !actual.equals(expected)) {
			throw new RuntimeException("not equals!! shoud be " + expected + " and its " + actual);
		}
	}

}
