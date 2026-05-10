package ie.aut.dip;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * The sorting algorithms will be benchmarked for each of these array sizes.
		 * And we need 10 repeated runs.
		 * See Table 1
		 */
		int[] sizes = { 100, 250, 500, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };

		int repetitions = 10;
		
		//Table: with heading first, then the data
		System.out.println("Size\tBubble(ms)");

		// Loop through every input size
		for (int size : sizes) {
			//The method returns the average time.
			double bubbleTime = Benchmark.benchmarkBubble(size, repetitions);

			System.out.println(size + "\t" + bubbleTime);
		}
	}
}
