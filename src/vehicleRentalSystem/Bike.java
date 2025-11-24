package vehicleRentalSystem;

public class Bike extends Vehicle implements Rentable {

	public Bike(String vehicleId, String name, double dailyRate) {
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
			throw new VehicleNotAvailableException("This bike is not available");
		}

		if (days <= 0) {
			throw new InvalidDurationException("Rent duration can't be 0");
		}

		this.available = false;

		System.out.println("\nBike Rented Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);
		System.out.println("Days->" + days);
		System.out.println("Total cost-> $" + calculateRentalCost(days));

	}

	@Override
	public void returnVehicle() {
		if (available) {
			System.out.println("This bike is already available.Cannot return this");
			return;
		}

		this.available = true;

		System.out.println("\nBike Returned Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);

	}
}
