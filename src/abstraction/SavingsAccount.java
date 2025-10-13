package abstraction;

public class SavingsAccount extends BankAccount {
    void deposit() {
        System.out.println("Depositing in Savings Account");
    }

    void withdraw() {
        System.out.println("Withdrawing from Savings Account");
    }

    void calculateInterest() {
        System.out.println("Calculating 5% interest for Savings Account");
    }
}

