package library;

import java.util.List;

public class Book {

	/*Cread las clases Book y Chapter. Book tendrá author (o si queréis complicarlo, authors), title y chapters (una List
	de chapters). Chapter tendrá title y page. Book tendrá un método que devolverá el número total de páginas del libro, y
	en su método toString retornará los datos del libro junto a los títulos de capítulos junto con su número de páginas,
	por ejemplo así:

    Head First Java
    by Kathy Sierra
    1 - Breaking the Surface: page 1
    2 - A Trip to Objectville: page 27
    3 - Know Your Variables: page 49
    etc.

	 */
	List<Author> authors;
	String title;
	List<Chapter> chapters;

	public Book(List<Author> authors, String title, List<Chapter> chapter) {
		this.authors = authors;
		this.title = title;
		this.chapters = chapter;
	}

	public int getPages() {
		int pages = 0;
		for (Chapter chapter : chapters) {
			pages += chapter.getNumberOfPages();
		}
		return pages;
	}

	public String authorsToString() {
		String authorsString = "";

		for (Author author : authors) {
			authorsString += author.toString();
		}
		return authorsString;
	}

	@Override
	public String toString() {
		String bookOverview = "";

		bookOverview = "Title: " + title + "%n%n";
		bookOverview += "Authors information: %n";
		bookOverview += "--------------------%n%n";
		bookOverview += authorsToString() + "%n%n%n";
		bookOverview += "Table of contents:%n";
		bookOverview += "-----------------%n%n";
		for (Chapter chapter : chapters) {
			bookOverview += + (chapters.indexOf(chapter) + 1) + " - " + chapter.getTitle() + ": page " + chapter.getPage() + " || Contains " + chapter.getNumberOfPages() + " pages %n";
		}
		bookOverview += "%n%nThe book has " + getPages() + " pages in total";
	return String.format(bookOverview);
	}

}
