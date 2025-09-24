package multilevelinheritance;

public class Vehicle {
	int id;
	String brand;
	void input(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	void display() {
		System.out.println("Vichicle ID="+ id);
		System.out.println("Brand ="+ brand);
	}
}

