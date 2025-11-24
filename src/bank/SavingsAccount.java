package bank;

public class SavingsAccount extends BankAccount{
	private static  double MIN_BALANCE =500;

	public SavingsAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}
    public void withdraw(double amount) {
    	if (amount <= 0) {
    		System.out.println("Invalid Amount");
    		return;
    	}
    	if (balance - amount >= MIN_BALANCE) {
    		balance -= amount;
    		System.out.println("$->" + amount + "Withdraw form your Account");
    	}else {
    		System.out.println("MINIMUM balance $-> " + MIN_BALANCE + "Rquired");
    	}
    }
}
