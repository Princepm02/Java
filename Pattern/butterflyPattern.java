/*
Program to print following Butterfly Pattern

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/
public class butterflyPattern {
    public static void main(String[] args) {
        int n = 4; // Defines the number of rows/columns for the upper/lower triangles

        // Upper Part of the butterfly
        for (int i = 1; i <= n; i++) { // Outer loop to iterate through rows of the upper part
            for (int j = 1; j <= i; j++) { // Inner loop to print increasing number of stars on the left side
                System.out.print("*");
            }

            int spaces = 2 * (n - i); // Calculates the number of spaces in the middle
            for (int j = 1; j <= spaces; j++) { // Inner loop to print the spaces in the middle
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // Inner loop to print increasing number of stars on the right side
                System.out.print("*");
            }

            System.out.print("\n"); // Moves to the next line after printing each row
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) { // Outer loop to iterate through rows of the lower part in reverse order
            for (int j = i; j >= 1; j--) { // Inner loop to print decreasing number of stars on the left side
                System.out.print("*");
            }

            int spaces = 2 * (n - i); // Calculates the number of spaces in the middle
            for (int j = spaces; j >= 1; j--) { // Inner loop to print the spaces in the middle
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) { // Inner loop to print decreasing number of stars on the right side
                System.out.print("*");
            }

            System.out.print("\n"); // Moves to the next line after printing each row
        }
    }
}
