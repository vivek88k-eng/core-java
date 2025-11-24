
package vehicleRentalSystem;

public class Truck extends Vehicle implements Rentable {

	public Truck(String vehicleId, String name, double dailyRate) {
		super(vehicleId, name, dailyRate);
	}

	@Override
	public double calculateRentalCost(int days) {
		if (days <= 0) {
			return 0;
		}
		double extraCharge = 500;
		return (dailyRate * days) + extraCharge;

	}

	@Override
	public void rent(int days) throws VehicleNotAvailableException, InvalidDurationException {

		if (!available) {
			throw new VehicleNotAvailableException("This truck is not available");
		}

		if (days <= 0) {
			throw new InvalidDurationException("Rent duration can't be 0");
		}

		this.available = false;

		System.out.println("\nTruck Rented Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);
		System.out.println("Days->" + days);
		System.out.println("Total cost-> $" + calculateRentalCost(days));

	}

	@Override
	public void returnVehicle() {
		if (available) {
			System.out.println("This Truck is already available.Cannot return this");
			return;
		}

		this.available = true;

		System.out.println("\nTruck Returned Successfully!");
		System.out.println("VehicleId->" + vehicleId);
		System.out.println("Name->" + name);

	}

}
