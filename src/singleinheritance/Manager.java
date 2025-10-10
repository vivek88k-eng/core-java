package singleinheritance;

public class Manager extends Employee {
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Department:" + department);
	}
		
}
