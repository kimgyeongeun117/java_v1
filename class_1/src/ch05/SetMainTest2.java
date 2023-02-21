package ch05;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {

	public static void main(String[] args) {

		HashSet<Integer> numberSet = new HashSet<>();
		HashSet<Integer> numberSet2 = new HashSet<>();
		
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());
		
		// 무조건 6개 사이즈를 가지는 numberSet을 구성하시오
		// hint --> 반복문 사용
		int count = 0;
		while(numberSet2.size()<6) {
			count++;
			numberSet2.add(getRandomNumber());
		}
		System.out.println(numberSet2.size());
		System.out.println(numberSet2.toString());
		System.out.println("반복 횟수 : "+count);

	} // end of main
	
	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45)+1;
	}

} // end of class
