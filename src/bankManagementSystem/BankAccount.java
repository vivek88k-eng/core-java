package bankManagementSystem;

public abstract class BankAccount implements Transactionable {

	protected String accountNumber;
	protected String ownerName;
	protected double balance;

	public BankAccount(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws TransactionException {
		if (amount <= 0)
			throw new TransactionException(" Deposit amount must be positive!");

		balance += amount;
		System.out.println(" Deposited: $" + amount);
	}

	public abstract void withdraw(double amount) throws TransactionException;

	public void displayDetails() {
		System.out.println("\n=== Account Details ===");
		System.out.println("Account No : " + accountNumber);
		System.out.println("Owner Name : " + ownerName);
		System.out.println("Balance    : $" + balance);
	}

	public void performTransaction() {
	}
}
