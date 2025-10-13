package abstraction;

public class Main {
	public static void main(String[] args) {
		Circle cir = new Circle(4.2);
		Rectangle rec = new Rectangle(19, 12);
		System.out.println("area of circle" + cir.area());
		System.out.println("perimeter of circle" + cir.perimeter());
		System.out.println("area of Rwectangle" + rec.area());
		System.out.println("Perimeter of Rectangle" + rec.perimeter());
		System.out.println(".....................................................");
		Employee fullTime = new FullTimeEmployee();
		Employee partTime = new PartTimeEmployee();

		System.out.println("Full-Time Employee Salary: " + fullTime.calculateSalary());
		System.out.println("Part-Time Employee Salary: " + partTime.calculateSalary());

		System.out.println(".....................................................");
		BankAccount s = new SavingsAccount();
		BankAccount c = new CurrentAccount();

		s.deposit();
		s.withdraw();
		s.calculateInterest();

		c.deposit();
		c.withdraw();
		c.calculateInterest();

		System.out.println(".....................................................");

		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		Vehicle v3 = new Truck();

		System.out.println("Car Max Speed: " + v1.getMaxSpeed());
		System.out.println("Bike Max Speed: " + v2.getMaxSpeed());
		System.out.println("Truck Max Speed: " + v3.getMaxSpeed());

		System.out.println(".....................................................");

		Order e = new ElectronicsOrder();
		Order c1 = new ClothingOrder();

		e.processOrder();
		e.shipOrder();

		c1.processOrder();
		c1.shipOrder();

		System.out.println(".....................................................");

		FileReader t = new TextFileReader();
		FileReader c2 = new CSVFileReader();

		t.readFile("sample.txt");
		c2.readFile("data.csv");
		System.out.println(".....................................................");

		PaymentGateway p1 = new CreditCardPayment();
		PaymentGateway p2 = new UPIPayment();

		p1.validatePayment();
		p1.makePayment();

		p2.validatePayment();
		p2.makePayment();
		System.out.println(".....................................................");

		Animal d = new Dog();
		Animal c3 = new Cat();
		Animal cw = new Cow();

		d.sound();
		c3.sound();
		cw.sound();
		d.sleep();
	}
}
