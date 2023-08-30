/*
Java program to print following pattern.
Output:
           * 
         * * 
       * * * 
     * * * * 
   * * * * *

*/
public class LeftHalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
