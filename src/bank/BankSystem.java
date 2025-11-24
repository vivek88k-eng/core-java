package bank;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {
	private List<BankAccount> accounts = new ArrayList<>();

	public void addAccount(BankAccount account) {
		accounts.add(account);
		System.out.println("Account Created Successfullly");
	}
	
	public BankAccount findAccount(String accNo) {
		for(BankAccount account : accounts) {
			if( account.getAccountNumber().equals(accNo)) {
				return account;
			}
		}
		return null;
	}
	
	public void showAllAccount() {
		if(accounts.isEmpty()) {
			System.out.println("NO Account ");
			return;
		}
		for (BankAccount acc : accounts) {
			
			acc.displayDetails();
		}
		
	}
}
