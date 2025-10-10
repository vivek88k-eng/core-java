package hybridinheritance;



public class Device {
    int id;
    String name;

    public Device(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Device ID: " + id + ", Name: " + name);
    }
}

