package multilevelinheritance;

public class University {
    int id;
    String uniName;

    void input(int id, String uniName) {
        this.id = id;
        this.uniName = uniName;
    }

    void display() {
        System.out.println("University ID: " + id + ", Name: " + uniName);
    }
}

