package battleCards.cardGame;

/**
 * Card Class.
 * Properties:  magic:
 *              strength:
 *              intelligence:
 *
 * TODO: FERRAN, me gustaría ver contigo alternativas a la estructura de este ejercicio...no me acaba de convencer, ¿Qué opinas?
 *
 */
public class Card {
	private int magic;      //---> Otra opción sería hacerlos public y tirar directamente de la propiedad, pero por si crece...
	private int strength;   //---> Otra opción sería darle un int[]: da igual qué es el número en este juego...pero IDEM que anterior.
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
