package bankManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {

	private List<BankAccount> accounts = new ArrayList<>();

	public void addAccount(BankAccount account) {
		for (BankAccount acc : accounts) {
			if (acc.getAccountNumber().equals(account.getAccountNumber())) {
				System.out.println(" Account with this number already exists!");
				return;
			}
		}
		accounts.add(account);
		System.out.println(" Account created Successfully!");
	}

	public BankAccount findAccount(String accNo) {
		for (BankAccount acc : accounts) {
			if (acc.getAccountNumber().equals(accNo))
				return acc;
		}
		return null;
	}

	public void showAllAccount() {
		if (accounts.isEmpty()) {
			System.out.println(" No accounts found!");
			return;
		}

		System.out.println("\n=== ALL ACCOUNTS ===");
		for (BankAccount acc : accounts) {
			acc.displayDetails();
		}
	}
}
