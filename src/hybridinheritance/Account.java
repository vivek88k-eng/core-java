package hybridinheritance;



public class Account {
    int id;
    String name;
    double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account ID: " + id + ", Name: " + name + ", Balance: " + balance);
    }
}

