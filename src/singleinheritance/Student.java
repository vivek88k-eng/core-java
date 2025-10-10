package singleinheritance;

public class Student extends Person {
	int rollNo;
	String course;
	
	public Student(String name, int age, int rollNo, String course) {
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
	}



	void showDetails() {
		System.out.println("Name:" +name + ",Age:" + age);
		System.out.println("Rollno:" + rollNo + "Couse:" + course);
		
	}
}
