package multilevelinheritance;

public class Device {
    int id;
    String name;

    void input(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Device ID: " + id + ", Name: " + name);
    }
}
