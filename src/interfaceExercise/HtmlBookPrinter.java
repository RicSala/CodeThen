package interfaceExercise;

import library.Author;
import library.Book;
import library.Chapter;

public class HtmlBookPrinter implements BookPrinter {

	@Override
	public String bookToString(Book book) {
		String htmlBook = "";

		htmlBook += "<h1>" + book.getTitle() + "</h1>";         //TODO:     Comentar, ¿Debería partirlo en métodos? Estoy haciendo un sistema para pasar a html un Book, pero si lo parto sería más "exportable"
		for (Author author : book.getAuthors()) {               //Todo:     Por ejemplo, podría hacer métodos: heading1(), heading2(), etc.
			htmlBook += "<h2>" + author.toString() + "</h2>";
		}

		htmlBook += "<ol>";
		for (Chapter chapter: book.getChapters()) {
			htmlBook += "<li>" + chapter.getTitle() + "</li>";
		}
		htmlBook += "</ol>";

		return htmlBook;

	}

	@Override
	public String getFormat() {
		return "html";
	}
}
