package hierarchicalinheritance;

public class WashingMachine extends Appliance {
    int capacity;

    
    void display() {
        super.display();
        System.out.println("Washing Machine Capacity: " + capacity + " Kg");
    }
}

