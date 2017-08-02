package game.players;

import game.Entity;

/**
 * Base class for all players in the game
 *
 * Notes about abstract classes:
 * - They may have abstract methods (i.e. not implemented)
 * - They can't be initiated (can't do 'new Player()')
 * - They are mean to be extended (e.g. class Rat extends Player)
 */

public abstract class Player {

	private int health;

	public Player() {
		this.health = 12;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract int attack();

	public void receiveHit(int hit) {
		this.health -= hit;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + health + ") ";
	}
}
