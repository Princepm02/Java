# Matrix Operations and Triangular Submatrix Printer

This Java program performs basic matrix operations (addition, subtraction, multiplication, division) and allows the user to print various triangular submatrices of the result. Triangular submatrices include Lower Left Triangle (LLT), Lower Right Triangle (LRT), Upper Left Triangle (ULT), and Upper Right Triangle (URT).

## Table of Contents
- [Introduction](#introduction)
- [Usage](#usage)
- [Matrix Operations](#matrix-operations)
- [Triangular Submatrices](#triangular-submatrices)
- [How to Run](#how-to-run)

## Introduction
This program takes input for two matrices, performs a user-selected matrix operation (+, -, *, /), and then allows the user to choose which triangular submatrix of the result they want to print.

## Usage
1. The program prompts you to enter the number of rows and columns for the matrices.
2. You'll be asked to input the values for each element of both matrices A and B.
3. You will then be prompted to choose a matrix operation: addition (+), subtraction (-), multiplication (*), or division (/).
4. After the operation, you can choose to print one of the following triangular submatrices:
   - Lower Left Triangle (LLT)
   - Lower Right Triangle (LRT)
   - Upper Left Triangle (ULT)
   - Upper Right Triangle (URT)

## Matrix Operations
The program supports the following matrix operations:
- **Addition (+)**: Adds corresponding elements of matrices A and B.
- **Subtraction (-)**: Subtracts corresponding elements of matrix B from matrix A.
- **Multiplication (*)**: Multiplies matrices A and B using the matrix multiplication algorithm.
- **Division (/)**: Divides corresponding elements of matrix A by matrix B.

## Triangular Submatrices
The program allows you to print various triangular submatrices of the result matrix:
- **Lower Left Triangle (LLT)**: Prints the lower left triangular submatrix.
- **Lower Right Triangle (LRT)**: Prints the lower right triangular submatrix.
- **Upper Left Triangle (ULT)**: Prints the upper left triangular submatrix.
- **Upper Right Triangle (URT)**: Prints the upper right triangular submatrix.

## How to Run
1. Compile the Java source file using the following command:
   ```
   javac matrix.java
   ```
2. Run the compiled class using:
   ```
   java matrix
   ```
3. Follow the prompts to provide matrix sizes, elements, choose an operation, and select a triangular submatrix to print.

## Note
- Ensure you have Java installed on your system.
- The program is designed to handle square matrices for multiplication and division operations.

Feel free to modify, distribute, and use this code for educational purposes. If you encounter any issues or have suggestions for improvement, please feel free to contribute to the code or open an issue on this GitHub repository.
