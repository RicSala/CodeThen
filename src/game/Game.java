package game;

import game.players.*;

import java.util.Random;

public class Game {

	private Random random = new Random(); //Lo creamos fuera para ahorrarnos crear un objeto cada nextEnemy

	public Game() {
	}


	public void start() {

		Knight knight = new Knight();

		int numEnemies = 3;

		System.out.println("Game starts. The knight will fight " + numEnemies + " enemies");

		for (int i = 0; i < numEnemies && knight.isAlive(); i++) {
			Player enemy = nextEnemmy();
			fight(knight, enemy);
		}

		if (knight.isAlive()) {
			System.out.println("The knight wins!!! xD");
		} else {
			System.out.println("Poor knight was killed... x-O");
		}
	}

	private void fight(Knight knight, Player enemy) {

		while (knight.isAlive() && enemy.isAlive()) {
			int knightHit = knight.attack();
			int enemyHit = enemy.attack();

			System.out.println(knight + " hits " + knightHit + ", " + enemy + " hits " + enemyHit);

			knight.receiveHit(enemyHit);
			enemy.receiveHit(knightHit);

		}

		System.out.println("\nEnd of battle! The remaining lives are: " + knight + " - " + enemy + "\n\n\n");

	}

	private Player nextEnemmy() {

		int enemyType = random.nextInt(4);

		switch (enemyType) {
			case 0:
				return new Rat();

			case 1:
				return new Skeleton();

			case 2:
				return new Zombie();

			case 3:
				return new Giant();

			default:
				throw new RuntimeException("Unexpected!!");
		}
	}
}
