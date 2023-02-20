package ch05;

import java.util.Scanner;

public class MainTest5 {
	
	public static void IsLeapYear(int year) {
		if(year%4==0) {
			if(year%100 ==0 && year%400 !=0) {
				System.out.println("윤년이 아닙니다");
			}else {				
				System.out.println("윤년입니다.");
			}
		}else {
			System.out.println("윤년이 아닙니다.");
		}
	}
	
	
	public static void main(String[] args) {
		// 윤년 계산하기
		// 4의 배수의 해는 윤년
		// 4의 배수이면서 100의 배수인 해는 윤년이 아님
		// 100의 배수이면서 400의 배수인 해는 윤년
		// 숫자를 입력받아서 윤년을 판단하기
		
		System.out.println("수를 입력하세요 : ");
		
		 
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		IsLeapYear(year);
		
	}
}


