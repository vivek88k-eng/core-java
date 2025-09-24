package multilevelinheritance;

public class Car extends Vehicle {
	int seats;
	void inputCar(int id, String brand, int seats) {
		super.input(id, brand);
		this.seats = seats;
	}
	void display() {
		super.display();
		System.out.println("Seats="+seats);	
		}
	}

	


