package ch01;

public class ex_Thread {

	public static void main(String[] args) {
		System.out.println("메인 쓰레드 시작");
		System.out.println(Thread.currentThread());
		ThreadWorker threadWorker1 = new ThreadWorker("스레드1");
		ThreadWorker threadWorker2 = new ThreadWorker("스레드2");
		ThreadWorker threadWorker3 = new ThreadWorker("스레드3");
		
		threadWorker1.start();
		threadWorker2.start();
		threadWorker3.start();
		
		System.out.println("메인 쓰레드 종료");
	}
}

class ThreadWorker extends Thread{
	int a;
	String name;
	
	public ThreadWorker(String name) {
		a=1;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			if(a>50) {
				break;
			}
			
			System.out.println("threadWorker "+name+"는 "+a);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			a++;
		}
	}
}
