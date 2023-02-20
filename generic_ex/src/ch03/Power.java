package ch03;

import ch04.Material;

public class Power extends Material {
	@Override
	public String toString() {
		return "재료는 파우더입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 출력 합니다.");
	}
}
