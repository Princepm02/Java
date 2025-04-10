/*
 Program to print the following Hollow Butterfly Pattern:

 *        *
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 *        *
*/

public class hollowButterfly {
    public static void main(String[] args) {
        int n = 5;  // height of half the butterfly (number of rows in upper/lower parts)

        // Upper Part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing: print i characters, stars at borders, spaces inside
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");  // border of wing
                } else {
                    System.out.print(" ");  // hollow inside
                }
            }

            // Gap between wings: decreases as i increases
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing: mirror of left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");  // border of wing
                } else {
                    System.out.print(" ");  // hollow inside
                }
            }

            System.out.print("\n");  // move to next line
        }

        // Lower Part of the butterfly (mirror of upper)
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");  // border of wing
                } else {
                    System.out.print(" ");  // hollow inside
                }
            }

            // Gap between wings: increases as i decreases
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");  // border of wing
                } else {
                    System.out.print(" ");  // hollow inside
                }
            }

            System.out.print("\n");  // move to next line
        }
    }
}
