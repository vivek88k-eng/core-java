package hybridinheritance;



public class LoanAccount extends Account {
    double loanAmount;

    public LoanAccount(int id, String name, double balance, double loanAmount) {
        super(id, name, balance);
        this.loanAmount = loanAmount;
    }

    void display() {
        super.display();
        System.out.println("Loan Amount: " + loanAmount);
    }
}

