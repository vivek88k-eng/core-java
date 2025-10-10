package hybridinheritance;


public class SportsCar extends Car {
    int horsepower;

    public SportsCar(int id, String brand, int seats, int horsepower) {
        super(id, brand, seats);
        this.horsepower = horsepower;
    }

    void display() {
        super.display();
        System.out.println("Horsepower: " + horsepower);
    }
}

