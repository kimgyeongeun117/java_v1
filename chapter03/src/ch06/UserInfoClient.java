package ch06;

import java.util.Scanner;

public class UserInfoClient {

	static String dbName = "Oracle";

	// main --> 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {

		//UserInfoOracleDao  만들어주세요
		// 사용자 한테 정보를 입력 받는다 !!
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상 이상, pw 특수 문자 포함
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 :");
		String name = sc.nextLine();
		System.out.println("pw을 입력해주세요 :");
		String pw = sc.nextLine();
		
		//흐름 만들기
		//1.저장 기능, 2.수정 기능
		//dbName 변경해 가면서 코드 동작 확인해 주세요!!
		
		// 위에 받은 데이터를 Object 타입 변화 --> DTO
		UserInfo userInfo = new UserInfo(name, pw);

		IUserInfoDao dao;
		if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else if(UserInfoClient.dbName.equals("Oracle"))
		{
			dao = new UserInfoOracleDao();
		}else {
			dao = new UserInfoMsSqlDao();
		}
		
		//저장 기능
		dao.insertUserInfo(userInfo);
		//수정 기능
		dao.updateUserInfo(userInfo);
		
	}
}
