// Generating Fibonacci series using BigIntegers

import java.math.BigInteger;
import java.util.*;

public class Fibbo_BigInt {
    public static void main(String[] args) 
    {
        // Initialize two BigInteger variables A and B to represent the first two numbers in the Fibonacci series
        BigInteger A, B; 
        A = BigInteger.valueOf(0);
        B = BigInteger.valueOf(1);
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements they want in the Fibonacci series
        System.out.println("Enter the number of elements you want in Fibonacci series: ");
        int n = sc.nextInt();  // Read the user's input
        
        // Print a message to indicate the beginning of the Fibonacci series
        System.out.println("Fibonacci series:");
        
        // Print the first two numbers in the Fibonacci series (A and B)
        System.out.print(A + " " + B);
        
        // Generate and print the remaining numbers in the Fibonacci series using a loop
        for (int i = 0; i < n - 2; i++) 
        {
            // Calculate the next number in the Fibonacci series by adding A and B
            BigInteger C = A.add(B); 
            
            // Print the next number
            System.out.print(" " + C);
            
            // Update the values of A and B for the next iteration
            A = B;
            B = C;
        }
    }
}
