/*
Program to print following daimond pattern:
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/

public class diamondPattern {
    public static void main(String[] args) {
        int n = 5; // Defines the number of rows for the upper part of the diamond

        // Upper Part of the diamond
        for (int i = 1; i <= n; i++) { // Outer loop to iterate through rows of the upper part
            // Spaces before the stars
            for (int j = 1; j <= (n - i); j++) { // Inner loop to print leading spaces to create the diamond shape
                System.out.print(" ");
            }

            // Stars in the upper part
            for (int j = 1; j <= ((2 * i) - 1); j++) { // Inner loop to print increasing number of stars in each row
                System.out.print("*");
            }

            System.out.println(); // Moves to the next line after printing each row
        }

        // Lower part of the diamond
        for (int i = n; i >= 1; i--) { // Outer loop to iterate through rows of the lower part in reverse order
            // Spaces before the stars
            for (int j = 1; j <= (n - i); j++) { // Inner loop to print leading spaces for the lower part
                System.out.print(" ");
            }

            // Stars in the lower part
            for (int j = 1; j <= ((2 * i) - 1); j++) { // Inner loop to print decreasing number of stars in each row
                System.out.print("*");
            }

            System.out.println(); // Moves to the next line after printing each row
        }
    }
}
