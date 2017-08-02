package game.players;

import java.util.Random;

public class Skeleton extends Player {
	Random random = new Random(); //Si lo metes dentro de la función attack(), te creará un OBJETO random cada vez

	public Skeleton() {
		// this.random = random; //todo: que diferencia habría entre crar el objeto random aquí y crearlo fuera? En random lo hacemos aquí.
		setHealth(8);
		}

	@Override
	public int attack() {

		return random.nextInt(3) + 2;
	}

	@Override
	public void receiveHit(int hit) {
		if (hit > 2) {
			super.receiveHit(hit); //solo aplica la función de la superclase si el hit ha sido mayor que 2
		}
	}
}
