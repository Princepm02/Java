import java.util.*;

public class Return_Value {
    public static void main(String args[]) 
    {
        int i,n;
        System.out.println("Sorting of Array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+" elements of array : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        int[] s_Arr=Sorting(arr,n);

        System.out.println("Sorted array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(s_Arr[i]+" ");
        }
    }


    public static int[] Sorting(int[] arr, int n)
    {
        int i,j,temp;
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
        return arr;
    }
}
