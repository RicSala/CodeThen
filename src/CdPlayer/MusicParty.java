package CdPlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicParty {

	/**
	 * The aim of the class is jut to use the created Classes: Song, Cd and CdPlayer
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		List<Song> songs = new ArrayList<Song>(); //TODO: this should be a different method but I think is out of the scope of the ex.

		//To use the methods, I will create one cd with several songs. This should be done by the user or load from file.

		try {
			Song song = new Song("Rock", "It's my Life", "Bon Jovi", 90);
			songs.add(song);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		try {
			Song song = new Song("Indie", "Toro", "El columpio asesino", 45);
			songs.add(song);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		try {
			Song song = new Song("Popular", "Paquito el Chocolatero", "¿¿Quién fue??", 90);
			songs.add(song);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		try {
			Song song = new Song("Punk", "We will all dye young", "SteelDragon", 90);
			songs.add(song);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}


		Cd cd = new Cd("Mezcla Ricardo", songs);

		CdPlayer cdPlayer = new CdPlayer(); //Instantiate a CdPlayer  --> El cacharrito con el que voy a jugar
		Prompter prompter = new Prompter(cdPlayer); //And a new prompter --> La interacción con el usuario del cacharrito
		Logic logic = new Logic(cdPlayer); //and a new logic --> El "cerebro" para usar el cacharrito

		int option = 0;
		while (option != 9) {
			option = prompter.promptForAction();
			logic.run(option, cd); //TODO: en un futuro, en lugar de un cd, puede pasarle un List de CDs y elegir en el Logic.
		}






	}
}
