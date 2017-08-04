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
}
