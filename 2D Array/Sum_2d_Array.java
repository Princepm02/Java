/*
- User can input the dimensions (rows and columns) and elements of two matrices.
- The program performs addition of corresponding elements from the two matrices.
- It then displays the resulting matrix, which represents the sum of the input matrices.
- Before adding matrices, the program checks if their dimensions are the same.
- If the dimensions are not the same, the program repeatedly prompts the user for valid dimensions.
*/

import java.util.*;

public class Sum_2d_Array {
    public static void main(String args[]) {
        int i, j, r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        
        // Continuously prompt the user to enter matrix dimensions until they match for both matrices.
        while (true) {
            System.out.println("Enter the no. of row First matrix : ");
            r1 = sc.nextInt();
            System.out.println("Enter the no. of Column First matrix : ");
            c1 = sc.nextInt();

            System.out.println("Enter the no. of row Second matrix : ");
            r2 = sc.nextInt();
            System.out.println("Enter the no. of Column Second matrix : ");
            c2 = sc.nextInt();

            if (r1 == r2 && c1 == c2) {
                // If dimensions match, exit the loop.
                break;
            } else {
                System.out.println("Number of Rows and columns should be the same for both matrices! Enter the values again.");
            }
        }
        
        int a[][] = new int[r1][c1]; // Create a 2D array 'a' to store the first matrix.
        int b[][] = new int[r2][c2]; // Create a 2D array 'b' to store the second matrix.
        int c[][] = new int[r1][c1]; // Create a 2D array 'c' to store the result of matrix addition.

        System.out.println("Enter "+r1*c1+" values of First Matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt(); // Input matrix elements for the first matrix.
            }
        }

        System.out.println("Enter "+r2*c2+" values of Second Matrix : ");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt(); // Input matrix elements for the second matrix.
            }
        }

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                c[i][j]= a[i][j] + b[i][j]; // Calculate the sum of corresponding elements from both matrices and store in 'c'.
            }
        }

        System.out.println("Addition of the arrays");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" "); // Print the resulting sum matrix.
            }
            System.out.println();
        }
    }
}
