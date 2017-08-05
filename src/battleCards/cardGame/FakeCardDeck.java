package battleCards.cardGame;


//TODO: ESTAS CLASES QUE SON PARA HACER LOS TEST, LAS DEJO AQUÍ O ME LAS LLEVO A LA CARPETA DE TEST?

//TODO: REPASAR PACK

public class FakeCardDeck extends CardDeck{

	@Override
	public void shuffle() {
		return;
	}

	@Override
	public Card pickCard() {
		return super.pickCard();
	}
}
