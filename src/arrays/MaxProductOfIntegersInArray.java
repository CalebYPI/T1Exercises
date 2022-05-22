package arrays;
/**
 * 10. Write a Java program to find the maximum product of two integers in a given array of integers.
 */
import java.util.Arrays;

public class MaxProductOfIntegersInArray {

    public static void maxProduct(int[] numbers) {
        int maxProduct = Integer.MIN_VALUE;
        int i_max = -1;
        int j_max = -1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i +1; j < numbers.length; j++) {
                if (maxProduct < numbers[i] * numbers[j]) {
                    maxProduct = numbers[i] * numbers[j];
                    i_max = i;
                    j_max = j;
                }
            }
        }
        System.out.println("Pair is (" + numbers[i_max] + ", " + numbers[j_max] + "), Maximum Product: " + (numbers[i_max]*numbers[j_max]));
    }

    public static void main(String[] args) {
        int[] items = { 2, 3, 5, 7, -7, 5, 8, -5 };
        System.out.println("Original: " + Arrays.toString(items));
        maxProduct(items);
    }
}