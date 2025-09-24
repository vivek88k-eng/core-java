package multilevelinheritance;

public class Smartphone extends Mobile {
    String os;

    void inputSmartphone(int id, String name, String imei, String os) {
        inputMobile(id, name, imei);
        this.os = os;
    }

    
    void display() {
        super.display();
        System.out.println("Operating System: " + os);
    }
}
