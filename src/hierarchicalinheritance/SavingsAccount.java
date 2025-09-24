package hierarchicalinheritance;

public class SavingsAccount extends Account {
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
