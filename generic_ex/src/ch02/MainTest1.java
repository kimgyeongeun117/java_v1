package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		Power power  = new Power();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
		// 재료 넣기
		threeDPrinter3.setMaterial(plastic);	
		// 재료 꺼내보기
		Plastic usePlastic = (Plastic)threeDPrinter3.getMaterial();	//power일 경우 오류남
		
		//object <-- 불편한점들 존재한다.
		//다운 캐스팅 처리를 해야하고
		//런타임 시점에 잘못된 처리를 하게 되면 예외를 발생 시킬 수 있다.
		
	}	//end of main
}