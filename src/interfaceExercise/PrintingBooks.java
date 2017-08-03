package interfaceExercise;


import library.Author;
import library.Book;
import library.Chapter;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintingBooks {
	public static void main(String[] args) throws FileNotFoundException {

		List<Chapter> chapters = createSomeChapters();
		List<Author> authors = createSomeAuthors();

		Book book = new Book(authors, "Aprendiendo a programar", chapters);

		BookPrinter htmlBookPrinter = new HtmlBookPrinter();

		System.out.println("Libro en " + htmlBookPrinter.getFormat() + "\n");
		System.out.println(htmlBookPrinter.bookToString(book));

		BookPrinter markdownBookPrinter = new MarkdownBookPrinter();

		System.out.println("\n\n\n");

		System.out.println("Libro en " + markdownBookPrinter.getFormat() + "\n");
		System.out.println(markdownBookPrinter.bookToString(book));





	}

	private static List<Chapter> createSomeChapters() { //This could be prompter to the user
		List<Chapter> chapters = new ArrayList<>();

		Chapter chapter = new Chapter("Introducción a la programación", 2, 22);
		chapters.add(chapter);
		chapter = new Chapter("Programación orientada a objetos", 2, 21);
		chapters.add(chapter);
		chapter = new Chapter("Introducción a Java", 2, 46);
		chapters.add(chapter);

		return chapters;
	}

	private static List<Author> createSomeAuthors() { //This could be prompter to the user
		List<Author> authors = new ArrayList<>();

		Author author = new Author("Ricardo", new Date(531360000000L), "Barcelona");
		authors.add(author);
		author = new Author("Javier", new Date(531360000000L), "Barcelona");
		authors.add(author);
		author = new Author("Ferran", new Date(531360000000L), "Barcelona");
		authors.add(author);

		return authors;
	}
}

