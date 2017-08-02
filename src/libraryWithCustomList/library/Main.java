package libraryWithCustomList.library;

import customList.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A method just to use the newly created classes and debug their behaviour. Not usable.
 */
public class Main {

	public static void main(String[] args) {

		ElementList authors;
		ElementList chapters;


		authors = createSomeAuthors(); //in a serious program this shouldn't be here! :P
		chapters = createSomeChapters(); //idem
		Book book = new Book(authors,"Aprendiendo a programar", chapters);
		System.out.println(book);

	}

	private static ElementList createSomeChapters() { //This could be prompter to the user
		ElementList chapters = new ElementList();

		Chapter chapter = new Chapter("Introducción a la programación", 2, 22);
		chapters.add(chapter);
		chapter = new Chapter("Programación orientada a objetos", 2, 21);
		chapters.add(chapter);
		chapter = new Chapter("Introducción a Java", 2, 46);
		chapters.add(chapter);

		return chapters;
	}

	private static ElementList createSomeAuthors() { //This could be prompter to the user
		ElementList authors = new ElementList();

		Author author = new Author("Ricardo", new Date(531360000000L), "Barcelona");
		authors.add(author);
		author = new Author("Javier", new Date(531360000000L), "Barcelona");
		authors.add(author);
		author = new Author("Ferran", new Date(531360000000L), "Barcelona");
		authors.add(author);

		return authors;
	}

}
