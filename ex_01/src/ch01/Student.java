package ch01;

import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private String email;
	private List<Enrollment> enrollments;
	
	public Student(int studentId, String name, String email, List<Enrollment> enrollments) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.enrollments = enrollments;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	
	
}
