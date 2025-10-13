package abstraction;

public class PartTimeEmployee extends Employee {
    int hoursWorked = 80;
    double hourlyRate = 500;

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
