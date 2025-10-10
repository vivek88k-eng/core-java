package singleinheritance;

public class BankAccount {
	String accountNumber;
	int balance;
	public BankAccount(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			this.balance+=amount;
			System.out.println("Deposit in your accunt" + amount);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			this.balance-=amount;
			System.out.println(amount + "is withdraw ");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	void display() {
		System.out.print("AccountNumber" + accountNumber);
		System.out.print("Current balance" + balance);;
	}
	
	

}
