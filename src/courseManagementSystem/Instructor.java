package courseManagementSystem;

public class Instructor {
	protected String instructorId;
	protected String name;
	public Instructor(String instructorId, String name) {
		super();
		this.instructorId = instructorId;
		this.name = name;
	}
	
	public String getInstructorId() {
		return instructorId;
	}
	public String getName() {
		return name;
	}
}
