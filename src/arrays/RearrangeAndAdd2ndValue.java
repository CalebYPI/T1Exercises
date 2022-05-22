package arrays;
/**
 * 7. Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.
 */
import java.util.Arrays;

public class RearrangeAndAdd2ndValue {

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void sortArrayItems(int[] numbers) {
        for (int i = 1 ; i < numbers.length; i += 2) {
            if (numbers[i - 1] > numbers[i])
                swap(numbers, i - 1, i);
            if (i + 1 < numbers.length && numbers[i + 1] > numbers[i])
                swap(numbers, i + 1, i);
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        System.out.println("Original:\n" + Arrays.toString(numbers));
        sortArrayItems(numbers);
        System.out.println("Array with every second element is greater than its left and right elements:\n" + Arrays.toString(numbers));
    }
}
