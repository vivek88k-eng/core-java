package hybridinheritance;

public class ResearchStudent extends Student {
	String researchtopic;

	public ResearchStudent(int id, String name, String course, String researchtopic) {
		super(id, name, course);
		this.researchtopic = researchtopic;
	}
	void display() {
		//super.display();
		super.displayStudent();
		System.out.println("Research Topic" +researchtopic);
	}

}
