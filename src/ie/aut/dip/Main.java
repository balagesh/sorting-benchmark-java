package ie.aut.dip;

/*
 * Entry point:
 * This class runs the benchmark for different input sizes
 * and prints the results as a simple table.
 */

public class Main {

	public static void main(String[] args) {

		/*
		 * The sorting algorithms will be benchmarked for each of these array sizes. And
		 * we need 10 repeated runs. I might go up to 100... See Table 1
		 */

		int[] sizes = { 100, 250, 500, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };

		// nr. of repetitions
		int repetitions = 10;

		// Table: with heading first, then the data
		System.out.println("Size\tBubble(ms)");

		// Loop through every input size
		for (int size : sizes) {

			double bubbleTime = Benchmark.benchmarkBubble(size, repetitions);
			// first row: the sizes, 2nd: the time, %.5f 5 decimal accuracy
			System.out.printf("%d\t%.5f%n", size, bubbleTime);
		}
	}
}
