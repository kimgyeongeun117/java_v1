package ch02;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {
	
	public static void main(String[] args) {
		int[] randomArray = new int[6];
		LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
		
		randomArray = lottoRandomNumber.getLottoNumber();
		
		System.out.println("로또게임 시작~");
		
		for(int i=0;i<randomArray.length;i++) {
			System.out.print(randomArray[i]+"\t");
		}
	}
}

class LottoRandomNumber {
	int[] lotto = new int[6];

	//메서드 활용
	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		//랜덤 사용
		Random r = new Random();
		//배열의 길이를 활용해서 랜덤값 받기
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
}


