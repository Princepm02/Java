/*
 Program to print the following Hollow Rhombus pattern:
    *****
   *   *
  *   *
 *   *
*****
*/

public class hollowRhombus {
    public static void main(String[] args) {
        int n = 5; // size of the rhombus (number of rows and columns)

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to create the slanted side
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print columns of the rhombus
            for (int j = 1; j <= n; j++) {
                // Print star on borders (first/last column or first/last row)
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // hollow interior
                }
            }

            System.out.println(); // move to next line after each row
        }
    }
}
