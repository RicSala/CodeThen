package game;

/**
 * An entity in the game
 * <p>
 * Notes: An interface only has method headers, with no implementation.
 * All methods declared in an interface are implicitily PUBLIC and
 * ABSTRACT (i.e. not implemented).
 */

public interface Entity {

	// Tells if the entity is alive
	boolean isAlive();

	//Returns the entity's health
	int getHealth();

	//Returns the next atack power
	int attack();

	//Receives the hit from another entity
	void receiveHit(int hit);


}
