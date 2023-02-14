package ch07;

public class Student {
	
	//학번과 이름을 정의
	// 생성자 
	private String studentNum;
	private String name;
	
	public Student(String num,String name) {
		this.studentNum = num;
		this.name = name;
	}
	
	//1
	//toString --> 학번,이름이 화면에 출력할 수 있도록 설계
	@Override
	public String toString() {
		return "[ 학번 : "+this.studentNum+"]"+"\n"+"[ 이름 : "+this.name+"]";
	}
	
	//2
	//equals 메서드를 재정의 해주세요!!!!
	//equals에서 이름이 같다면 동명이인입니다. 출력해주세요
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student targetStudent = (Student)obj;
			if(this.name==targetStudent.name) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}
	
}
