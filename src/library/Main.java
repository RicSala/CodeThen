package library;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Author> authors;
		List<Chapter> chapters;


		authors = createSomeAuthors(); //in a serious program this shouldn't be here! :P
		chapters = createSomeChapters(); //idem
		Book book = new Book(authors,"Aprendiendo a programar", chapters);
		System.out.println(book);




	}

	private static List<Chapter> createSomeChapters() {
		List<Chapter> chapters = new ArrayList<>();

		Chapter chapter = new Chapter("Introducción a la programación", 2, 30);
		chapters.add(chapter);
		chapter = new Chapter("Programación orientada a objetos", 2, 30);
		chapters.add(chapter);
		chapter = new Chapter("Introducción a Java", 2, 30);
		chapters.add(chapter);

		return chapters;
	}

	private static List<Author> createSomeAuthors() {
		List<Author> authors = new ArrayList<>();

		Author author = new Author("Ricardo", "11 de marzo del 86", "Barcelona");
		authors.add(author);
		author = new Author("Javier", "11 de marzo del 86", "Barcelona");
		authors.add(author);
		author = new Author("Ferran", "11 de marzo del 86", "Barcelona");
		authors.add(author);

		return authors;
	}

}
