package hierarchicalinheritance;

public class Main {
    public static void main(String[] args) {
        // 8. Shape 
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);
        Shape s3 = new Triangle(6, 3);
        s1.area();
        s2.area();
        s3.area();
        System.out.println("-----");

        // 9. Employee 
        Developer dev = new Developer();
        dev.inputDev(1, "vinay", "Java");
        dev.display();
        Tester tester = new Tester();
        tester.inputTester(2, "ani", "Selenium");
        tester.display();
        System.out.println("-----");

        // 10. Vehicle 
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        car.fuelType();
        bike.fuelType();
        truck.fuelType();
        System.out.println("-----");

        // 11. Account 
        SavingsAccount sa = new SavingsAccount();
        sa.id = 101; sa.name = "Vivek"; sa.balance = 5000;
        sa.display();
        sa.withdraw(2000);
        CurrentAccount ca = new CurrentAccount();
        ca.id = 102; ca.name = "Mohit"; ca.balance = 1000;
        ca.display();
        ca.withdraw(1500);
        System.out.println("-----");

        // 12. Appliance 
        WashingMachine wm = new WashingMachine();
        wm.id = 201; wm.brand = "LG"; wm.capacity = 7;
        wm.display();
        Refrigerator r = new Refrigerator();
        r.id = 202; r.brand = "Samsung"; r.coolingType = "Frost Free";
        r.display();
        Microwave m = new Microwave();
        m.id = 203; m.brand = "IFB"; m.cookingModes = 5;
        m.display();
        System.out.println("-----");

        // 13. Sports 
        Sports cricket = new Cricket();
        Sports football = new Football();
        Sports hockey = new Hockey();
        cricket.play();
        football.play();
        hockey.play();
        System.out.println("-----");

        // 14. Animal 
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        cat.sound();
        dog.sound();
        cow.sound();
    }
}

