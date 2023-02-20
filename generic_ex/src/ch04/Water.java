package ch04;

public class Water extends Material{
	@Override
	public String toString() {
		return "재료는 물입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("물로 출력 합니다.");
	}
	
}
