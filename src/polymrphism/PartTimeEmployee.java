package polymrphism;


public class PartTimeEmployee extends Employee {
 
 void calculateSalary() {
     double salary = 20000;
     System.out.println("Part-time Employee Salary: " + salary);
 }

 
 public static void main(String[] args) {
     Employee e;

     e = new FullTimeEmployee();
     e.calculateSalary();

     e = new PartTimeEmployee();
     e.calculateSalary();
 }
}


