import java.util.*;

public class Product_Billing {
    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of products : ");
        n = sc.nextInt();

        int price[] = new int[n];
        int size[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("\nEnter the Price of Product " + (i+1) + " : ");
            price[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            System.out.print("\nEnter the Size/Quantity of Product " + (i+1) + " : ");
            size[i] = sc.nextInt();
        }
        discount(price, size, n);
    }

    public static void discount(int[] price, int[] size, int n) 
    {
        int amount = 0, i;
        float dis;
        for (i = 0; i < n; i++) {
            amount = amount + (price[i] * size[i]);
        }
        if (amount < 5000) {
            System.out.print("\nNo Discount!!! Total price to be Paid : " + amount);
        } else if (amount >= 5000 && amount <= 15000) {
            dis = (float) (amount - (amount * 0.1));
            System.out.print("\n10% Discount!!! Total price to be Paid : " + dis);
        } else if (amount > 15000) {
            dis = (float) (amount - (amount * 0.2));
            System.out.print("\n20% Discount!!! Total price to be Paid : " + dis);
        }
    }
}
