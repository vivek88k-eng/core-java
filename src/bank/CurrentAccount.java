package bank;

public class CurrentAccount extends BankAccount {
	private static double TRANSACTION_FEE = 10;

	public CurrentAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}
	
	public void withdraw(double amount) {
    	if (amount <= 0) {
    		System.out.println("Invalid Amount");
    		return;
    	}
    	double totalAmount = amount + TRANSACTION_FEE;
    	
    	if (balance >= totalAmount) {
    		balance -= totalAmount;
    		System.out.println("$" + amount + "withdraw with fee charged");
    	
    		
    	}else {
    		System.out.println("INsufficant balace");
    	}
    }

	
	
}
