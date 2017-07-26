package CdPlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
	private String style;
	private String title;
	private String artist;
	private int duration;
	static private final List<String> AVAILABLE_STYLES = new ArrayList<>(Arrays.asList("Rock", "Pop", "House", "Indie", "Classical", "Punk", "Popular"));

	/**
	 * Constructor
	 * @param style of music
	 * @param title of the song
	 * @param artist author of the song
	 * @param duration of the song
	 * @throws IOException when the style does not match any of the available styles
	 */
	public Song(String style, String title, String artist, int duration) throws IOException {

		if (!AVAILABLE_STYLES.contains(style)) {
			throw new IOException("¡Tienes que elegir un estilo de música de los disponibles!");
		}

		this.style = style;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}



	//----------GETTERs--------//
	public int getDuration() {
		return duration;
	}

	public String getStyle() {
		return style;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public static List<String> getAvailableStyles() {
		return AVAILABLE_STYLES;
	}

	//---------END OF GETTERs-------//


	@Override
	public String toString() {
		return title + " by " + artist + " | Duration: " + duration + " seconds ";
	}


}
