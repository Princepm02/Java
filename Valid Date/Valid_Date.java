// This program will tell the user that the given date is valid date or not.
// Year should be 4 digit number

import java.util.*;

public class Valid_Date {
    public static void main(String args[]) {
        // Create an array to store day, month, and year
        int a[] = new int[3];
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter day, month, and year
        System.out.print("Enter Date : ");
        a[0] = sc.nextInt(); // Read day
        System.out.print("Enter Month : ");
        a[1] = sc.nextInt(); // Read month
        System.out.print("Enter Year : ");
        a[2] = sc.nextInt(); // Read year
        
        // Check if the entered date is valid
        if ((a[0] > 0 && a[0] <= 31) && 
            (a[1] == 1 || a[1] == 3 || a[1] == 5 || a[1] == 7 || a[1] == 8 || a[1] == 10 || a[1] == 12) && 
            (a[2] > 999 && a[2] < 10000)) {
            // Print validation result
            System.out.println("Given date is Valid");
        }
        else if ((a[0] > 0 && a[0] <= 30) && 
                 (a[1] == 4 || a[1] == 6 || a[1] == 9 || a[1] == 11) && 
                 (a[2] > 999 && a[2] < 10000)) {
            // Print validation result
            System.out.println("Given date is Valid");
        }
        else if ((a[1] == 2) && (a[0] > 0 && a[0] <= 29) && (a[2] % 4 == 0)) {
            // Print validation result
            System.out.println("Given date is Valid");
        }
        else if ((a[1] == 2) && (a[0] > 0 && a[0] < 29) && (a[2] % 4 == 1)) {
            // Print validation result
            System.out.println("Given date is Valid");
        }
        else {
            // Print validation result
            System.out.println("Given date is NOT Valid!!!!!");
        }
    }
}
