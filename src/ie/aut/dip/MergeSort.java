package ie.aut.dip;

public class MergeSort {

	public static void sort(int[] arr) {
		// params: array and the two outer indexes
		mergeSort(arr, 0, arr.length - 1);
	}

	/*
	 * Recursively divides the array into halves. (Divide part)
	 * arr here is always the original array
	 * the two ints are the current indexes
	 */

	private static void mergeSort(int[] arr, int left, int right) {


		//Go down recursively until single elements remain
        if (left < right) {


        	//Current middle index
            int mid = (left + right) / 2;


			/*
			* The algorithm recursively divides into two halves.
			* First recursive call: left half of the current section
			*/ 
            mergeSort(arr, left, mid);


            //The same with the right half of the current section
            mergeSort(arr, mid + 1, right);


			/*
			 * When both recursive calls are ready,
			 * we can call the merge part on the actual level.
			 * So every recursive branch ends with a merge operation.
			 * Let’s say first the left and mid indexes are 0, and right is 1.
			 * (Conquer)
			 */            
            merge(arr, left, mid, right);
        }
    }

	/*
	 * It runs as a part of every recursion and merges two sorted halves.
	 */
	private static void merge(int[] arr, int left, int mid, int right) {


		//helper arrays for storing the current left and right sides
        int n1 = mid - left + 1;
        int n2 = right - mid;


        int[] L = new int[n1];
        int[] R = new int[n2];


        //Copy elements from the original array 
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];


        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

		/*
		* Index variables:
		* i -> current position in left array
		* j -> current position in right array
		* k -> current position in original array 
		* 
		* k starts from left because we overwrite
		* this current section of the original array 
		*/ 
        int i = 0, j = 0, k = left;


        //It runs while we have something in the helper arrays
        while (i < n1 && j < n2) {


			/*
			* If the left value is smaller (or equal),
			* place it into the original array.
			* Else: place the right value. 
			*/ 
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }


        //The last elements will be copied out
        while (i < n1) {
            arr[k++] = L[i++];
        }


        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
