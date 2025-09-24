package multilevelinheritance;

public class Mobile extends Device {
    String imei;

    void inputMobile(int id, String name, String imei) {
        input(id, name);
        this.imei = imei;
    }

    
    void display() {
        super.display();
        System.out.println("IMEI: " + imei);
    }
}
