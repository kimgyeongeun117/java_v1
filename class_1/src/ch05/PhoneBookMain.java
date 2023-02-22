package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {
	
	public static void PutName(Scanner scanner,Map<String, String> phoneBook) {
		System.out.println("저장할 이름은? :");
		String userName = scanner.nextLine();
		System.out.println("저장할 전화번호는? :");
		String userPhoneNumber = scanner.nextLine();
		phoneBook.put(userName, userPhoneNumber);
	}
	
	public static void PrintNameAll(Map<String, String> phoneBook) {
		System.out.println("-----------------");
		for(String key : phoneBook.keySet()) {
			System.out.println("이름 : "+ key);
			System.out.println("전화번호 : "+ phoneBook.get(key));
		}
		System.out.println("-----------------");
	}
	
	public static void PrintNameSelect(Scanner scanner,Map<String, String> phoneBook) {
		System.out.println("조회할 사람은? :");
		String name=scanner.nextLine();
		System.out.println("-----------------");
		System.out.println("조회한 사람의 전화번호는 :"+phoneBook.get(name)); 
		System.out.println("-----------------");
	}
	
	public static void RemoveSelect(Scanner scanner,Map<String, String> phoneBook) {
		System.out.println("삭제할 사람은? :");
		String name = scanner.nextLine();
		phoneBook.remove(name);
		System.out.println("삭제하였습니다.");
	}
	
	public static void RemoveAll(Map<String, String> phoneBook) {
		phoneBook.clear();
		System.out.println("전체 삭제 되었습니다.");
	}

	public static void main(String[] args) {
		
		// while  0 종료, 1.저장 2.전체조회 3. 선택조회 4. 선택삭제 5.전체 삭제
		Map<String, String> phoneBook = new HashMap<>();
		Scanner  scanner = new Scanner(System.in);
		System.out.println(">> 기능을 선택해주세요 <<");
		String userInput = "-1";
		String userName;
		String userPhoneNumber;
		
		while(userInput != "0") {
			System.out.println("0 종료, 1.저장 2.전체조회 3. 선택조회 4. 선택삭제 5.전체 삭제");
			userInput = scanner.nextLine();
			switch (userInput) {
			case "0":
				System.out.println("종료 되었습니다.");
				return;
			case "1":
				PutName(scanner, phoneBook);
				break;
			case "2":
				PrintNameAll(phoneBook);
				break;
			case "3":
				PrintNameSelect(scanner, phoneBook);
				break;
			case "4":
				RemoveSelect(scanner, phoneBook);
				break;
			case "5":
				RemoveAll(phoneBook);
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}
		
	}
	
	

}

