package library;

public class Chapter {
	private final String title;
	private final int page;
	private final int numberOfPages;

	public Chapter(String title, int page, int numberOfPages) {
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
