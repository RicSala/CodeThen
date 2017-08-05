package battleCards.cardGame;

/**
 * Card Class.
 * Properties:  magic:
 *              strength:
 *              intelligence:
 */

public class Card {
	private int magic;
	private int strength;
	private int intelligence;

	public Card(int magic, int strength, int intelligence) {
		this.magic = magic;
		this.strength = strength;
		this.intelligence = intelligence;
	}

	public int getMagic() {
		return magic;
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public String toString() {
		return "Magic: " + magic + " | " + "Strength: " + strength + " | " + "Intelligence: " + intelligence;
	}

	@Override //TODO: COMENTAR CON FERRAN
	public boolean equals(Object card) {
		card = (Card) card;
		return (this.magic == ((Card) card).getMagic() &&
		this.intelligence == ((Card) card).getIntelligence() &&
		this.strength == ((Card) card).getStrength());
	}
}
