package ch04;

public class ForMainTest2 {

	// main함수
	public static void main(String[] args) {

		int num = 2;
		for (int j = 2; j < 10; j++) {
			System.out.println("j : " + j);
		}

		for (int i = 1; i < 10; i++) {
			// i변수의 유효 범위는 end of 까지이다.
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		System.out.println("=====================");

		// 이중 for문을 활용하여 2 ~ 9 단까지 구구단을 출력해주세요
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("==============");
		}
		// *
		// ***
		// *****

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		// *
		// ***
		// *****

		for (int i = 0; i < 3; i++) {
			for (int j = 0; 4 - 2 * i > j; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		for (int i = 1; i <= 5; i += 2) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // end of main

} // end of class
