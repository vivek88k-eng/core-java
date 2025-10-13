package abstraction;

public class CurrentAccount extends BankAccount {
    void deposit() {
        System.out.println("Depositing in Current Account");
    }

    void withdraw() {
        System.out.println("Withdrawing from Current Account");
    }

    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

