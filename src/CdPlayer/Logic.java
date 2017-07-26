package CdPlayer;


public class Logic {
	CdPlayer cdPlayer;

	/**
	 * Constructor, logic of the MusicParty program
	 * @param cdPlayer
	 */
	public Logic(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	/**
	 * Given the option and a cd it performs the action selected by the user.
	 * @param option
	 * @param cd
	 */
	public void run(int option, Cd cd) {

		switch (option) {
			case 1:
				try {
					cdPlayer.play();
				} catch (RuntimeException rte) {
					System.out.printf(rte.getMessage());
				}
				break;

			case 2:
				cdPlayer.insertCd(cd);
				System.out.printf("%nHas introducido el CD:   " + cd.getTitle() + "%n"); //Could be improved moving this to Prompter.java
				break;

			case 3:
				try {
					System.out.printf("%nEsta sonando:   " + cd.songs.get(cdPlayer.getSongNow()).toString() + "%n"); //Could be improved moving this to Prompter.java
				} catch (IllegalArgumentException iae) {
					System.out.printf(iae.getMessage());
				}
				break;

			case 4:
				try {
					cdPlayer.nextSong();
				} catch (IllegalArgumentException iae) {
					System.out.printf(iae.getMessage());
				}
				break;

			case 5:
				cdPlayer.ejectCd();
				break;
			case 6:
				System.out.printf(cdPlayer.getCd().toString());
				break;
			case 9:
				System.out.printf("%n%nEsperamos que hayas disfruta con la sesión de MC Ric! %n%n;)%n%n%n%n%n"); //Could be improved moving this to Prompter.java
				break;

			default:
				System.out.println("Dime argo pó favó!"); //Could be improved moving this to Prompter.java
				break;
		}
	}

}
