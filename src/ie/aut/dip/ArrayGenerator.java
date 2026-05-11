package ie.aut.dip;

/*This class creates the input random integer (0-99) arrays.
*Based on the provided code.
*/

public class ArrayGenerator {

	/*
	 * n: required number of elements
	 */

	public static int[] randomArray(int n) {

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		return array;
	}

	/*
	 * Creates and returns a copy of the source array. arraycopy: copy every element
	 * from src into dest. (Object src, int srcIndex, Object dest, int destIndex,
	 * int len)
	 */

	public static int[] copyArr(int[] src) {
		int[] dest = new int[src.length];

		System.arraycopy(src, 0, dest, 0, src.length);

		return dest;
	}
}
