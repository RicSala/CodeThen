package radio;

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

	public List getMenu() {
		return menu;
	}

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






}
