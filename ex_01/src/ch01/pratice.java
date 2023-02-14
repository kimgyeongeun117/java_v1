package ch01;

public class pratice {

	// 코드의 시작점(main 함수)
	public static void main(String[] args) {

		byte b;
		short s;
		int i;
		long l;

		b = 127;
		b = -128; // 128은 못만듬
		s = 128;
		// L value = R value
		i = 2100000000; // int는 약 21억까지 만들수 있음
		l = 2200000000l; // long타입을 쓸려면 접미사 l,L을 사용해야함
		// R value의 기본값이 int이기 때문에 바꿔주기 위해서
		char name, a, initial;

		name = 'A'; // 홑 따옴표를 사용해야 한다. " "<=이거는 문자열
		name = 'b'; // name = 'ab' 처럼 2개의 문자 초기화 불가능

		float fa = 0.5F; // 실수형 단위를 다룰때 R value 기본 연산단위는 double이다
		float fb = 12.9f; // 따라서 접미사 f,F를 붙여야함.
		double fc = 0.12345;
		double fd = 0.55; // 8바이트

		boolean isMarried = false; // 논리형 변수의 선언과 동시에 초기화
		isMarried = true;// 논리형 데이터 boolean의 크기는 1바이트
		// 1bit만 있어도 가능하지만 1byte를 쓰는건 기본 단위이기 때문에

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(fa);
		System.out.println(fb);
		System.out.println(fc);
		System.out.println(fd);
		System.out.println(isMarried);

	}

}
