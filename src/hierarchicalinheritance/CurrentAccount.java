package hierarchicalinheritance;

public class CurrentAccount extends Account {
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance + " (Overdraft allowed)");
    }
}

