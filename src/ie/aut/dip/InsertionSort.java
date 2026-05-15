package ie.aut.dip;

public class InsertionSort {

	/*
	 * Builds the sorted array one element at a time. 
	 * The left part of the array, from index 0 is sorted.
	 */
	public static void sort(int[] arr) {

		int n = arr.length;

		/*
		 * The outer loop selects the next element (key)
		 * and the sorted section of the array keeps growing. 
		 * It starts from index 1 because the first element (index 0) 
		 * is considered ‘already sorted’.
		 * The key is stored temporarily so it won't be lost during shifting.
		 */
		for (int i = 1; i < n; i++) {

			int key = arr[i];
			int j = i - 1;

			/*
			 * The inner while loop checks elements on the left side of the key.
			 * If an element is greater than the key, 
			 * it is moved one position to the right to make space for the key.
			 *  
			 * This is not swapping, practically at this moment, 
			 * the same value appears twice in the array and the original element (key) is not
			 * inserted yet; it is kept in memory.
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j]; // shift element one position to the right
				j--; // move to the left to check previous element
			}

			 //Insert key into correct position.
			arr[j + 1] = key;
		}
	}
}
