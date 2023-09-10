# Fibonacci Series Generator Using BigInteger

This is a simple Java program that generates the Fibonacci series using `BigInteger` to handle large numbers.

## Usage
1. Clone or download this repository to your local machine.
2. Compile the Java program using a Java compiler.
   ```
   javac Fibbo_BigInt.java
   ```
3. Run the program.
   ```
   java Fibbo_BigInt
   ```
4. Enter the number of elements you want in the Fibonacci series when prompted.
5. The program will display the Fibonacci series up to the specified number of elements.

## Description
This program does the following:

- Initializes two `BigInteger` variables, `A` and `B`, to represent the first two numbers in the Fibonacci series.
- Uses a `Scanner` object to read user input for the number of elements in the series.
- Prints the first two numbers in the Fibonacci series (0 and 1).
- Generates and prints the remaining numbers in the Fibonacci series using a loop.
- Calculates the next number in the series by adding `A` and `B`.
- Updates the values of `A` and `B` for the next iteration.

## Example
Suppose you enter `10` as the number of elements you want in the Fibonacci series. The program will output:
```
Enter the number of elements you want in Fibonacci series:
10
Fibonacci series:
0 1 1 2 3 5 8 13 21 34
```

Enjoy exploring the Fibonacci sequence with large numbers using this Java program!
