package arrays;
/**
 * 1.	Write a Java program to find the maximum and minimum value of a 1-d array.
 * 
*/
import java.util.Random;

public class MaxMinValueFromArray {
    public static int maxValue(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }

    public static int minValue(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            int r = random.nextInt();
            list[i] = r;
            System.out.println("value " + i + " = " + r);
        }
        System.out.println("Maximum value is: " + maxValue(list));
        System.out.println("Minimum value is: " + minValue(list));
    }
}