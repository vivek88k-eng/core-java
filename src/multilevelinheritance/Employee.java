package multilevelinheritance;

public class Employee extends Person {
	double salary;
	
	void input(int id, String name, double salary) {
		input(id, name);
		this.salary = salary;
	}
		void display() {
			super.display();
			System.out.println("Salary:"+salary);
			
		
	}
	

}
