package singleinheritance;

public class Vehicle {
	String brand;

	public Vehicle(String brand) {
		super();
		this.brand = brand;
	}
	void start() {
		System.out.print(brand + "vehicle is starting.....");
	}

}
