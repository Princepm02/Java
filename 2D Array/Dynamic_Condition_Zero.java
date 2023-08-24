/*
1. User is prompted to enter the number of rows in the matrix.
2. User is prompted to enter the number of columns in the matrix.
3. A 2D array 'a' is created to store the matrix values.
4. The program prompts the user to enter matrix values one by one.
5. Using nested loops, the program reads and processes each matrix element:
    - If the input value is not zero, it's directly stored in the matrix.
    - If the input value is zero, a loop prompts the user until a non-zero value is entered.
6. After all matrix values are read and processed, the program prints the updated matrix.
7. The final nested loops iterate through the matrix and print its elements, row by row.

The program ensures that no zero value is stored in the matrix by continuously prompting the user for non-zero values if necessary.
*/

import java.util.*;

public class Dynamic_Condition_Zero {
    public static void main(String args[]) {
        int i, j, r1, c1, temp; // Declare variables for matrix dimensions, loop counters, and temporary value storage
        Scanner sc = new Scanner(System.in); // Initialize a scanner to read user input
        System.out.println("Enter the no. of row matrix : ");
        r1 = sc.nextInt(); // Read the number of rows from the user
        System.out.println("Enter the no. of Column matrix : ");
        c1 = sc.nextInt(); // Read the number of columns from the user

        int a[][] = new int[r1][c1]; // Declare a 2D array to store the matrix values

        System.out.println("Enter "+r1*c1+" values of Matrix : ");
        for(i=0;i<r1;i++) {
            for(j=0;j<c1;j++) {
                temp = sc.nextInt(); // Read a value from the user
                if(temp != 0) { // If the value is not zero
                    a[i][j] = temp; // Store the value in the matrix
                } else { // If the value is zero
                    while(true) {
                        System.out.println("Value can't be Zero!!! Enter non-zero value : "); 
                        temp = sc.nextInt(); // Read a new value from the user
                        if(temp != 0) { // If the new value is non-zero
                            a[i][j] = temp; // Store the new value in the matrix
                            break; // Exit the loop
                        }
                    }
                }
            }
        }

        System.out.println("Matrix after Updation : ");
        for(i=0;i<r1;i++) {
            for(j=0;j<c1;j++) {
                System.out.print(a[i][j]+" "); // Print the matrix elements
            }
            System.out.println(); // Move to the next row
        }
    }
}
