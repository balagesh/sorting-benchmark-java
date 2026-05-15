package ie.aut.dip;

public class SelectionSort {

	/*
	 * Repeatedly finds the minimum element and places it at the beginning.
	 */
	public static void sort(int[] arr) {

		int n = arr.length;

		/*
		 * The outer loop moves through the array from left to right.
		 * Each iteration selects the position 
		 * where the next smallest element will be placed.
		 */

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;

			/*
			 * The inner loop searches for the smallest element 
			 * in the unsorted part of the array (from i+1 to the end).
			 * 
			 * It does NOT move elements, it only finds the
			 * index of the smallest value.
			 */

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			/*
			 * The actual swap happens here:
			 * current element with the smallest minIndex
			 * minIndex contains the position of the smallest element.
			 */
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
