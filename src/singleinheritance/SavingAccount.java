package singleinheritance;

public class SavingAccount extends BankAccount {
	double interstRate;

	public SavingAccount(String accountNumber, int balance, double interstRate) {
		super(accountNumber, balance);
		this.interstRate = interstRate;
	}
	void addInterstRate() {
		double interest = balance * (interstRate / 100);
		balance += interest;
		System.out.println("Interest added" + interest);
		
	}
	void display() {
		super.display();
		System.out.println("InterestRate" + interstRate);
	}
	
}
