/*
Program to print following number pyramid:
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

public class numberPyramid {
    public static void main(String[] args) {
        int n = 5; // Defines the number of rows in the pyramid

        for (int i = 1; i <= n; i++) { // Outer loop to iterate through each row

            // Spaces before the numbers
            for (int j = 1; j <= (n - i); j++) { // Inner loop to print leading spaces to create the pyramid shape
                System.out.print(" ");
            }

            // Numbers in the pyramid
            for (int j = 1; j <= i; j++) { // Inner loop to print the current row number 'i' for 'i' times
                System.out.print(i + " "); // Print the row number followed by a space
            }

            System.out.println(); // Moves to the next line after printing each row
        }
    }
}
