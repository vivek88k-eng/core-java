package hierarchicalinheritance;

public class Tester extends Employee {
    String tool;

    void inputTester(int id, String name, String tool) {
        input(id, name);
        this.tool = tool;
    }

   
    void display() {
        super.display();
        System.out.println("Testing Tool: " + tool);
    }
}
