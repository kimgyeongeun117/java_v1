package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤 번호 발생하는 클래스 1~45
// get,set
// 6개 번호를 리턴하는 기능, 정렬까지 책임
public class LottoRandomNumber {
	int[] lotto = new int[6];
	
	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// 중복 값 확인을 위해 반복문을 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
					// 중복 발생
					i--;
					break;
				}
			}
		} // end of for
			// 오름 차순 정렬
		Arrays.sort(lotto); // 배열을 정렬 해주는 기능
		return lotto;
	}
}
