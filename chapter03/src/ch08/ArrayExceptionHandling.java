package ch08;

public class ArrayExceptionHandling {
	
	public static void main(String[] args) {
		
		// 배열 선언과 동시에 초기화 하기
		//int[] arr =new int[10];	
		int[] arr = {1,2,3,4,5};	// length - 5, index - 4
		
		
		try {
			for(int i=0;i<10;i++) {
				//컴파일시점
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			//오류가 생겨도 비정상 종료되지 않고 다음으로 갈 수 있게 해줌
			//런타임시점
			System.out.println("개발자야 인덱스 길이 모르니!!!");
		}
		
		System.out.println("비정상 종료되지 않았습니다");
		
	}	//end of main
}	//end of class
