import java.util.*;

public class Calling_Function {
    public static void main(String args[]) 
    {
        System.out.println("Sorting of Array");
        Sorting();
    }

    public static void Sorting()
    {
        int n,i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+" elements of array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
