package multilevelinheritance;

public class Account {
    int id;
    String name;

    void input(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Account ID: " + id + ", Name: " + name);
    }
}

