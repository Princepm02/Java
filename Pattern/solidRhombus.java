/*
Program to print following solid rhombus pattern:
    *****
   *****
  *****
 *****
*****

*/

public class solidRhombus {
    public static void main(String[] args) {
        int n = 5; // Defines the number of rows and columns for the rhombus

        for (int i = 1; i <= n; i++) { // Outer loop to iterate through each row

            for (int j = 1; j <= (n - i); j++) { // Inner loop to print leading spaces, creating the slanted effect
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) { // Inner loop to print the stars for each row of the rhombus
                System.out.print("*");
            }

            System.out.println(); // Moves to the next line after printing each row
        }
    }
}
