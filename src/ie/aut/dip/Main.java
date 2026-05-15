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
		
		/*
		 * This was used for the individual graphs: // int[] sizes = { 100, 250, 500,
		 * 750, 1000, 1250, 1500, 1750, 2000, 2250, 2500, 2750, 3000 };
		 */	
		
		// I added a few warm-up values before the actual benchmarking
		int[] sizes = { 11, 19, 432, 16, 88, 100, 250, 500, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
		
		// Demonstration for small numbers
		//int[] sizes = { 11, 19, 432, 16, 88, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250 };

		// nr. of repetitions
		int repetitions = 300;

		// Table: with heading first, then the data
		System.out.printf("%-8s %-12s %-12s %-12s %-12s %-12s%n",
		        "Size", "Bubble", "Insertion", "Selection", "Merge", "Counting");

		// Loop through every input size
		for (int size : sizes) {

			double[] times = Benchmark.benchmarkAll(size, repetitions);
			// first row: the sizes, then the times with (%.5f) 5 decimal accuracy
			System.out.printf("%-8d %-12.3f %-12.3f %-12.3f %-12.3f %-12.3f%n",
			        size,
			        times[0],
			        times[1],
			        times[2],
			        times[3],
			        times[4]);
		}
	}
}
