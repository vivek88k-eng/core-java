package bankManagementSystem;

public class SavingsAccount extends BankAccount {

	private static  double MIN_BALANCE = 500;

	public SavingsAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}

	@Override
	public void withdraw(double amount) throws TransactionException {
		if (amount <= 0)
			throw new TransactionException("❌ Invalid Withdraw Amount!");

		if (balance - amount < MIN_BALANCE)
			throw new TransactionException("❌ Minimum balance $" + MIN_BALANCE + " required!");

		balance -= amount;
		System.out.println(" Withdrawn: $" + amount);
	}
}
