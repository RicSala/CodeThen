package radio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartyPrompt {

	Radio radio;


	public PartyPrompt(Radio radio) {
		this.radio = radio;
	}

	/**
	 * The first interaction with the radio user ask if he/she wants to open it and turn it on (just for the shake of learning...)
	 * @return
	 */
	public boolean openRadio() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Radio radio = new Radio("CodeRadio");
		System.out.println("La marca de tu radio es " + radio.getBrand());
		System.out.println("Al comprarla está a un volumen de " + radio.getVolume());
		System.out.println("¿Que quieres hacer con ella?");
		System.out.println("A) Nada, solo la he comprado para mirarla!");
		System.out.println("B) ¡Quiero encenderla!");
		String option = "";
		int action;

		try {
			option = reader.readLine().toLowerCase();
			System.out.println(option);
		} catch (IOException ioe) {
			System.out.println("Ooops! Hemos tenido un problema al meter tu opción! Elige bien! (A ó B)");
		}
		return option.equals("b");

	}


	/**
	 * Prompts the user for action, showing the Radio object menu
	 *
	 * @return the chosen action
	 */
	public int promptForAction() {

		int option = 0;
		for (int i = 1; i <= radio.getMenu().size(); i++) {
			System.out.println(i + ") " + radio.getMenu().get(i - 1));
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			option = Integer.parseInt(reader.readLine().toLowerCase());
		} catch (IOException ioe) {
			System.out.println("Ooops! Hemos tenido un problema al meter tu opción! Elige bien! (A ó B)");
		}

		return option;
	}

}
