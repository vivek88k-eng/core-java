package vehicleRentalSystem;

public abstract class Vehicle {
	protected String vehicleId;
	protected String name;
	protected double dailyRate;
	protected boolean available;

	public Vehicle(String vehicleId, String name, double dailyRate) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.dailyRate = dailyRate;
		this.available = true;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	// public void setVehicleId(String vehicleId) {

	public String getName() {
		return name;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;

	}

	public abstract double calculateRentalCost(int days);

	public abstract void rent(int days) throws VehicleNotAvailableException, InvalidDurationException;

	public abstract void returnVehicle();

}
