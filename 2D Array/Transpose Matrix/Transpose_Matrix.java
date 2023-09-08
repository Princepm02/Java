/*
- Takes input for the number of rows and columns for a matrix.
- Creates a 2D array to store the matrix elements.
- Accepts input values for the matrix.
- Prints the original matrix.
- Calculates and prints the transpose of the matrix, swapping rows and columns.
*/

import java.util.*;

public class Transpose_Matrix {
    public static void main(String args[]) {
        int i, j, r, c;
        Scanner sc = new Scanner(System.in);
        
        // Input the number of rows and columns for the matrix.
        System.out.println("Enter the no. of row matrix : ");
        r = sc.nextInt();
        System.out.println("Enter the no. of Column matrix : ");
        c = sc.nextInt();
        int a[][] = new int[r][c]; // Create a 2D array 'a' to store the matrix.

        // Input matrix values.
        System.out.println("Enter " + r * c + " values of Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt(); // Input matrix elements and store them in array 'a'.
            }
        }

        // Display the original matrix.
        System.out.println("Given Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j]+" "); // Print matrix elements.
            }
            System.out.println();
        }

        // Display the transpose of the matrix.
        System.out.println("Transpose of Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[j][i]+" "); // Print elements with rows and columns swapped.
            }
            System.out.println();
        }
    }
}
