package Logic_Building;

import java.util.Scanner;

public class Demo {
    static class BankAccount {
        String accountNumber;
        String accountHolderName;
        double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    // main method to transfer money
    public static void main(String[] args) {
        // creating two bank accounts
        BankAccount account1 = new BankAccount("001", "John Doe", 5000);
        BankAccount account2 = new BankAccount("002", "Jane Smith", 3000);

        // reading transfer amount from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transfer amount: ");
        double transferAmount = scanner.nextDouble();

        // transferring money from account1 to account2
        account1.withdraw(transferAmount);
        account2.deposit(transferAmount);

        // printing updated balances of the accounts
        System.out.println("Account 1 balance: " + account1.balance);
        System.out.println("Account 2 balance: " + account2.balance);
    }
}
