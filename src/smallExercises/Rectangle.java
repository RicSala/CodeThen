package smallExercises;

/*FYI: - Usar `\n` como te he dicho.
*/

public class Rectangle {
	public static void main(String[] args) {
		assertEquals(drawRectangle("*", 3, 5), "*****\n*****\n*****\n");
		assertEquals(drawRectangle("*", 4, 4), "****\n****\n****\n****\n");
		assertEquals(drawRectangle("*", 0, 0), "");
		assertEquals(drawRectangle("*", 0, 1), "");
		assertEquals(drawRectangle("*", 1, 0), "");
		assertEquals(drawRectangle("*", 1, 100), "****************************************************************************************************\n");
	}


	/**
	 * FUNCTION: draw a smallExercises with a String
	 * @param s String used
	 * @param rows # of rows
	 * @param columns # of columns
	 * @return a String containing the smallExercises (print with printf)
	 */
	private static String drawRectangle(String s, int rows, int columns){
		String rectangle = "";
		if (rows != 0 && columns != 0) {
			rectangle = rectangle(s, rows, columns);
			System.out.printf(rectangle);
			System.out.printf("\n");
		}
		return rectangle;

	}

	/**
	 * FUNCTION: returns a smallExercises with a string.
	 * @param s String used
	 * @param rows # of rows
	 * @param columns # of columns
	 * @return a String containing the smallExercises (print with printf)
	 */
	private static String rectangle (String s,int rows, int columns){

		String rectangle = "";
		for (int i = 0; i < rows; i++) {
			rectangle += repeateString(s, columns);
			rectangle += "\n";
		}
		return rectangle;
	}

	/**
	 * FUNCTION: Given a string, it returns the String repeated n times
	 * @param s
	 * @param times
	 * @return times times the s String
	 */
	private static String repeateString (String s,int times){

		String line = "";
		for (int i = 0; i < times; i++) {
			line += s;
		}
		return line;
	}

	/** Throws an exception if the values are not equal */
	static void assertEquals(Object actual, Object expected) {
		if ( ! actual.equals(expected) ) {
			throw new RuntimeException("the actual value " + actual
					+ " is not equal to the expected " + expected);

		}
	}




}