package rectangle;

/*SEPARAR LÓGICA Y PROMPTER*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio: Cread una clase Radio con propiedades brand, volume y on (encendida o no). Pensad constructor, getters, setters y demás métodos que creáis interesante poner
 */

public class Radio {
	private final String brand;
	private int volume;
	private Boolean on;
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	private List menu;

	/**
	 * Given a name of brad, instances a Radio object of this brand with volume = 5 and on = false. It also initialises the main main of the radio
	 *
	 * @param brand of the radio to be created
	 */
	public Radio(String brand) {
		this.brand = brand;
		this.volume = 5;  //Lo razonable es que la radio algo de volumen tenga al comprarse...para que el cliente no se piense que está rota! :P
		this.on = false;
		buildMenu();
	}

	/**
	 * Initializes the menu of the Radio object
	 */
	private void buildMenu() {
		this.menu = new ArrayList();
		this.menu.add("Pulsar boton encendido / apagado");
		this.menu.add("Subir el volumen, ¡Está muy bajito!");
		this.menu.add("Bajar el volumen, ¡Que me quedo sordo!");
		this.menu.add("¿A qué volumen está esto?");
	}

	public String getBrand() {
		return brand;
	}

	public int getVolume() {
		return volume;
	}

	public Boolean isOn() {
		return on;
	}

	/**
	 * Increase the volume of the Radio object by 1
	 *
	 * @return volume after increase
	 * @throws IOException if the volume is already at its maximum
	 */

	public int volumeUp() throws IOException {  //simulo que es una de esas radios que tiene un botón de subir un punto el volumen, caso contrario debería darle un argumento. Puede hacerlo que devuelva...
		if (volume == MAX_VOLUME) {
			throw new IOException("No se puede subir más el volumen, ¡Que te vas a quedar sordo!");
		}
		volume++;
		return volume;
	}


	/**
	 * Reduce the volume of the Radio object by 1
	 *
	 * @throws IOException if the volume is already at its minimum
	 */
	public void volumeDown() throws IOException {  //...o que no devuelva nada. COMENTAR FERRAN QUÉ ES MEJOR.
		if (volume == MIN_VOLUME) {
			throw new IOException("No se puede bajar más el volumen, ¿De verdad te está molestando con este volumen???");
		}
		volume--;
	}

	/**
	 * Toggles the state of the Boolean property "On"
	 */
	public void toggleOn() { //Simulo que el botón de encender es el mismo que el de apagar, que es un toggle.
		on = !on;
	}

	/**
	 * Prompts the user for action, showing the Radio object menu
	 *
	 * @return the chosen action
	 */
	private int promptForAction() {

		int option = 0;
		for (int i = 1; i <= this.menu.size(); i++) {
			System.out.println(i + ") " + menu.get(i - 1));
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			option = Integer.parseInt(reader.readLine().toLowerCase());
		} catch (IOException ioe) {
			System.out.println("Ooops! Hemos tenido un problema al meter tu opción! Elige bien! (A ó B)");
		}

		return option;
	}

	/**
	 * Given an action, performs the same
	 *
	 * @param action
	 * @throws IOException Bubbled up exception.
	 */
	private void performAction(int action) throws IOException {
		switch (action) {
			case 1:
				toggleOn();
				break;

			case 2:
				volumeUp();
				break;

			case 3:
				volumeDown();
				break;

			case 4:
				System.out.println("Tu radio está a volumen " + getVolume());
				break;
			default:
				System.out.println("¡Introduce un número de opción válido!");
		}
	}


	/**
	 * Main method just to use the created class
	 * Prompts the user the first time that opens the radio, once the user decided he/she wants to use it, shows the
	 * action menu and keep doing the selected action 'til the radio in turned off
	 *
	 * @param args
	 * @throws IOException not handled.
	 */
	public static void main(String[] args) throws IOException {
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
		} catch (IOException ioe) {
			System.out.println("Ooops! Hemos tenido un problema al meter tu opción! Elige bien! (A ó B)");
		}

		if (option.equals("a")) {
			System.out.println("Ok, pues nada, ¡Deu majo!");
		} else if (option.equals("b")) {
			System.out.printf("veamos que podemos hacer con ella...%n%n");
			radio.toggleOn();
			while (radio.isOn()) {

				action = radio.promptForAction();
				radio.performAction(action);

			}

		}
		System.out.println("APAGANDO RADIO");


	}


}
