import java.util.*;

public class Odd_and_Even {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count,i;
        System.out.println("Enter the number for N odd & N Even number : ");
        int num=sc.nextInt();

        System.out.println("Even Number : ");
        for(i=0;i<num*2;i++)
        {
            if(i%2==0)
            {
            System.out.print(i+" ");
            }
        }

        System.out.println("\nOdd Number : ");
        for(i=0;i<num*2;i++)
        {
            if(i%2==1)
            {
            System.out.print(i+" ");
            }
        }

        /*System.out.println("Even Number : ");
        count=0;
        i=0;
        while(count<num)
        {
            if(i%2==0)
            {
                count++;
                System.out.print(i+" ");
                i++;
            }
            else 
                i++;
        }

        System.out.println("\nOdd Number : ");
        count=0;
        i=0;
        while(count<num)
        {
            if(i%2==1)
            {
                count++;
                System.out.print(i+" ");
                i++;
            }
            else 
                i++;
        }*/
    }
}
