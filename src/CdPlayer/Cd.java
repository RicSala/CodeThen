package CdPlayer;



import java.util.List;

//EJERCICIO: Cread la clase Cd con title y duration. También la clase CdPlayer, que podrá contener un Cd. El CdPlayer
// podrá ser encendido (método play) para reproducir el Cd (simularemos que se está reproduciendo simplemente haciendo
// que play devuelva el título del disco introducido). Tened en cuenta que quizás el CdPlayer no tiene Cd metido
// (podéis comprobar si una variable está a null):

public class Cd {

	String title = null;
	List<Song> songs =null;
	int duration = 0;  //duración del cd (será la suma de las duraciones de las canciones)

	/**
	 * Constructor
 	 * @param title of the cd
	 * @param songs List of songs in the CD
	 */
	public Cd(String title, List<Song> songs) {
		this.title = title;
		this.songs = songs;
		this.duration = getDuration();
	}

	/**
	 * @returns the duration of the whole CD (sum of the songs duration)
	 */
	public int getDuration() {
		for (Song song: songs) duration += song.getDuration();
		return duration;
	}

	public String getTitle() {
		return title;
	}

	public List<Song> getSongs() {
		return songs;
	}

	@Override
	public String toString() {
		String cdToString="";
		cdToString = ("%n%nTítulo del CD: " + title + "%n");
		cdToString += ("Duración :" + duration + " segundos" + "%n");
		cdToString += ("Canciones: " + "%n");
		for (Song song : songs) {
			cdToString += song + "%n";
		}
		return cdToString;
	}
}

