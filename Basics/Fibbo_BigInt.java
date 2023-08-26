import java.math.BigInteger;
import java.util.*;

public class Fibbo_BigInt {
    public static void main(String[] args) 
    {
        BigInteger A, B; 
        A  = BigInteger.valueOf(0);
        B  = BigInteger.valueOf(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in fibbonacci series : ");
        int n = sc.nextInt();
        System.out.println("Fibbonacci series");
        System.out.print(A + " " + B);
        for (int i = 0; i < n - 2; i++) {
            BigInteger C = A.add(B); 
            System.out.print(" " + C);
            A = B;
            B = C;
        }
    }
}
