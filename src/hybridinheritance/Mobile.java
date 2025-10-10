package hybridinheritance;



public class Mobile extends Device {
    String imei;

    public Mobile(int id, String name, String imei) {
        super(id, name);
        this.imei = imei;
    }

    void display() {
        super.display();
        System.out.println("IMEI: " + imei);
    }
}

