package multilevelinheritance;

public class SavingsAccount extends Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

   
    void display() {
        super.display();
        System.out.println("Balance: " + balance);
    }
}

