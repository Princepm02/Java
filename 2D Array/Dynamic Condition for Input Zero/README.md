# Dynamic Matrix Input with Zero Value Handling

This Java program allows users to create a dynamic 2D matrix, enter its values, and ensures that no zero values exist within the matrix. If zero values are detected, the program prompts the user to re-enter non-zero values for those positions. The final updated matrix is then displayed.

## How to Use

1. Clone the repository or download the Java source code file (`Dynamic_Condition_Zero.java`) to your local machine.

2. Compile the Java program using a Java compiler. You can do this with the following command:

   ```bash
   javac Dynamic_Condition_Zero.java
   ```

3. Run the compiled program:

   ```bash
   java Dynamic_Condition_Zero
   ```

4. Follow the on-screen instructions:

   - Enter the number of rows for the matrix.
   - Enter the number of columns for the matrix.
   - Input the matrix values as prompted.

## Program Overview

The program performs the following steps:

1. **Matrix Creation**: Users are prompted to specify the number of rows and columns for the matrix. A 2D array named 'a' is created to store the matrix values.

2. **Matrix Input**: Users are then prompted to enter the values for the matrix one by one.

3. **Zero Value Handling**: Using nested loops, the program reads and processes each matrix element. If the input value is not zero, it's directly stored in the matrix. If the input value is zero, the program continuously prompts the user until a non-zero value is entered. This ensures that no zero values are stored in the matrix.

4. **Matrix Printing**: After all matrix values are read and processed, the program prints the updated matrix.

---
Feel free to use and modify this Java program as needed for your own projects or educational purposes.
