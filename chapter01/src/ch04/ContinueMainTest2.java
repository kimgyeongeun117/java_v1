package ch04;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {

		// 스캐너를 사용해서 사용자에 정수 값을 입력 받아서 배수의 갯수를 출력하는 프로그램을 만들어보세요
		// 테스트 값은 1000 , (3입력하면 안에 배수가 몇개 있을까요?)

		// 1.스캐너 선언하기
		// 2.변수 결정하기
		// 3.식 만들어보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		final int MULTIPLE = sc.nextInt();
		System.out.println("몇까지 확인 하겠습니까");
		final int MAX = sc.nextInt();

		int num = 0;
		int count = 0;
		
		for(num=1;num<=MAX;num++) {
			//만약 3의 배수이면 화면에 출력하지 마시오
			if(num%MULTIPLE==0) {
				count++;
				continue;
			}
			
			//System.out.println("num : "+num);
		}
		
		System.out.println(MULTIPLE+"의 배수의 갯수는 "+count + "입니다.");
		

		//------------------------------
//		int num, input, count = 0;
//		final int TEST = 1000;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("입력할 값은 : ");
//		input = scanner.nextInt();
//
//		for (num = 1; num <= TEST; num++) {
//
//			if ((num % input) != 0) {
//				continue;
//			}
//			count++;
//		}
//
//		System.out.println("갯수는 : " + count);

	} // end of main

} // end of class
