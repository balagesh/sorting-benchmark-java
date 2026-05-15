package ie.aut.dip;

/*
 * This class benchmarks the 5 sorting algorithms
 * with the same original input array.
 */
public class Benchmark {

	/*
	 * Benchmarks the algorithms size: size of input array reps: 
	 * number of repeated runs
	 * Returns: array of average execution times in ms
	 */
	public static double[] benchmarkAll(int size, int reps) {

		double bubbleTotal = 0;
		double selectionTotal = 0;
		double insertionTotal = 0;
		double mergeTotal = 0;
		double countingTotal = 0;

		// Repeat benchmark 'reps' times.
		for (int i = 0; i < reps; i++) {

			// The original random array will be copied for the algorithms.
			int[] original = ArrayGenerator.randomArray(size);

			// Bubble Sort
			int[] bubbleArr = ArrayGenerator.copyArr(original);

			long start = System.nanoTime();
			BubbleSort.sort(bubbleArr);
			long end = System.nanoTime();

			bubbleTotal += (end - start) / 1_000_000.0;
			
			// Insertion Sort
			int[] insertionArr = ArrayGenerator.copyArr(original);

			start = System.nanoTime();
			InsertionSort.sort(insertionArr);
			end = System.nanoTime();

			insertionTotal += (end - start) / 1_000_000.0;

			// Selection Sort
			int[] selectionArr = ArrayGenerator.copyArr(original);

			start = System.nanoTime();
			SelectionSort.sort(selectionArr);
			end = System.nanoTime();

			selectionTotal += (end - start) / 1_000_000.0;

			// Merge Sort
			int[] mergeArr = ArrayGenerator.copyArr(original);

			start = System.nanoTime();
			MergeSort.sort(mergeArr);
			end = System.nanoTime();

			mergeTotal += (end - start) / 1_000_000.0;

			// Counting Sort
			int[] countingArr = ArrayGenerator.copyArr(original);

			start = System.nanoTime();
			CountingSort.sort(countingArr);
			end = System.nanoTime();

			countingTotal += (end - start) / 1_000_000.0;
		}
		
		//Return average times.
		return new double[] { bubbleTotal / reps, insertionTotal / reps, selectionTotal / reps, mergeTotal / reps, countingTotal / reps };
	}
}