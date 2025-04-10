/*
Program to print following number palindrome pyramid:
    1
   212
  32123
 4321234
543212345

*/

public class palindromePyramid {
    public static void main(String[] args) {
        int n = 5; // Defines the number of rows in the pyramid

        for (int i = 1; i <= n; i++) { // Outer loop to iterate through each row

            // Spaces before the numbers
            for (int j = 1; j <= (n - i); j++) { // Inner loop to print leading spaces to create the pyramid shape
                System.out.print(" ");
            }

            // First Part of the palindrome (descending numbers)
            for (int j = i; j >= 1; j--) { // Inner loop to print numbers in descending order from 'i' down to 1
                System.out.print(j);
            }

            // Second part of the palindrome (ascending numbers)
            for (int j = 2; j <= i; j++) { // Inner loop to print numbers in ascending order from 2 up to 'i'
                System.out.print(j);
            }

            System.out.println(); // Moves to the next line after printing each row
        }
    }
}
