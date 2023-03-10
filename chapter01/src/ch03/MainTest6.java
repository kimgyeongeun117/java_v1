package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		// 논리 연산자(&&, ||) 엠버센트, 버티컬 바
		// && <--- 논리곱
		// || <--- 논리합
		// ! <--- 부정
		// 연산의 결과값은 true,false이다.
		//보통 비교 연산자와 함께 많이 사용 된다.
		
		int num1 = 10;
		int num2 = 20;
		
//		boolean flag1 = (num1 > 0) && (num2 > 0);
//		System.out.println(flag1);
		
		boolean flag1 = (num1 > 0) || (num2 > 0);
		System.out.println(flag1);
		
		//	T&&F ---> F: 논리곱은 반드시 전부 T일때 만 T이다.
		flag1 = (num1>0)&& (num1<0);
		// !F ---> T
		System.out.println(!flag1);
		
		// T||F ---> T: 여러개중 하나라도 T이면 T이다. 
		boolean flag2 = (num1>0) || (num2<0);
		System.out.println(flag2);
		
		//결론 : 논리 곱에서는 하나라도 거짓이 있으면 연산에 결과는 false
		//		   : 논리 합에서 하나라도 참이 있으면 연산에 결과는 true이다.
		
		System.out.println(!(5>3));

	}

}
