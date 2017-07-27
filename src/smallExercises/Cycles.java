package smallExercises;


import java.util.ArrayList;
import java.util.List;

/*TODO: 1) COMENTAR (ME QUEDA MÁS CLARO AHORA, IGUAL NO LO HE ENTENDIDO BIEN!: Puedes hacer `return` en cualquier momento de un método, incluso dentro de un `for`. Prueba a hacerlo para ahorrarte las variables booleanas.
		FYI: Para valores primitivos, es mejor usar boolean, int, etc, siempre que sea posible (sólo es necesario en "genéricos" como `List<Integer>`). Verás que Java te convierte entre `int` y `Integer` automáticamente. (edited)
*/

public class Cycles {

	public static void main(String[] args) {

		assertEquals(hasCycle(new int[]{1, 2, 0}), true);
		assertEquals(hasCycle(new int[]{3, 4, 1, -1, 2}), true);
		assertEquals(hasCycle(new int[]{1, 2, 3, 4, 1}), true);
		assertEquals(hasCycle(new int[]{0, 0, 0, 0 , 1}), true);
		assertEquals(hasCycle(new int[]{1, 2, 3, 4 , -1}), false);
		assertEquals(hasCycle(new int[]{4, 4, 4, 4 , -1}), false);
		assertEquals(hasCycle(new int[]{1, -1, 3, -1 , -1}), false);
	}


	/**
	 * Throws an exception if the values are not equal
	 */
	static void assertEquals(Object actual, Object expected) {
		if (!actual.equals(expected)) {
			throw new RuntimeException("the actual value " + actual
					+ " is not equal to the expected " + expected);
		}
	}


	/**
	 * Returns true if there's a cycle in the indexes, and false otherwise.
	 * To explain a cycle here's an example:
	 * Suppose we have: a = {3, 4, 1, -1, 2}.
	 * It has a cycle in indexes 1,4,2 because:
	 * - a[1] contains 4
	 * - a[4] contains 2
	 * - a[2] contains 1
	 * - a[1] contains 4 (and so on...)
	 * <p>
	 * TODO: Could be more efficient if we track the checked positions
	 */
	static boolean hasCycle(int[] numbers) {

		boolean hasCycle = false;

		for (int i = 0; i < numbers.length && !hasCycle; i++) {
			hasCycle = isCycle(numbers, i);
		}
		return hasCycle;
	}

	/**
	 * Given an array of int and a position, it checks if this position is part of a cycle in the array
	 *
	 * @param array
	 * @param position
	 * @return true if arra[position] is part of a cycle, false otherwise.
	 */
	private static Boolean isCycle(int[] array, Integer position) {
		Boolean isCycle = false;
		int index = position;
		List<Integer> dependencies = new ArrayList<>();

		dependencies.add(position);
		while (!isCycle && array[index] != -1) {
			isCycle = dependencies.contains(array[index]);
			dependencies.add(array[index]);
			index = array[index];
		}
		return isCycle;
	}
}


















