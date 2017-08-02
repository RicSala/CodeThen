package interfaceExercise;

import library.Book;

public interface BookInterface  {

	/**
	 * @param book
	 * @return a String with the main book content
	 */
	String bookToString(Book book);

	/**
	 * @return the format in which the output is printted in the "bookToString" method
	 */
	String getFormat();

}
