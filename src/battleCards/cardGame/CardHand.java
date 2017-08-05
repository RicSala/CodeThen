package battleCards.cardGame;

import java.util.List;

public class CardHand {
	public List<Card> cardHand; //HAGO COMPOSING EN LUGAR DE HERENCIA, ASÍ ME AHORRO CONTROLAR TODOS LOS MÉTODOS DE LIST.

	public CardHand() {
	}

	public void add(Card card) {
		cardHand.add(card);
	}

	public int size() {
		return cardHand.size();
	}

	public Card get(int index) {
		return cardHand.get(index);
	}


}
