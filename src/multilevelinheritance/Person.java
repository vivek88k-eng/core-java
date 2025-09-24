package multilevelinheritance;

public class Person {
	int id;
	String name;
	
	void input(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
	
	

	

}
