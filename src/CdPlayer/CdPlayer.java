package CdPlayer;

public class CdPlayer {
	private Boolean on;
	private Cd cd;
	private int songNow;


	public CdPlayer() {
		on = false;
		cd = null;
		songNow = -1;
	}

	public Cd getCd() {
		return cd;
	}

	public int getSongNow() {
		if (songNow == -1) {
			throw new IllegalArgumentException("%n%n¡No está sonando nada porque no has dado al play!%n%n");
		}
		return songNow;
	}

	public void nextSong() {
		if (songNow == cd.getSongs().size()-1) { //si la canción es la última, el disco vuelve a empezar
			songNow = 0;
		} else {
			songNow++;
		}

	}


	public Cd play() {
		if (cd == null) {
			throw new RuntimeException("%n%n¡Necesitas un cd para que suene algo!");
		}
		on = true;
		songNow = 0;
		return cd;
	}


	public void insertCd(Cd cd) {
		if(!(cd == null)) {
			ejectCd();
		}
		this.cd = cd;
	}

	public void ejectCd() {
		this.cd = null;
		this.songNow = -1; //TODO mirar a ver si conviene ponerlo a -1 cuando no haya cd dentro.
	}


}
