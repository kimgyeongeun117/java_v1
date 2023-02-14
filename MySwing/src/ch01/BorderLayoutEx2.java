package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame {
	// BorderLayout <-- 컴포넌트들을 동서남북 센터
	// 배열과 for문 활용해서 코드 수정
	JButton[] buttons = new JButton[5];
	String[] direction = {"동","서","남","북","센터"};
	String[] borderDirection = {BorderLayout.EAST,BorderLayout.WEST,BorderLayout.SOUTH
			,BorderLayout.NORTH,BorderLayout.CENTER};
	
	public BorderLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}
	private void setInitLayout() {
		//setLayout();	: 배치관리자
		//setLaytout(new BorderLayout())	//기본 배치관리자는 borderlayout임
		//borderLayout, 매개변수 값 하나를 더 추가 시킬 수 있다. (방향 지정가능)
		for(int i=0;i<buttons.length;i++) {
			add(buttons[i],borderDirection[i]);
		}
		
		setVisible(true);
	}
	//코드 테스트
	public static void main(String[] args) {
		new BorderLayoutEx2();
	}
	//end of main
}
