package courseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LiveCourse extends Course implements Enrollable {
	protected int maxStudents;
	protected List<Student> enrolledStudents;

	public LiveCourse(String courseId, String name, double price, Instructor instructor, int maxStuddents) {
		super(courseId, name, price, instructor);
		this.maxStudents = maxStuddents;
		this.enrolledStudents = new ArrayList<>();
	}

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	@Override
	public void enroll(Student student) throws EnrollmentException {
		for (Student s : enrolledStudents) {
			if (s.getStudentId().equalsIgnoreCase(student.getStudentId())) {
				throw new EnrollmentException("Student alredy enrolled");
			}
		}
		if (enrolledStudents.size() >= maxStudents) {
			throw new EnrollmentException("Course is full");

		}
		enrolledStudents.add(student);
	}

	@Override
	public void showDetails() {
		System.out.println("\n---LIVE COURSE DETAILS---");
		System.out.println("ID" + courseId);
		System.out.println("NAME" + name);
		System.out.println("Instructor" + instructor.getName());
		System.out.println("Price" + price);
		System.out.println("Max Students " + maxStudents);
		System.out.println("Enrolledd" + enrolledStudents.size());

	}

	@Override
	public double applyDiscount() {
		return price * 0.90;
	}
}
