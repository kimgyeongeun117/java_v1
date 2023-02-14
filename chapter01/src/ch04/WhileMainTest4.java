package ch04;

import java.util.Scanner;

public class WhileMainTest4 {

	// 메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		final int USER_INPUT;
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요");
		// 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요.
		// do while 으로 코드를 작성해주세요.
		
		//상수 만들어 보기
		USER_INPUT = scanner.nextInt();

		while (num <= USER_INPUT) {
			sum += num;
			num++;
		}

		System.out.println("결과값 : " + sum);

	} // end of main

} // end of class
