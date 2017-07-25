package rectangle;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		assertEquals(hasCycle(new int[]{1, 2, 0}), true);
		assertEquals(hasCycle(new int[]{3, 4, 1, -1, 2}), true);
		assertEquals(hasCycle(new int[]{3, 4, 1, -1, 2}), false);
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

		Boolean hasCycle = false;

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
		Integer index = position;
		List<Integer> dependencies = new ArrayList<>();

		dependencies.add(position);
		while (isCycle == false && array[index] != -1) {
			isCycle = dependencies.contains(array[index]);
			dependencies.add(array[index]);
			index = array[index];
		}
		return isCycle;
	}
}


















