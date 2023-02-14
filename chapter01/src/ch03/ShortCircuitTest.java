package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {

		// 관계 논리곱--->F-->F, 논리합 --T --T
		int num1 = 5;
		int i = 0;
		// 빠른 평가(short circuit evaluation)
		// 논리곱 시에 앞에서 false가 나오면 뒤의 연산 실행x
		// 논리합에서 앞에서 true가 나오면 뒤의 연산 실행x
		boolean value = ((num1 += 10) > 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("===========================");
		System.out.println(num1);
		System.out.println(i);
		System.out.println("===========================");
		//
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(i);
		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요
		// 그리고
		// 문제1 number2의 값은?
		int number1 = 10;
		int number2 = 20;
		boolean bool = ((number2 -= number1) > 10) && ((number2 += 1) > 10);
		System.out.println(bool);
		System.out.println(number2);
		// 풀이 : 논리곱 시에 앞의 항에서 false가 나오면 뒷항의 연산 실행x 따라서 앞의 연산만 실행하기에
		// number2에서 number1을 뺀값인 10이 결과
		System.out.println("==================");
		// 문제 2 number4의 값과 bool2의 결과는?
		int number3 = 3;
		int number4 = 14;
		boolean bool2 = ((number3 *= 10) > 10) || ((number4 -= 5) > 0);
		System.out.println(bool2);
		System.out.println(number3);
		System.out.println(number4);
		// 풀이 : 논리합 시에 앞의 항이 true인 경우 뒷항의 연산을 실행x 따라서 앞의 연산만 실행,
		// bool2는 true, 연산이 실행된 number3은 30 , number4의 값은 뒷항의 연산이 안된 14가 출력

	}

}
