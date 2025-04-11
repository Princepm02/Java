
/*
Problem Statement:
Write a program to print the elements of a given matrix in a spiral order.
The spiral order starts from the top-left element and proceeds in a clockwise manner.

Sample Matrix (5 rows, 6 columns):
1  2  3  4  5  6
7  8  9 10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30

Sample Output:
1 2 3 4 5 6 12 18 24 30 29 28 27 26 25 19 13 7 8 9 10 11 17 23 22 21 20 14 15 16
*/
import java.util.Scanner;

public class spiralOrderMatrix {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter rows of matrix : ");
      int rows = sc.nextInt();
      System.out.print("Enter columns of matrix : ");
      int cols = sc.nextInt();

      int mat[][] = new int[rows][cols];

      System.out.println("Enter Values of matrix : ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(String.format("Mat[%d][%d] : ", i, j));
            mat[i][j] = sc.nextInt();
         }
      }

      System.out.println("\nGiven Matrix : ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(mat[i][j] + " ");
         }
         System.out.println();
      }

      // Initialize boundaries for spiral traversal
      int rowStart = 0;
      int rowEnd = rows - 1;
      int colStart = 0;
      int colEnd = cols - 1;

      System.out.print("Spiral Order of matrix : ");
      // Continue as long as there are elements within the boundaries
      while (rowStart <= rowEnd && colStart <= colEnd) {
         // Traverse Right: Print elements of the top row from left to right
         for (int col = colStart; col <= colEnd; col++) {
            System.out.print(mat[rowStart][col] + " ");
         }
         rowStart++; // Move the top boundary down

         // Traverse Down: Print elements of the rightmost column from top to bottom
         for (int row = rowStart; row <= rowEnd; row++) {
            System.out.print(mat[row][colEnd] + " ");
         }
         colEnd--; // Move the right boundary left

         // Traverse Left: Print elements of the bottom row from right to left
         if (rowStart <= rowEnd) { // Check if there are still rows to traverse
            for (int col = colEnd; col >= colStart; col--) {
               System.out.print(mat[rowEnd][col] + " ");
            }
            rowEnd--; // Move the bottom boundary up
         }

         // Traverse Up: Print elements of the leftmost column from bottom to top
         if (colStart <= colEnd) { // Check if there are still columns to traverse
            for (int row = rowEnd; row >= rowStart; row--) {
               System.out.print(mat[row][colStart] + " ");
            }
            colStart++; // Move the left boundary right
         }
      }

      sc.close();
   }
}
