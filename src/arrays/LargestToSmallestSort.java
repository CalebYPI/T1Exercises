package arrays;
/**
 * 8. Write a Java program to form the largest number from a given list of non-negative integers.
 */
import java.util.Arrays;

public class LargestToSmallestSort {

    public static String sort(int[] numbers) {
        String[] items = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(items, (String element1, String element2) -> (element2 + element1).compareTo(element1 + element2));
        return Arrays.stream(items).reduce((i, a) -> i.equals("0")?a:i+a).get();
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 0, 4, 6};
        System.out.println("\nOriginal: " + Arrays.toString(numbers));
        System.out.println("\nThe largest number using the said array numbers: " + sort(numbers));
    }
}
