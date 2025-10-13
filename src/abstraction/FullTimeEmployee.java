package abstraction;

public class FullTimeEmployee extends Employee {
    double monthlySalary = 50000; 

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}


