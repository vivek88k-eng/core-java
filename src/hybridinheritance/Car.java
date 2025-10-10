package hybridinheritance;

public class Car extends Vehicle {
    int seats;

    public Car(int id, String brand, int seats) {
        super(id, brand);
        this.seats = seats;
    }

    void display() {
        super.display();
        System.out.println("Seats: " + seats);
    }
}
