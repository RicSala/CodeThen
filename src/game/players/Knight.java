package game.players;
import java.util.Random;

public class Knight extends Player {
	Random random = new Random();


	public Knight() {

		setHealth(25);
	}

	@Override
	public int attack() {
		return random.nextInt(10);
	}
}
