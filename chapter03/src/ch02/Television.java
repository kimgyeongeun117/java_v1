package ch02;

public class Television extends HomeAppliances implements RemoteController, SoundEffect{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void soundOn() {
		// TODO Auto-generated method stub
		System.out.println("두두두 뚜두 ~~ 새삥~");
	}

}
