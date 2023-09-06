# 2D Matrix Input and Modification

This Java program allows users to create a 2D matrix, enter its values, and ensure that no zero values exist within the matrix. If zero values are detected, the program prompts the user to re-enter non-zero values for those positions. The final updated matrix is then printed.

## How to Use

1. Clone the repository or download the Java source code file (`Condition_2d_Array.java`) to your local machine.

2. Compile the Java program using a Java compiler. You can do this with the following command:

   ```bash
   javac Condition_2d_Array.java
   ```

3. Run the compiled program:

   ```bash
   java Condition_2d_Array
   ```

4. Follow the on-screen instructions:

   - Enter the number of rows for the matrix.
   - Enter the number of columns for the matrix.
   - Input the matrix values as prompted.

## Program Overview

The program performs the following steps:

1. **Matrix Creation**: Users are prompted to specify the number of rows and columns for the matrix. A 2D array named 'a' is created to store the matrix values.

2. **Matrix Input**: Users are then prompted to enter the values for the matrix. The values are stored in the 'a' array.

3. **Zero Value Check**: The program scans the matrix to identify any zero values. If zero values are found, the user is prompted to re-enter non-zero values for those positions, ensuring the matrix does not contain any zeros.

4. **Matrix Printing**: After all modifications are complete, the program prints the updated matrix, reflecting the changes made.

## Example

Here's an example of how the program works:

```plaintext
Enter the no. of row matrix:
3
Enter the no. of Column matrix:
3
Enter 9 values of Matrix:
1 2 3
0 0 6
7 8 9
Enter the value of again for a[1][0] as it can't be zero:
4
Enter the value of again for a[1][1] as it can't be zero:
5
Matrix after Updation:
1 2 3
4 5 6
7 8 9
```

In this example, the program detected two zero values and prompted the user to re-enter non-zero values for those positions. The final matrix has been updated accordingly.

---

Feel free to use and modify this Java program as needed for your own projects or educational purposes.
