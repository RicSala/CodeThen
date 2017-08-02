package game.players;

import java.util.Random;

public class Giant extends Player {

	Random random;
	boolean vulnerable;

	public Giant() {
		setHealth(10);
		random = new Random();
	}

	@Override
	public void receiveHit(int hit) {
		//Todo: Ojo que me está truncando el número aun entero
		super.receiveHit(vulnerable ? hit * 2 : hit / 2);
		vulnerable = false;
	}

	@Override
	public int attack() {

		//Todo: Sé que no necesito aquí el else, pero por buena prácticas ¿debería?
		if (random.nextInt(2) == 0) {       //He elegido el 0 como podría haber elegido el 1 o el 2...
			vulnerable = true;                      //si consigue golpear, el siguiente turno está vulnerable...
			return random.nextInt(3) + 4;
		} else return 0;
	}
}
