package ch03;

public class MainTest2 {

	// 코드의 시작점 (main함수)
	public static void main(String[] args) {

		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = (int)(5.0/4.0);
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);		//1.25~이지만 강제 형변환으로 뒤에 값 버림
		System.out.println(number5);

		System.out.println("===============");
		
		//문제 
		//1.(12+3)/3을 화면에 출력하시오
		int n1 = (12+3)/3;
		System.out.println(n1);
		//2.(25%2) 값을 화면에 출력하시오.
		int n2 = (25%2);
		System.out.println(n2);
		//3. 3.0/5를 정수값 result 변수에 담아주시오.
		int result = (int)(3.0/5);
		System.out.println(result);
	} // end of main

} // end of class
