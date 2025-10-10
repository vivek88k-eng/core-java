package singleinheritance;

public class Car extends Vehicle {
	String model;

	public Car(String brand, String model) {
		super(brand);
		this.model = model;
	}
	void drive() {
		System.out.println("Car is driving......");
	}

}
