package bankManagementSystem;

public class CurrentAccount extends BankAccount {

	private static  double TRANSACTION_FEE = 10;

	public CurrentAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}

	@Override
	public void withdraw(double amount) throws TransactionException {

		if (amount <= 0)
			throw new TransactionException(" Invalid Withdraw Amount!");

		double total = amount + TRANSACTION_FEE;

		if (balance < total)
			throw new TransactionException(" Insufficient Balance!");

		balance -= total;

		System.out.println(" Withdrawn: $" + amount + " (Fee $" + TRANSACTION_FEE + ")");
	}
}
