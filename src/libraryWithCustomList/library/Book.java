package libraryWithCustomList.library;

import customList.ElementList;

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

	private ElementList authors;
	private String title;
	private ElementList chapters;

	public Book(ElementList authors, String title, ElementList chapter) {
		this.authors = authors;
		this.title = title;
		this.chapters = chapter;
	}

	/**
	 * @return the number of pages of the instance
	 */
	public int getPages() {
		int pages = 0;
		for (int i = 0; i < chapters.size() - 1; i++) {
			Chapter chapter = (Chapter) chapters.getElement(i).getObject();  //Todo: ¿Cómo puedo hacer para evitarme este cast? Sino, no reconoce numberOfPages.
			pages += chapter.getNumberOfPages();
		}
		return pages;
	}

	/**
	 * @return a nice formatted String with the authors of the instances :)
	 */
	public String authorsToString() {
		String authorsString = "";

		for (int i = 0; i < authors.size() - 1; i++) {
			Author author = (Author) authors.getElement(i).getObject();
			authorsString += author.toString();
		}
		return authorsString;
	}

	/**
	 *
	 * @return A nice formatted String with information about the instance (Title, authors, chapters & number of pages)
	 */
	@Override
	public String toString() {
		String bookOverview;

		bookOverview = "Title: " + title + "%n%n";
		bookOverview += "Authors information: %n";
		bookOverview += "--------------------%n%n";
		bookOverview += authorsToString() + "%n%n%n";
		bookOverview += "Table of contents:%n";
		bookOverview += "-----------------%n%n";
		for (int i = 0; i < chapters.size() - 1; i++) {
			Chapter chapter = (Chapter) chapters.getElement(i).getObject();
			bookOverview += + (i + 1) + " - " + chapter.getTitle() + ": page " + chapter.getPage() + " || Contains " + chapter.getNumberOfPages() + " pages %n";
		}
		bookOverview += "%n%nThe book has " + getPages() + " pages in total";
	return String.format(bookOverview);
	}

}
