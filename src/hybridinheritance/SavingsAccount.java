package hybridinheritance;



public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int id, String name, double balance, double interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
