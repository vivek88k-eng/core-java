package hybridinheritance;

public class Teacher extends Person {
	String subject;

	public Teacher(int id, String name, String subject) {
		super(id, name);
		this.subject = subject;
	}
	
	void display() {
		super.display();
		System.out.println("Subject " + subject);
	}

}
