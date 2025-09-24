package hierarchicalinheritance;

public class Refrigerator extends Appliance {
    String coolingType;

   
    void display() {
        super.display();
        System.out.println("Refrigerator Cooling Type: " + coolingType);
    }
}

