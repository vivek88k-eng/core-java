package hybridinheritance;



public class PremiumSavings extends SavingsAccount {
    int rewardPoints;

    public PremiumSavings(int id, String name, double balance, double interestRate, int rewardPoints) {
        super(id, name, balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    void display() {
        super.display();
        System.out.println("Reward Points: " + rewardPoints);
    }
}

