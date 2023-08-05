/*
The program first takes the input for 2 matrix from user and performing operation (+,-,*,/) according to user
Then, the program asks the user to select an option from the following:
 1.Lower Left Triangle (LLT)
 2. Lower Right Triangle (LRT)
 3.Upper Left Triangle (ULT)
 4. Upper Right Triangle (URT)

 for eg:
 1 2 3                         1
 4 5 6  then we are printing   4 5    it is Lower Left Triangle (LLT)
 7 8 9                         7 8 9
 */

import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows of matrix : ");
        r=sc.nextInt();
        System.out.println("Enter the number of column of matrix : ");
        c=sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("Enter the "+ r*c + " values of the matrix A : ");
        for(int i=0; i<r; i++)   
        {
            for(int j=0; j<c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Enter the "+ r*c + " values of the matrix B : ");
        for(int i=0; i<r; i++)   
        {
            for(int j=0; j<c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        } 

        System.out.println("Choose among +,-,*,/ :");
        char op;
        op=sc.next().charAt(0);

        int res[][] = new int[r][c];


        switch(op)
        {
            case '+': res=sum(a,b,r,c);
                      break;
            case '-': res=sub(a,b,r,c);
                      break;
            case '*': res=mul(a,b,r,c);
                      break;
            case '/': res=divide(a,b,r,c);
                      break;
        }

        System.out.println("\nEnter choice for printing results");
        System.out.println("1.Lower Left Triangle (LLT) \n2. Lower Right Triangle (LRT)");
        System.out.println("3.Upper Left Triangle (ULT) \n4. Upper Right Triangle (URT)");
        System.out.print("\nEnter your choice : ");
        int cho=sc.nextInt();

        switch (cho) 
        {
            case 1: for(int i=0; i<r; i++)   //LLT
                    {
                        for(int j=0; j<=i; j++)
                        {
                            System.out.print(res[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;

            case 2: for(int i=0; i<r; i++)   //LRT
                    {
                        for(int j=0; j<c; j++)
                        {
                            if(j >= c-i-1)
                            {
                                System.out.print(res[i][j]+" ");
                            }
                            else
                            {
                                System.out.print("  ");  // Two Spaces for correct alignment
                            }
                        }
                        System.out.println();
                    }
                    break;

            case 3: for(int i=0; i<r; i++)   //ULT
                    {
                        for(int j=0; j<c-i; j++)
                        {
                            System.out.print(res[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;

            case 4: for (int i = 0; i < r; i++) //URT
                    {
                        for (int j = 0; j < c ; j++) 
                        {
                            if(j >= i)
                            {
                                System.out.print(res[i][j]+" ");
                            }
                            else
                            {
                                System.out.print("  ");  // Two Spaces for correct alignment
                            }
                        }
                        System.out.println();
                    }
                    break;

        }
    }

    public static int[][] sum(int a[][],int b[][],int r,int c)
    {
        int sum[][] = new int[r][c];
        
        for(int i=0; i<r; i++)   
        {
            for(int j=0; j<c; j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum; 
    }

   public static int[][] sub(int a[][],int b[][],int r,int c)
    {
        int sub[][] = new int[r][c];
        
        for(int i=0; i<r; i++)   
        {
            for(int j=0; j<c; j++)
            {
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        return sub; 
    }

    public static int[][] mul(int a[][], int b[][], int r, int c) {
        System.out.println("Multiplication of matrix A and B : "); // Column of matrix A == Row of matrix B

        int m[][] = new int[r][c]; // In array of different row and column
        for (int i = 0; i < r; i++) // i < row of matrix A
        {
            for (int j = 0; j < c; j++) // j < column of matrix B
            {
                m[i][j] = 0;
                for (int k = 0; k < c; k++) // k < column of matrix A
                {
                    m[i][j] = m[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        return m;

    }

    public static int[][] divide(int a[][],int b[][],int r,int c)
    {
        int divi[][] = new int[r][c];
        
        for(int i=0; i<r; i++)   
        {
            for(int j=0; j<c; j++)
            {
                divi[i][j]=a[i][j]/b[i][j];
            }
        }
        return divi;
        
    }
}
