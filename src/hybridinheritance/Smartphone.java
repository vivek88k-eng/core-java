package hybridinheritance;


public class Smartphone extends Mobile {
    String os;
    int storage;

    public Smartphone(int id, String name, String imei, String os, int storage) {
        super(id, name, imei);
        this.os = os;
        this.storage = storage;
    }

    void display() {
        super.display();
        System.out.println("OS: " + os + ", Storage: " + storage + "GB");
    }
}

