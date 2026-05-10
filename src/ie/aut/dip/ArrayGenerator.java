package ie.aut.dip;

import java.util.Random;

public class ArrayGenerator {
	 private static final Random random = new Random();

	    public static int[] generateRandomArray(int size) {
	        int[] arr = new int[size];

	        for (int i = 0; i < size; i++) {
	            arr[i] = random.nextInt(100000);
	        }

	        return arr;
	    }

}
