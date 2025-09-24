package multilevelinheritance;
public class Manager extends Employee {
    String department;

    void inputManager(int id, String name, double salary, String dept) {
        input(id, name, salary);
        this.department = dept;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
    
	}
}
