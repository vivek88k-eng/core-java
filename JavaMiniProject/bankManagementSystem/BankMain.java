package bankManagementSystem;

import java.util.Scanner;

public class BankMain {

	private static Scanner sc = new Scanner(System.in);
	public static BankSystem bank = new BankSystem();

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n===== IB BANK MENU =====");
			System.out.println("1. Create Savings Account");
			System.out.println("2. Create Current Account");
			System.out.println("3. Perform Transaction");
			System.out.println("4. Show Account Details");
			System.out.println("5. Show All Accounts");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> createSavingsAccount();
			case 2 -> createCurrentAccount();
			case 3 -> performTransaction();
			case 4 -> showAccountDetails();
			case 5 -> bank.showAllAccount();
			case 6 -> {
				System.out.println(" Thank you for using IB Bank!");
				return;
			}
			default -> System.out.println(" Invalid Choice!");
			}
		}
	}

	private static void performTransaction() {
		System.out.print("Enter Account Number: ");
		String acc = sc.next();

		BankAccount account = bank.findAccount(acc);

		if (account == null) {
			System.out.println(" Account Not Found!");
			return;
		}

		performTransactionMenu(account);
	}

	private static void performTransactionMenu(BankAccount acc) {

		while (true) {
			System.out.println("\n====== TRANSACTION MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Money Transfer");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int c = sc.nextInt();

			switch (c) {
			case 1 -> depositMoney(acc);
			case 2 -> withdrawMoney(acc);
			case 3 -> moneyTransfer(acc);
			case 4 -> {
				System.out.println("Returning to Main Menu...");
				return;
			}
			default -> System.out.println(" Invalid choice");
			}
		}
	}

	private static void moneyTransfer(BankAccount sender) {

		System.out.println("Enter Receiver Account Number: ");
		String receiverAcc = sc.next();

		if (receiverAcc.equals(sender.getAccountNumber())) {
			System.out.println(" Cannot transfer to your own account");
			return;
		}

		BankAccount receiver = bank.findAccount(receiverAcc);

		if (receiver == null) {
			System.out.println(" Receiver account not found!");
			return;
		}

		System.out.println("Receiver Name: " + receiver.getOwnerName());
		System.out.print("Enter Amount: ");
		double amt = sc.nextDouble();

		try {
			sender.withdraw(amt);//
			receiver.deposit(amt);//
			System.out.println(" $" + amt + " Transferred Successfully!");
		} catch (TransactionException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void depositMoney(BankAccount acc) {
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();

		try {
			acc.deposit(amount);
		} catch (TransactionException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void withdrawMoney(BankAccount acc) {
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
		} catch (TransactionException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void showAccountDetails() {
		System.out.print("Enter Account Number: ");
		String acc = sc.next();

		BankAccount account = bank.findAccount(acc);

		if (account != null)
			account.displayDetails();
		else
			System.out.println(" Account Not Found!");
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
}
