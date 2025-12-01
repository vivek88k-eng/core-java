package vehicleRentalSystem;

public class Customer {
	private String name;
	private String contact;
	private Vehicle rentedVehicle;
	private int rntedDays;
	private double totalCost;
	public Customer(String name, String contact, Vehicle rentedVehicle, int rntedDays, double totalCost) {
		super();
		this.name = name;
		this.contact = contact;
		this.rentedVehicle = rentedVehicle;
		this.rntedDays = rntedDays;
		this.totalCost = totalCost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Vehicle getRentedVehicle() {
		return rentedVehicle;
	}
	public void setRentedVehicle(Vehicle rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}
	public int getRntedDays() {
		return rntedDays;
	}
	public void setRntedDays(int rntedDays) {
		this.rntedDays = rntedDays;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	
	

	

}
