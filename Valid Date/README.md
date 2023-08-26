# Valid Date Checker

This Java program is designed to determine whether a given date is valid or not, based on the input provided by the user. The program performs checks on the day, month, and year components of the input to determine the validity of the date.

## Usage

1. Make sure you have Java installed on your system.
2. Clone this repository or download the `Valid_Date.java` file.

### Compilation

Navigate to the directory containing the `Valid_Date.java` file in your terminal or command prompt. Then, compile the program using the following command:

```bash
javac Valid_Date.java
```

### Running the Program

After compiling the program, run it using the following command:

```bash
java Valid_Date
```

The program will prompt you to enter the day, month, and year components of the date. Enter these values one by one as prompted.

## How the Program Works

1. The program uses a `Scanner` object to read input from the user.
2. It prompts the user to enter the day, month, and year components of the date.
3. The program then checks the entered values against predefined criteria to determine if the date is valid or not.
4. The validity checks include:
   - Ensuring that the day is within a valid range for the given month.
   - Validating months with 31 days, 30 days, and February (including leap years).
   - Verifying that the year is a 4-digit number.
5. Based on the validation checks, the program outputs whether the given date is valid or not.

## Validity Criteria

- The day must be within a valid range for the selected month (28-31 days).
- The month must be a valid value (1-12).
- The year must be a 4-digit number.

## Example

For instance, if the user enters `29` for day, `2` for month, and `2020` for year, the program will output that the given date is valid due to the leap year.

Please note that this program assumes Gregorian calendar rules and doesn't account for edge cases such as historical calendar adjustments.

## Contributions

Contributions to the program are welcome! Feel free to open issues or pull requests if you have suggestions for improvements or bug fixes.
