package CdPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompter {
	CdPlayer cdPlayer;
	BufferedReader reader;

	public Prompter(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}


	/**
	 * Show the different options for the user
	 * @return the option selected
	 * @throws IOException
	 */
	public int promptForAction() throws IOException {
		int option = 0;
		System.out.printf("%n%n¿Qué quieres hacer con tu radio Compact disk?%n");
		System.out.printf("%n1) Darle al play");
		System.out.printf("%n2) Poner un disco (de momento EL disco!)"); //TODO: Poder crear discos y almacenarlos en un fichero.
		System.out.printf("%n3) ¿Qué está sonando?");
		System.out.printf("%n4) Pasar a la siguiente canción");
		System.out.printf("%n5) Quitar el disco que hay");
		System.out.printf("%n6) Dame info sobre el cd que hay!");
		System.out.printf("%n9) Quitar el enchufe...¡Apaga esto ya!");
		reader = new BufferedReader(new InputStreamReader(System.in));
		option = Integer.parseInt(reader.readLine());
		return option;
	}

}
