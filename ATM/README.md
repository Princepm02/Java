# ATM Operation Simulator

This Java program simulates the operations of an Automated Teller Machine (ATM). It allows users to perform various transactions such as deposit, withdrawal, checking the balance, and viewing mini statements.

## Table of Contents
- [Introduction](#introduction)
- [Usage](#usage)
- [Features](#features)
- [How to Run](#how-to-run)
- [Note](#note)

## Introduction
This program emulates the functionality of an ATM by providing options for users to perform transactions on their account, including deposits, withdrawals, and balance inquiries. It also keeps track of the transactions for mini statement display.

## Usage
1. Users are presented with a menu of options:
   - **1. Deposit**: Allows users to deposit money into their account.
   - **2. Withdraw**: Allows users to withdraw money from their account.
   - **3. Mini Statement**: Displays a summary of recent transactions.
   - **4. Balance Enquiry**: Shows the current balance in the account.
   - **5. Exit**: Exits the ATM application.
   
2. Users can choose an option by entering the corresponding number.

## Features
- **Deposit**: Users can deposit an amount into their account. The program validates the deposit amount to ensure it is greater than ₹100 and is a multiple of ₹100.
- **Withdraw**: Users can withdraw money from their account. The program validates the withdrawal amount to ensure it is greater than ₹100, not more than ₹10,000, and is a multiple of ₹100. Additionally, the program monitors daily withdrawal limits.
- **Mini Statement**: Users can view a summary of recent transactions, showing the amount credited or withdrawn for each transaction.
- **Balance Enquiry**: Users can check the current available balance in their account.
- **Exiting**: Users can exit the ATM application at any time.

## How to Run
1. Compile the Java source file using the following command:
   ```
   javac atm.java
   ```
2. Run the compiled class using:
   ```
   java atm
   ```
3. Follow the on-screen prompts to perform various transactions.

## Note
- Make sure you have Java installed on your system.
- The program demonstrates the basic functionalities of an ATM simulation and does not involve actual financial transactions.
- Feel free to experiment with the code and adapt it for your own purposes. If you encounter any issues or have suggestions for improvement, please contribute to the code or open an issue on the GitHub repository.

Enjoy simulating ATM transactions with this Java program!
