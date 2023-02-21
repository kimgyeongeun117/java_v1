package ch06;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(1, "Bob", "bob@example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathematics");
		Course course2 = new Course(2, "English", "introduction to English");

		// 1번 학생이 Math 과정을 등록
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);

		// 학생의 데이터에 내가 등록한 정보를 저장 시킬 수 있다.
		// ArrayList<Enrollment> list = new ArrayList<>();
		// list.add(enrollment1);
		// student1.setEnrollments(enrollment1); // 통으로 List를 저장하는 녀석
		// 학생의 기능을 이용
		student1.addEnrollment(enrollment1); // 0번째 인덱스
		student1.addEnrollment(enrollment3); // 1번째 자료구조에 저장

		student2.addEnrollment(enrollment2); // Bob 등록신청 정보 저장

		// 문제1
		// Bob가 신청한 과정의 이름을 화면에 출력하시오
		System.out.println("Bob의 과정");
		for (int i = 0; i < student2.getEnrollments().size(); i++) {
			System.out.println(student2.getEnrollments().get(i).getCourse().getName());
		}

		// 문제2
		// Alice가 신청한 과정의 이름을 화면에 출력하시오
		System.out.println("-------------------");
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ", courseName : " + courseName);
		}
		System.out.println("---------------");
		// 위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드 이다.
		
		// Enrollment1 학생정보와 과목정보를 반복문을 통해서 출력해주세요
		// 학생이름 : 이름
		// 수강과목 : 과목 이름
		// ------------
		System.out.println("학생이름 : "+enrollment1.getStudent().getName());
		System.out.println("수강과목 : "+enrollment1.getCourse().getName());
		System.out.println("---------------");
		
		//arrayList를 생성해서 Enrollment를 저장해주세요
		ArrayList<Enrollment> enrollmentList = new ArrayList<>();
		enrollmentList.add(enrollment1);
		enrollmentList.add(enrollment2);
		enrollmentList.add(enrollment3);
		
		for (Enrollment e	: enrollmentList) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("---------------");
		}
		
		// foreach문으로 Alice의 수강하고 있는 과목 이름을 다시 한번 더 출력하시오
		for (Enrollment enrollment : student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());
		}
		
		// A,B,C,D - value
		
		
	}
}
