package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장 해주세요
		// 1 - String,String
		Map<String,String> phoneNumber1 = new HashMap<>();
		
		// 전화번호 추가
		phoneNumber1.put("김경은", "010-2566-2988");
		phoneNumber1.put("김경은", "010-2566-2988");
		phoneNumber1.put("김채은", "010-3050-2988");
		phoneNumber1.put("안주선", "010-9470-2988");
		
		// key값은 중복 될 수 없다.
		System.out.println(phoneNumber1);
		
		// 전화번호 검색
		String phoneNumber = phoneNumber1.get("김경은");
		System.out.println(phoneNumber);
		// 2- String, Object(Person)
		
		
		

	}

}
