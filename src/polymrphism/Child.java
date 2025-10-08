package polymrphism;

public class Child extends Parent {
	void display() {
		System.out.println("method of child class");
	}

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.display();
		Child obj2 = new Child();
		obj2.display();
		Parent obj3 = new Child();
		obj3.display();

	}

}
