package arrays;
/**
 * 3. Write a java program to print the Pascal’s Triangle using a 2-d array
 * 
*/
public class PascalTriangle2DArray {
    public static void main(String[] args) {
        int rows = 10;
        int[][] a = new int[50][50];
        int i = 0;
        int j = 0;
        int spaces = rows - 1;

        for (i = 0; i < rows; i++) 
            a[i][i] = a[i][0] = 1;
        
        for (i = 0; i < rows; i++) {
            for (j = 1; j < i; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < spaces; j++) {
                System.out.print("");
            }
            for (j = 0; j <= i; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            spaces--;
        }
        System.out.println();
    }
}