package ch01;

//쓰레드 만들어 보기(생성)
//- 상속 활용해서 쓰레드 만들어보기 (작업자 만들어 보기)
//쓰레드를 상속한 클래스 이다. 즉 Worker는 Thread 이기도 하다 - 다형성
class Worker extends Thread{
	
	private String name;
	public Worker(String name) {
		this.name = name;
	}
	
	// 약속 부분!
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그럼 쓰레드는 run 메서드 안에 있는 부분을 수행 시킨다.
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("worker "+name+" : "+i+"    "+Thread.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	//end of run !!!
}
