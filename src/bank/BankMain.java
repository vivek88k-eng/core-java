package bank;

import java.util.Scanner;

public class BankMain {

    private static Scanner sc = new Scanner(System.in);
    private static BankSystem bank = new BankSystem();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Account Details");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createSavingsAccount();
                case 2 -> createCurrentAccount();
                case 3 -> depositMoney();
                case 4 -> withdrawMoney();
                case 5 -> showAccountDetails(); 
                case 6 -> bank.showAllAccount(); 
                case 7 -> {
                    System.out.println("Thank you for using our Bank!");
                    return;
                }
                default ->
                    System.out.println("Invalid choice!");
            }
        }
    }

   

    private static void createSavingsAccount() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        System.out.print("Enter Owner Name: ");
        String name = sc.next();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        bank.addAccount(new SavingsAccount(acc, name, bal));
    }

    private static void createCurrentAccount() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        System.out.print("Enter Owner Name: ");
        String name = sc.next();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        bank.addAccount(new CurrentAccount(acc, name, bal));
    }

    private static void depositMoney() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        BankAccount account = bank.findAccount(acc);

        if (account != null) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("❌ Account not found!");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        BankAccount account = bank.findAccount(acc);

        if (account != null) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("❌ Account not found!");
        }
    }

    private static void showAccountDetails() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();

        BankAccount account = bank.findAccount(acc);

        if (account != null) {
            account.displayDetails();
        } else {
            System.out.println("❌ Account not found!");
        }
    }
}
