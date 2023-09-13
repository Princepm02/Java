// This Java program takes an integer 'num' as input and prints the first 'num' even and odd numbers.

import java.util.*;

public class Odd_and_Even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count, i;
        
        // Taking user input for the number of even and odd numbers to generate
        System.out.println("Enter the number for N odd & N Even number : ");
        int num = sc.nextInt();

        // Generating and printing even numbers
        System.out.println(num +" Even Number : ");
        for (i = 0; i < num * 2; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.print(i + " ");
            }
        }

        // Generating and printing odd numbers
        System.out.println("\n\n"+num+" Odd Number : ");
        for (i = 0; i < num * 2; i++) 
        {
            if (i % 2 == 1) 
            {
                System.out.print(i + " ");
            }
        }

        /* Alternate Logic using While Loop:

        // Generating and printing even numbers using a while loop
        System.out.println(num +" Even Number : ");
        count = 0;
        i = 0;
        while (count < num) 
        {
            if (i % 2 == 0) 
            {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }

        // Generating and printing odd numbers using a while loop
        System.out.println("\n\n"+num+" Odd Number : ");
        count = 0;
        i = 0;
        while (count < num) 
        {
            if (i % 2 == 1) 
            {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }*/
    }
}
