package userDefineException;

public class Employee {
	private int salary;

	
	

	public void setSalary(int salary)throws NegativeSalaryException {
		if(salary<0) {
			throw new NegativeSalaryException("Invalid Salary Exception");
		}else {
			this.salary = salary;
		}
		
	}
	public int getSalary() {
		return salary;
	}
	
	
	

}
