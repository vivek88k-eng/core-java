
package vehicleRentalSystem;

public interface Rentable {
	void rent(int days) throws VehicleNotAvailableException, InvalidDurationException;

	void returnVehicle();

}
