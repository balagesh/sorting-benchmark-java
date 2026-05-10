package ie.aut.dip;

public class Benchmark {

    public static double benchmarkBubble(int size, int repetitions) {
        long totalTime = 0;

        for (int i = 0; i < repetitions; i++) {

            // same original input for all algorithms
            int[] original = ArrayGenerator.generateRandomArray(size);

            // bubble gets its own copy
            int[] arr = original.clone();

            long start = System.nanoTime();
            BubbleSort.sort(arr);
            long end = System.nanoTime();

            totalTime += (end - start);
        }
        // Average time, conversion from nano to millis.
        return (totalTime / repetitions) / 1_000_000.0;
    }
}
