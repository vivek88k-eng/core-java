package multilevelinheritance;

public class Main {
    public static void main(String[] args) {
        // Person → Employee → Manager
        Manager m = new Manager();
        m.inputManager(1, "vivek", 50000, "HR");
        m.display();
        System.out.println("-----");

        // Shape → Rectangle → Cuboid
        Cuboid c = new Cuboid();
        c.inputCuboid(2, "CuboidShape", 10, 5, 4);
        c.display();
        System.out.println("Area: " + c.area());
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("-----");

        // Animal → Dog → Puppy
        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p = new Puppy();
        a.sound();
        d.sound();
        p.sound();
        

        // Device → Mobile → Smartphone
        Smartphone s = new Smartphone();
        s.inputSmartphone(3, "Samsung", "12345ABC", "Android");
        s.display();
       

        // Account → SavingsAccount → FixedDeposit
        FixedDeposit fd = new FixedDeposit();
        fd.input(4, "Anil kr");
        fd.deposit(10000);
        fd.interestRate = 5;
        fd.years = 2;
        fd.display();
        System.out.println("Maturity Amount: " + fd.calculateMaturity());
        System.out.println("-----");

        // University → College → Department
        Department dept = new Department();
        dept.inputDept(5, "XYZ University", "Engineering College", "CSE", "Dr. Smith");
        dept.display();
    }
}

