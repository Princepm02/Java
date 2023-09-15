# Tax Calculator

This program calculates the income tax liability based on the user-provided salary. It calculates tax based on progressive tax slabs where different tax rates apply to different income ranges. The program takes the user's salary input and calculates the tax amount accordingly.

## How to Use

1. Make sure you have Java installed on your system.

2. Clone or download this repository to your local machine.

3. Open a terminal or command prompt and navigate to the directory where you have saved the `salary.java` file.

4. Compile the program using the following command:
   ```
   javac salary.java
   ```

5. Run the program:
   ```
   java salary
   ```

6. Follow the on-screen instructions to input the following details:
   - Salary: The annual salary amount.

7. The program will calculate and display the tax amount to be paid based on the salary input.

## Example Usage

Here's an example of how to use the Tax Calculator:

```
Enter salary: 600000

Tax to be Paid: 5000.0
```

## Tax Slabs

- Income up to 500,000: No tax
- Income from 500,001 to 750,000: 5% of the income above 500,000
- Income from 750,001 to 1,000,000: 10% of the income above 750,000, plus a fixed tax of 12,500
- Income above 1,000,000: 20% of the income above 1,000,000, plus a fixed tax of 37,500
