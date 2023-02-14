package ch02;

public class Refrigerator extends HomeAppliances implements RemoteController , SoundEffect{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 끕니다.");
	}

	@Override
	public void soundOn() {
		// TODO Auto-generated method stub
		System.out.println("띠리리링~ 냉장고 문열림");
	}

}
