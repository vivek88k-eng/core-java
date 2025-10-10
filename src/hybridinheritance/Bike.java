package hybridinheritance;



public class Bike extends Vehicle {
    int cc;

    public Bike(int id, String brand, int cc) {
        super(id, brand);
        this.cc = cc;
    }

    void display() {
        super.display();
        System.out.println("Bike CC: " + cc);
    }
}

