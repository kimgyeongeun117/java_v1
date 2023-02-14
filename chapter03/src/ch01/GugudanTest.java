package ch01;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end;

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 시작값과 끝값을  입력해주세요");
		start = sc.nextInt();
		end = sc.nextInt();

		System.out.println("--------------");
		for (int i = start; i <= end; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "= " + (i * j));
			}
			System.out.println("--------------");
		}

	}

}
