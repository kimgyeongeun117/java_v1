package ch05;

import java.util.Scanner;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest2 {

	// 메인함수
	public static void main(String[] args) {

		// 스캐너를 활용해서 값을 입력받고 화면에 뿌려 주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.println(num);
		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		User userLee = new User();
		User userKim = new User();

		userKim.age = 27;
		userKim.id = "kimgyeongeun12345";
		userKim.location = "부산";
		userKim.name = "김경은";
		userKim.email = "kimgyeongeun117@gmail.com";
		userKim.tel = "010-****-****";

		// 정보를 출력해주세요
		System.out.println("======상태창=======");
		System.out.println("이름 : " + userKim.name);
		System.out.println("id : " + userKim.id);
		System.out.println("지역 : " + userKim.location);
		System.out.println("나이 : " + userKim.age);
		System.out.println("email : " + userKim.email);
		System.out.println("전화번호 : " + userKim.tel);
		// 코드 작성
		System.out.println("==================");

		System.out.println("id를 입력해주세요 : ");
		userLee.id = sc.nextLine();
		System.out.println("나이를 입력해주세요 : ");
		userLee.age = sc.nextInt();
		sc.nextLine(); // nextInt 끝에 붙는 개행문자 \n을 제거하기 위해서
		System.out.println("지역을 입력해주세요 : ");
		userLee.location = sc.nextLine();
		System.out.println("이름을 입력해주세요 : ");
		userLee.name = sc.nextLine();
		System.out.println("이메일을 입력해주세요 : ");
		userLee.email = sc.nextLine();
		System.out.println("전화번호를 입력해주세요 : ");
		userLee.tel = sc.nextLine();

	} // end of main

} // end of class
