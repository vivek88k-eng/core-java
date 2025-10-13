package abstraction;

public class ElectronicsOrder extends Order {
    void processOrder() {
        System.out.println("Processing Electronics Order");
    }

    void shipOrder() {
        System.out.println("Shipping Electronics Order");
    }
}

