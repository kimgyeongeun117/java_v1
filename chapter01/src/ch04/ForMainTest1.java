package ch04;

public class ForMainTest1 {

	// main 함수
	public static void main(String[] args) {

		// 화면에 구구단 2단을 출력하시오.
		int num = 2;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("=====================");

		// 화면에 구구단 3단을 출력하시오
		num = 3; // 변수의 효용

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("=====================");

		// 구구단 4단을 출력하시오
		num = 4;

		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("=====================");

		// 구구단 5단을 출력하시오

//		for(초기화식;조건식;증감식) {
//			
//		}

		// i 변수의 유효 범위 - scope 범위
		num = 5;
		for (int i = 1; i < 10; i++) {
			//
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		System.out.println("=====================");
		// 6단~9단 까지 출력
		for (int i = 6; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	} // end of main

} // end of class
