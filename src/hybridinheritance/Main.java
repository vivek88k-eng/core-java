package hybridinheritance;

public class Main {
	
	public static void main(String[] args) {
		Person p = new Person(1, "amit");
		Student s = new Student(2, "vivek", "BCA");
		Teacher t = new Teacher(3, "Meena", "cs");
		ResearchStudent rs = new ResearchStudent(4, "karan", "MCA", "AI");
		s.display();
		p.display();
		t.display();
		rs.display();
		System.out.println(".........................................");

		SportsCar sc = new SportsCar(101, "Ferrari", 2, 800);
		sc.display();

		System.out.println();
		Bike b = new Bike(102, "Yamaha", 150);
		b.display();
		System.out.println(".........................................");

		PremiumSavings ps = new PremiumSavings(201, "Vivek", 50000, 5.5, 1000);
		ps.display();

		System.out.println();
		LoanAccount la = new LoanAccount(202, "Ravi", 20000, 150000);
		la.display();
		System.out.println(".........................................");

		Smartphone sp = new Smartphone(301, "Samsung Galaxy", "IMEI12345", "Android", 128);
		sp.display();

		System.out.println();
		Laptop l = new Laptop(302, "HP Pavilion", 16, "Intel i7");
		l.display();
		System.out.println(".........................................");

		Bird b1 = new Bird(401, "Parrot");
		b1.display();
		b1.layEggs();

		System.out.println();
		Bat bat = new Bat(402, "Fruit Bat");
		bat.display();
		bat.giveBirth();
		bat.fly();
		System.out.println(".........................................");

	}
}
