package multilevelinheritance;

public class FixedDeposit extends SavingsAccount {
    double interestRate;
    int years;

    double calculateMaturity() {
        return balance + (balance * interestRate * years) / 100;
    }

   
    void display() {
        super.display();
        System.out.println("Rate: " + interestRate + "%, Years: " + years);
    }
}
