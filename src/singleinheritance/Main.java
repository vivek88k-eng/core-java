package singleinheritance;



public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Vehicle & Car Example ===");
        Car car = new Car("Toyota", "Corolla");
        car.start();
        System.out.println();
        car.drive();

        System.out.println("\n=== Employee & Manager Example ===");
        Manager manager = new Manager("John", 85000, "IT Department");
        manager.showDetails();

        System.out.println("\n=== Shape & Rectangle Example ===");
        Rectangle rect = new Rectangle("Rectangle", 12.5, 8.0);
        rect.display();

        System.out.println("\n=== Person & Student Example ===");
        Student student = new Student("Alice", 21, 101, "Computer Science");
        student.showDetails();

        System.out.println("\n=== BankAccount & SavingAccount Example ===");
        SavingAccount sa = new SavingAccount("AC12345", 10000, 5.0);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.addInterstRate();
        sa.display();

        System.out.println("\n\n=== All examples executed successfully ===");
    }
}

