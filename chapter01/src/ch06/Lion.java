package ch06;

/*
 * 함수를 선언하는 코드 방법
 * 함수를 사용하는 코드 방법
*/
//자바는 무조건 클래스 안에 써야함 
public class Lion {

	// 정수를 반환하는 함수
	// 함수를 설계하는 코드 작성
	static int addNumber(int n1, int n2) {
		// 함수 구현부(body)
		int result; // 지역 변수
		result = n1 + n2;

		return result; // return 키워드를 만나면 실행의 제어권을 반납한다.(데이터)
	}

	// 아무 값도 반환하지 않는 함수 -void
	static void sayHello(String name) {
		System.out.println(name + " 반갑습니다.");
	}

	// 매개변수가 없는 함수를 설계
	static int calcSum() {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		return sum;
	}

	// calcSum2 정수값 3개를 받아서 덧셈 연산후 결과를 반환 하시오. -->리턴 타입은 double
	static double calcSum2(int a, int b, int c) {
		double result = a + b + c;

		return result;
	}

	// calSum3 정수값 1,실수값 1, 논리값 1개 받고
	// "정수값 : " [] , 실수값 [], 논리값 [] <------ 문자열로 연산하고
	// 리턴타입 String을 만들어 주세요
	static String calcSum3(int a, double b, boolean c) {
		String result = "정수 값 : " + a + System.lineSeparator() + "실수 값 : " + b + "\n" + "논리 값 : " + c;
		// 개행: System.lineSeparator()와 \n사용

		return result;
	}

	// main 함수 - 텅빈, 리턴 값이 없다.
	public static void main(String[] args) {
		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber : " + myNumber);

		// 함수 호출2
		// 함수 호출할때는 모양 맞추기이다.
		sayHello("애쉬");
		sayHello("티모");
		sayHello("바론");
		// int a = myNumber;

		int calResult = calcSum();
		System.out.println(calResult);
		System.out.println(calcSum());

		int result2 = (int) calcSum2(1, 2, 3);
		System.out.println(result2);

		String localDataString = calcSum3(100, 0.5, true);
		System.out.println(localDataString);

	} // end of main

	// 함수란?
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드 묶음

} // end of class
