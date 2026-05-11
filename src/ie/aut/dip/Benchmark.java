package ie.aut.dip;

public class Benchmark {

	/*
	 * Benchmarks Bubble Sort.
	 * Parameters: size -> input array size reps -> number of repetitions
	 * Returns: average execution time in milliseconds
	 */

	public static double benchmarkBubble(int size, int reps) {

		double total = 0;

		/*
		 * The original random array. 
		 * Every repetition will sort a copy of this same input
		 */
		int[] original = ArrayGenerator.randomArray(size);

		/*
		 * Repeat the benchmark 'reps' times.
		 */
		for (int i = 0; i < reps; i++) {

			/*
			 * Create a fresh copy for this repetition.
			 */
			int[] cloned = ArrayGenerator.copyArr(original);

			long startTime = System.nanoTime();

			/*
			 * Run Bubble Sort.
			 */
			BubbleSort.sort(cloned);

			long endTime = System.nanoTime();
			long timeElapsed = endTime - startTime;
			double elapsedMillis = timeElapsed / 1000000.0;

			/*
			 * Add current run time to the total.
			 */
			total += elapsedMillis;
		}

		/*
		 * Return average execution time.
		 */
		return total / reps;
	}
}
