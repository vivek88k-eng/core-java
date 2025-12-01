
package vehicleRentalSystem;

import java.util.*;

public class RentalSystem {
	private static List<Vehicle> vehicles = new ArrayList<>();
	private static List<Customer> customers = new ArrayList<>();

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		intializeVehicles();

		int choice;
		do {
			System.out.println("\n------VEHICLE RENTAL SYSTEM-------");
			System.out.println("1.Show All Vehicles");
			System.out.println("2.Rent a Vehicle");
			System.out.println("3.Return a Vehicle ");
			System.out.println("4 Show All Bookings");
			System.out.println("5. Exit");
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> showVehicles();
			case 2 -> rentVehicle();
			case 3 -> returnVehicle();
			case 4 -> showAllBookings();
			case 5 -> System.out.println("Exiting..........");
			default -> System.out.println("Invalid choice");
			}

		} while (choice != 5);
	}

	private static void intializeVehicles() {

		vehicles.add(new Car("DL3s101", "aulto", 1000));
		vehicles.add(new Car("DL3s102", "Tata neno", 800));
		vehicles.add(new Bike("DL3sB203", "Bullet", 700));
		vehicles.add(new Bike("DL3sSE204", "Mt15", 500));
		vehicles.add(new Truck("HR29Du4", "TATA mini", 2000));
		vehicles.add(new Truck("HR29US9", "TATA Prima", 3000));
		System.out.println("Vehicles loaded Succcessfully!");
	}

	private static void showAllBookings() {
		if (customers.isEmpty()) {
			System.out.println("\nNo boolings found!");
			return;
		}
		System.out.println("\n=====ALL BOOKINGS=======");
		for (Customer c : customers) {
			System.out.println("Name:" + c.getName() + "| Contact:" + c.getContact() + "Vehicle:"
					+ c.getRentedVehicle().getName() + "|Days:" + c.getRntedDays() + "Total:$" + c.getTotalCost());

		}
		

	}

	private static void showVehicles() {
		System.out.println("\n-------Available Vehicles-----");

		for (Vehicle v : vehicles) {
			System.out.println(v.getVehicleId() + " |" + v.getName() + "| Rate:$" + v.getDailyRate() + "| Available: "
					+ (v.isAvailable() ? "Yes" : "NO"));

		}

	}

	private static void rentVehicle() {
		System.out.println("Enter Vehicle ID to Rent:");
		String id = sc.next();
		Vehicle selected = null;

		for (Vehicle v : vehicles) {
			if (v.getVehicleId().equalsIgnoreCase(id)) {
				selected = v;
				break;
			}
		}

		if (selected == null) {
			System.out.println("Invaild Vehicle ID!");
			return;

		}
		System.out.println("Enter number of Days");
		int days = sc.nextInt();
		System.out.println("Enter customer name");
		String cname = sc.next();
		System.out.println("Enter customer contact");
		String contact = sc.next();

		try {
			selected.rent(days);
			double cost = selected.calculateRentalCost(days);
			customers.add(new Customer(cname, contact, selected, days, cost));
			System.out.println("\nCustomer Registered Successfully");
			System.out.println("Name " + cname);
			System.out.println("Contact:" + contact);
			System.out.println("Vehicle:" + selected.getName());
			System.out.println("Days:" + days);
			System.out.println("Total Cost : $" + cost);
		} catch (VehicleNotAvailableException | InvalidDurationException e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

	private static void returnVehicle() {
		System.out.print("Enter Vehicle ID to Return:");
		String id = sc.next();
		Vehicle selected = null;
		for (Vehicle v : vehicles) {
			if (v.getVehicleId().equalsIgnoreCase(id)) {
				selected = v;
				break;
			}
		}
		if (selected == null) {
			System.out.println("InvalidVehicle ID!");
			return;
		}
		selected.returnVehicle();

	}

}
