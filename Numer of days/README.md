#  Calculates the Day of the Week

This Java program calculates the day of the week that will occur after a specified number of days, given a starting day of the week. The program takes the user's input for the starting day and the number of days, and then it computes and displays the resulting day of the week.

## Overview

The program takes the following inputs from the user:
- Today's day (MON, TUE, WED, THUR, FRI, SAT, SUN)
- The number of days

It then calculates and prints the day of the week that will fall after the specified number of days.

## How to Use

1. Ensure you have Java installed on your system.

2. Clone the repository or download the `days_in_String.java` file.

3. Open a terminal and navigate to the directory containing the `days_in_String.java` file.

4. Compile the Java program using the following command:
   ```
   javac days_in_String.java
   ```

5. Run the compiled program using the following command:
   ```
   java days_in_String
   ```

6. Follow the on-screen instructions to input the following details:
   - Today's Day: Enter the current day of the week (e.g., MON, TUE, WED, THUR, FRI, SAT, SUN).
   - Number of Days: Enter the number of days you want to calculate.

7. The program will calculate and display the day of the week that will occur after the specified number of days.

## Example

Here's an example of how the program works:

```
Enter today's day (MON, TUE, WED, THUR, FRI, SAT, SUN) :
MON
Enter the number of days :
5
After 5 days, the day is SAT
```

## Note

- The program uses an array of strings to represent the days of the week.
- It performs calculations to determine the day of the week after the specified number of days.
- The input is case-insensitive, so you can enter the day abbreviations in any case (e.g., "mon", "Mon", "MON" are all valid).
- The program doesn't account for leap years or other calendar complexities.

Feel free to modify and use this program according to your needs. If you encounter any issues or have suggestions for improvement, please create an issue or a pull request in the repository.

---

**Disclaimer:** This program is meant for educational and illustrative purposes. It may not account for all possible scenarios and edge cases related to date calculations.
