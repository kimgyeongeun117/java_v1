package ch01;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		// 자동차 클래스는 엔진 클래스에 의존합니다 -> 엔진 클래스가 있어야 생성이 된다.
		this.engine = engine;
	}
	
	public void start() {
		engine.start(); 	// 값을 넣어주지 않으면(생성자에서 초기화 필요) NullPoint ...
		System.out.println("Car started");
	}
}
