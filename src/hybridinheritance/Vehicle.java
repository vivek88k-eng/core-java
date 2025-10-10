package hybridinheritance;



public class Vehicle {
    int id;
    String brand;

    public Vehicle(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle ID: " + id + ", Brand: " + brand);
    }
}

