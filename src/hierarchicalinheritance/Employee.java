package hierarchicalinheritance;

public class Employee {
    int id;
    String name;

    void input(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

