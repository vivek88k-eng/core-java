package multilevelinheritance;

import java.util.Scanner;

public class ElectricCar extends Car {
	int batteryCapacity;
	void input(int id, String brand, int seats, int batteryCapacity) {
		super.inputCar(id, brand, seats);
		this.batteryCapacity = batteryCapacity;
	}
	void display() {
		super.display();
		System.out.println("Battery Capacity="+ batteryCapacity);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter Brand");
		String brand =sc.nextLine();
		
		System.out.println("Enter seat");
		int seats =sc.nextInt();
		System.out.println("Enter battery Capacity");
		int battery =sc.nextInt();
		ElectricCar eCar = new ElectricCar();
		eCar.input(id, brand, seats, battery);
		eCar.display();
		sc.close();
	}
	
	
}

	


