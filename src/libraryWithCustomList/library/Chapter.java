package library;

public class Chapter {
	private final String title; //Doy por hecho que, una vez creado un libro, no se puede modificar (es una hipótesis..)
	private final int page;
	private final int numberOfPages;

	public Chapter(String title, int page, int numberOfPages) { //TODO crear excepciones con libros con páginas negativas, etc.
		this.title = title;
		this.page = page;
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getPage() {
		return page;
	}

	public String getTitle() {
		return title;
	}
}
