package ie.aut.dip;

public class BubbleSort {
	public static void sort(int[] arr) {
		
		// I needed the length of the array for the loops
		int n = arr.length;

		/*
		 * Outer loop controls how many times we go through the array.
		 * The maximum is equal to n.
		 * After each turn, the largest unsorted element 
		 * "bubbles up" to its correct position at the end.
		 */

		for (int i = 0; i < n - 1; i++) {

			/*
			 * This flag shows if any swaps happened in this turn. If no swaps happen, the
			 * flag will remain false, meaning the array is already sorted.
			 */
			boolean swapped = false;

			/*
			 * Inner loop compares adjacent elements. The range shrinks each time because
			 * the last i elements are already sorted.
			 */
			for (int j = 0; j < n - i - 1; j++) {

				// If the current element is bigger than the next one, must be swapped.
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			/*
			 * If no swaps happened during the inner loop, the variable swapped remains
			 * false, so the array is already sorted.
			 */
			if (!swapped) {
				break;
			}
		}
	}
}
