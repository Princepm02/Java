/* This Java program takes user input to create a 2D matrix, where the user specifies the number of rows and columns. 
It then prompts the user to enter matrix values and stores them in the 2D array 'a'. 
The program also checks for zero values in the matrix and asks the user to re-enter non-zero values if zeros are detected. 
Finally, it prints the updated matrix after all the modifications.*/

import java.util.*;

public class Condition_2d_Array {
    public static void main(String args[]) {
        int i, j, r1, c1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row matrix : ");
        r1 = sc.nextInt();
        System.out.println("Enter the no. of Column matrix : ");
        c1 = sc.nextInt();

        int a[][] = new int[r1][c1]; // Create a 2D array 'a' with dimensions r1 x c1 to store matrix values.

        System.out.println("Enter "+r1*c1+" values of Matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt(); // Input matrix elements and store them in the array 'a'.
            }
        }

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                if(a[i][j]==0)
                {
                    System.out.println("Enter the value of again for a["+i+"]["+j+"] as it can't be zero : ");
                    a[i][j]=sc.nextInt(); // If any element in the matrix is zero, prompt the user to input a non-zero value and update the array 'a'.
                }
            }
        }

        System.out.println("Matrix after Updation : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+" "); // Print the updated matrix after all the modifications.
            }
            System.out.println();
        }
    }
}
