package arrays;
/**
 * 5. Write a java program to arrange the elements of a given array of integers where all negative integers appear before all the positive integers.
 * 
*/
import java.util.Random;

public class NegativeToPositive {

    public static void sort(int[] array, int number) {
        int j =0;
        int temp;

        for (int i = 0; i < number; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }

    public static void display(int[] array, int number) {
        for (int i = 0; i < number; i++)
            System.out.print(array[i] + " ");
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[10];
        int size = list.length;

        for (int i = 0; i < size; i++) {
            int r = random.nextInt();
            list[i] = r;
            System.out.println("value " + i + " = " + r);
        }
        
        sort(list, size);
        display(list, size);
    }
}
