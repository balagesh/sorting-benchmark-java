package ie.aut.dip;

public class CountingSort {

	public static void sort(int[] arr) {

		int max = getMax(arr);
		
		// Creates a helper array whose indexes go from 0 to the maximum value.
		int[] count = new int[max + 1];

		/*
		 * Count occurrences of each value
		 * and stores the frequency of each value
		 *  in the helper array.
		 */
		for (int num : arr) {
			count[num]++;
		}

		/*
		 * Rebuild the array in sorted order starting with index 0. 
		 * Overwrites the elements of the original array.
		 *
		 * The outer for loop goes through all possible values (0 to max). 
		 * For each value i, the inner while checks
		 * how many times that value appears (count[i]).
		 *
		 * While count[i] is greater than 0, the value i is written back into the
		 * original array at position 'index', and the index is increased by 1 each
		 * time.
		 */
		int index = 0;

		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[index++] = i;
				count[i]--;
			}
		}
	}

	/*
	 * Finds maximum value in array.
	 * Starts with the first element and updates it
	 * whenever a larger value is found.
	 */
	private static int getMax(int[] arr) {

		int max = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		return max;
	}
}
