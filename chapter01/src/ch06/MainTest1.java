package ch06;

public class MainTest1 {

	//1.리턴 값이 int, 매개변수 n1,n2,n3 이름은 intAdd
	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;

		return result;
	}
	//2.리턴 값이 double 매개변수 n1,n2, 이름은 doubleAdd
	static double doubleAdd(double n1,double n2) {
		//매개변수 없이 바로 리턴
		return n1+n2;
	}
	//3.리턴값이 void,매개변수는 String article , 함수 이름은 printArticle 출력
	static void printArticle(String article) {
		System.out.println(article);
	}
	
	//테스트 - 실행 코드 main
	public static void main(String[] args) {
		//호출해서 수행!!!
		System.out.println(intAdd(1,2,3));
		System.out.println(doubleAdd(10,10));	//자동형 변환
		
		//오류발생
		//System.out.println(printArticle("dfsfdfs"));	//반환 값이 없는 것을 화면에 찍을 수 없다.	
		printArticle("프린트 아티클");
		
	}

}
