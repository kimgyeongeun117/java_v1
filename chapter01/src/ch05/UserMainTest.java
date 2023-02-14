package ch05;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest {

	// 메인함수
	public static void main(String[] args) {

		User user = new User();
		user.age = 27;
		user.id = "kimgyeongeun12345";
		user.location = "부산";
		user.name = "김경은";
		user.email = "kimgyeongeun117@gmail.com";
		user.tel = "010-****-****";

		System.out.println("이름 : " + user.name);
		System.out.println("id : " + user.id);
		System.out.println("지역 : " + user.location);
		System.out.println("나이 : " + user.age);
		System.out.println("email : " + user.email);
		System.out.println("전화번호 : " + user.tel);

	} // end of main

} // end of class
