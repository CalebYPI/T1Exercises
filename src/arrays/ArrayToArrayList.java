package arrays;
/**
 * 4. Write a java program to convert an array to ArrayList and an ArrayList to an array.
 * 
*/
import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8};

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Array to ArrayList");
        for (Integer number: nums) {
            list.add(number);
            System.out.println(list + " ");
        }

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(3);
        newList.add(5);
        newList.add(7);

        Integer[] array = new Integer[list.size()];
        System.out.println("ArrayList to Array");
        array = newList.toArray(array);

        for (Integer item: array) {
            System.out.print(item + " ");
        }
    }
}
