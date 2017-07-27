package radio;

import java.io.IOException;

public class PartyLogic {

	private final Radio radio;

	public PartyLogic(Radio radio) {
		this.radio = radio;
	}


	public void starParty (String option) {
		if (option.equals("a")) {
			System.out.println("Ok, pues nada, ¡Deu majo!");
		} else if (option.equals("b")) {
			System.out.printf("veamos que podemos hacer con ella...\n\n");
			radio.toggleOn();


		}

	}



	/**
	 * Given an action, performs the same
	 *
	 * @param action
	 * @throws IOException Bubbled up exception.
	 */
	public void performAction(int action) throws IOException {
		switch (action) {
			case 1:
				radio.toggleOn();
				break;

			case 2:
				radio.volumeUp();
				break;

			case 3:
				radio.volumeDown();
				break;

			case 4:
				System.out.println("Tu radio está a volumen " + radio.getVolume());
				break;
			default:
				System.out.println("¡Introduce un número de opción válido!");
		}
	}

}
