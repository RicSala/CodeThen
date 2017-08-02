package interfaceExercise;

import library.Author;
import library.Book;
import library.Chapter;

public class MarkdownBookPrinter implements BookInterface {

	@Override
	public String bookToString(Book book) {
		String htmlBook = "";

		htmlBook += "#" + book.getTitle() + "  ";
		for (Author author : book.getAuthors()) {
			htmlBook += "##" + author.toString() + "  ";
		}

		for (Chapter chapter: book.getChapters()) {
			htmlBook += "*" + chapter.getTitle() + "  ";
		}

		return htmlBook;

	}

	@Override
	public String getFormat() {
		return "markdown";
	}
}
