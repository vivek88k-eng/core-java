package hierarchicalinheritance;

public class Microwave extends Appliance {
    int cookingModes;

    
    void display() {
        super.display();
        System.out.println("Microwave Cooking Modes: " + cookingModes);
    }
}

