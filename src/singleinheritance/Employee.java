package singleinheritance;

public class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	void showDetails() {
		System.out.println("Name :"+ name + ",salary: " + salary);
	}

}
