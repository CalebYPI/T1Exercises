package arrays;
/**
 * 9. Write a Java program to shuffle a given array of integers.
 */
import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public static void shuffle(int[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {
            Random item = new Random();
            int j = item.nextInt(i + 1);
            swap(numbers, i, j);
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public static void main(String[] args) {
        int[] items = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original: " + Arrays.toString(items));
        shuffle(items);
        System.out.println("Shuffled Array: " + Arrays.toString(items));
    }
}
