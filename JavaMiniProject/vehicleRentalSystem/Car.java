package vehicleRentalSystem;

public class Car extends Vehicle implements Rentable {

	public Car(String vehicleId, String name, double dailyRate) {
		super(vehicleId, name, dailyRate);
	}

	@Override
	public double calculateRentalCost(int days) {

		if (days <= 0) {
			return 0;
		}
		return dailyRate * days;
	}

	@Override
	public void rent(int days) throws VehicleNotAvailableException, InvalidDurationException {

		if (!available) {
			throw new VehicleNotAvailableException("This car is not avaailable");
		}

		if (days <= 0) {
			throw new InvalidDurationException("Rent duration can't be 0");
		}

		this.available = false;

		System.out.println("\ncar Rented Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);
		System.out.println("Days->" + days);
		System.out.println("Total cost-> $" + calculateRentalCost(days));

	}

	@Override
	public void returnVehicle() {
		if (available) {
			System.out.println("This car is already available.Cannot return this");
			return;
		}

		this.available = true;

		System.out.println("\ncar Returned Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);

	}

}
