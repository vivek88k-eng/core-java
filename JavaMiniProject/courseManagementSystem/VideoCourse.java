package courseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class VideoCourse extends Course implements Enrollable {
	protected List<Student> enrollendStudents;

	public VideoCourse(String coourseId, String name, double price, Instructor instructor) {
		super(coourseId, name, price, instructor);
		this.enrollendStudents = new ArrayList<>();

	}

	public List<Student> getEnrolledStudents() {
		return enrollendStudents;
	}

	@Override
	public void enroll(Student student) throws EnrollmentException {
		for (Student s : enrollendStudents) {
			if (s.getStudentId().equalsIgnoreCase(student.getStudentId())) {
				throw new EnrollmentException("Student alredy enrolled");
			}
		}

		enrollendStudents.add(student);
	}

	@Override
	public void showDetails() {
		System.out.println("\n---VIDEO COURSE DETAILS---");
		System.out.println("ID" + courseId);
		System.out.println("NAME" + name);
		System.out.println("Instructor" + instructor.getName());
		System.out.println("Price" + price);
		System.out.println("TOTAL Enrolledd" + enrollendStudents.size());

	}

	@Override
	public double applyDiscount() {
		return price * 0.70;
	}
}
