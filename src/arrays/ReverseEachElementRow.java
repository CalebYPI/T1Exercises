package arrays;
/**
 * 2.	Write a Java program without using a second array to reverse elements of each row of a 2-d array of integer values. 
 * e.g.  	1    2    3     4			        4    3    2   1
 *	        5    6    7     8           =		8    7    6   5
 *          9    10   11   12			        12   11   10  9
 * 
*/
public class ReverseEachElementRow {
    public static void main(String[] args) {
        int[][] rowElement = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        System.out.println("\nNormal: \n");
        for (int i = 0; i < rowElement.length; i++) {
            for (int j = 0; j < rowElement.length + 1; j++)
                System.out.print(rowElement[i][j] + " ");
        }

        System.out.println(" \nReversed: \n");
        for (int i = rowElement.length - 1; i >= 0; i--) {
            for (int j = (rowElement.length + 1) - 1; j >= 0; j--)
                System.out.print(rowElement[i][j] + " ");
        }
    }
}
