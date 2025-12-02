
package courseManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMS {
	private static List<Student> students = new ArrayList<>();
	private static List<Instructor> instructors = new ArrayList<>();
	private static List<Course> courses = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n-----STUDENT MANAGEMENT SYSTEM-----");
			System.out.println("1.Register Student");
			System.out.println("2.Register Instructor");
			System.out.println("3.Create Course");
			System.out.println("4.Enroll student into course");
			System.out.println("5.show ALl Course");
			System.out.println("6.Genrate Enrollment Report");
			System.out.println("7.Show CourseDetails");
			System.out.println("8.Show Discont Price");
			System.out.println("9.Show Course of Student");
			System.out.println("10.Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> registerStudent();
			case 2 -> registerInstructor();
			case 3 -> createCourse();
			case 4 -> enrollStudent();
			case 5 -> showCourses();
			case 6 -> showEnrollmentReport();
			case 7 -> showDetails();
			case 8 -> applyDiscount();
			case 9 -> showCoursesOfStudent();
			case 10 -> System.out.println("Exiting..............");
			default -> System.out.println("Invaild Choice.");

			}

		} while (choice != 10);
	}
 private static void showCoursesOfStudent() {
	 sc.nextLine();
	System.out.println("Enter Student ID:");
	String sid = sc.nextLine();
	boolean found = false;
	for (Course c : courses) {
	  List<Student> list = c.getEnrolledStudents();
	for(Student s : list) {
		if (s.getStudentId().equalsIgnoreCase(sid)) {
			if(!found) {
				System.out.println("\nStudent is enrolled in :");
				found = true;
			}
			System.out.println("Course Name->" + c.getName());
		}
	}
	}
	if(!found) {
		System.out.println("Student is not enrolled in any courses");
	}
}
	private static void registerStudent() {
		System.out.print("Enter Student ID:");
		String id = sc.next();
		sc.nextLine();
		for (Student s : students) {
			if (s.getStudentId().equalsIgnoreCase(id)) {
				System.out.println("Student with this ID alredy exists");
				return;
			}
		}
		sc.nextLine();
		System.out.print("EnterStudent Name:");
		String name = sc.nextLine();
		Student st = new Student(id, name);
		students.add(st);
		System.out.println("STUDENT REGISTERED SUCCESSFULLY");
	}

	private static void registerInstructor() {
		System.out.print("Enter Instructor ID:");
		String id = sc.next();
		sc.nextLine();
		for (Instructor i : instructors) {
			if (i.getInstructorId().equalsIgnoreCase(id)) {
				System.out.println("Instructor with this ID alredy exists");
				return;
			}

		}
		System.out.print("Enter Instructor Name ");
		String name = sc.nextLine();
		sc.nextLine();
		Instructor inst = new Instructor(id, name);
		instructors.add(inst);
		System.out.print("Intructor Registered Successfully");
	}

	private static void createCourse() {
		System.out.print("Enter Course ID");
		;
		String id = sc.next();
		for (Course c : courses) {
			if (c.getCourseId().equalsIgnoreCase(id)) {
				System.out.println("Course with this ID alredy exists");
				return;
			}
		}
		System.out.print("Enter course Name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter course Price");
		double price = sc.nextDouble();

		// -------------------------------------------------------------
		if (instructors.isEmpty()) {
			System.out.println("NO Instructor registerd yet ");
			return;
		}
		System.out.println("\nAvailable Instructors");
		for (Instructor inst : instructors) {
			System.out.println(inst.getInstructorId() + "|" + inst.getName());
		}
		System.out.println("Enter Instructors ID to assign");
		String instId = sc.next();
		Instructor selectedInstructor = null;
		for (Instructor inst : instructors) {
			if (inst.getInstructorId().equalsIgnoreCase(instId)) {
				selectedInstructor = inst;
				break;
			}
		}
		if (selectedInstructor == null) {
			System.out.println("Invalid Instructor ID");
			return;
		}
		System.out.println("\nSelect Course Type:");
		System.out.println("1.Live Course");
		System.out.println("2.Video Course");
		System.out.println("Choice");
		int type = sc.nextInt();
		Course newCourse = null;
		if (type == 1) {
			System.out.println("Enter Maximum Student Allowed ");
			int max = sc.nextInt();
			newCourse = new LiveCourse(id, name, price, selectedInstructor, max);
		} else if (type == 2) {
			newCourse = new VideoCourse(id, name, price, selectedInstructor);
		} else {
			System.out.println("Invalid Course typed");
			return;
		}
		courses.add(newCourse);
		System.out.println("Course created Successfullly");

	}

	private static void enrollStudent() {

		if (students.isEmpty()) {
			System.out.println("No students registered yet!");
			return;
		}

		if (courses.isEmpty()) {
			System.out.println("No courses created yet!");
			return;
		}

		System.out.println("\nEnter Student ID: ");
		String sid = sc.next();

		Student selectedStudent = null;

		for (Student s : students) {
			if (s.getStudentId().equalsIgnoreCase(sid)) {
				selectedStudent = s;
				break;
			}
		}

		if (selectedStudent == null) {
			System.out.println("Invalid Student ID!");
			return;
		}

		System.out.println("\nEnter Course ID to Enroll: ");
		String cid = sc.next();

		Course selectedCourse = null;

		for (Course c : courses) {
			if (c.getCourseId().equalsIgnoreCase(cid)) {
				selectedCourse = c;
				break;
			}
		}

		if (selectedCourse == null) {
			System.out.println("Invalid Course ID!");
			return;
		}

		try {
			if (selectedCourse instanceof Enrollable) {
				((Enrollable) selectedCourse).enroll(selectedStudent);
				System.out.println("Student enrolled successfully!");
			} else {
				System.out.println("This course type cannot enroll students!");
			}
		} catch (EnrollmentException e) {
			System.out.println("Enrollment Failed: " + e.getMessage());
		}
	}

	private static void showEnrollmentReport() {

		System.out.println("\n===== ENROLLMENT REPORT =====");

		if (courses.isEmpty()) {
			System.out.println("No courses created yet!");
			return;
		}

		for (Course c : courses) {
			System.out.println("\nCourse: " + c.getName());
			System.out.println("Instructor: " + c.getInstructor().getName());
			System.out.println("Price: " + c.getPrice());

			if (c instanceof LiveCourse live) {
				printStudents(live.getEnrolledStudents());
			} else if (c instanceof VideoCourse video) {
				printStudents(video.getEnrolledStudents());
			}
		}
	}

	private static void printStudents(java.util.List<Student> list) {
		if (list.isEmpty()) {
			System.out.println("  No students enrolled.");
			return;
		}

		System.out.println("  Enrolled Students:");
		for (Student s : list) {
			System.out.println(" ID  - " + s.getStudentId() + "| NAME : " + s.getName());
		}
	}

	private static void showCourses() {
		if (courses.isEmpty()) {
			System.out.println("NO courses created yet");
			return;
		}
		System.out.println("\n-----ALL COURSE-----");
		for (Course c : courses) {
			System.out.println("ID->"+
					c.getCourseId() + "|COURSE NAME->" + c.getName() + "|PRICE->" + c.getPrice() + "|INSTRUCTOR NAME->" + c.getInstructor().getName());
		}
	}

	private static void showDetails() {
		System.out.print("Enter Course Id");
		String id = sc.next();
		for (Course c : courses) {
			if (c.getCourseId().equalsIgnoreCase(id)) {
				c.showDetails();
				return;
			}
		}
		System.out.println("Invalid Course Id");
	}

	private static void applyDiscount() {
		System.out.print("Enter Course ID");
		String id = sc.next();
		for (Course c : courses) {
			if (c.getCourseId().equalsIgnoreCase(id)) {
				System.out.println("Original Peice" + c.getPrice());
				System.out.println("After Discount " + c.applyDiscount());
				return;
			}
		}
		System.out.println("Invalid Course Id");
	}

}
