package hybridinheritance;

public class Person {
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("name " + name);
		System.out.println("Id " +id);
	}
	

}
