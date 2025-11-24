package bank;

public abstract class BankAccount implements Transactionable {
	protected String accountNumber;
	protected String ownerName;
	protected double balance;
	
	public BankAccount(String accountNumber, String ownerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	

	public String getOwenerName() {
		return ownerName;
	}

	

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("$" + amount + "Deposit Successfully");
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	public abstract void withdraw(double amount);
	
	public void performTransaction() {
		System.out.println("Perfoming transaction....");
	}
	
	public void displayDetails() {
		System.out.println("Account No->" + accountNumber);
		System.out.println("Owener Name->" + ownerName);
		System.out.println("Balance$->" + balance);
	}
}