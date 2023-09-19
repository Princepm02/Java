# Product Billing with Discount

This is a simple Java program for calculating the total price of products with discounts based on the total amount spent.

## How to Use

1. **Compile the Program:**

   Open your terminal or command prompt and navigate to the directory where the `Product_Billing.java` file is located. Then, compile the program using the following command:

   ```
   javac Product_Billing.java
   ```

2. **Run the Program:**

   After compiling successfully, run the program by executing the following command:

   ```
   java Product_Billing
   ```

3. **Follow on-screen instructions:**

   - Enter the total number of products.
   - Enter the price and quantity (size) for each product as prompted.

4. **View Discounted Total Price:**

   The program will calculate the total amount and apply discounts based on the total amount spent. The discounted total price will be displayed on the screen.

## Discount Rules

- If the total amount is less than ₹5000, there is no discount.
- If the total amount is between ₹5000 and ₹15000 (inclusive), a 10% discount is applied.
- If the total amount is greater than ₹15000, a 20% discount is applied.

## Example

Here's an example of how the program works:

```
Enter the total number of products : 3

Enter the Price of Product 1 : 1000
Enter the Price of Product 2 : 2500
Enter the Price of Product 3 : 3000

Enter the Size/Quantity of Product 1 : 2
Enter the Size/Quantity of Product 2 : 3
Enter the Size/Quantity of Product 3 : 1

10% Discount!!! Total price to be Paid : 6300.0
```
