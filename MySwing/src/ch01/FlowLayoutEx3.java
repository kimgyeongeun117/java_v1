package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	//멤버 변수를 선언할 수  있는가
	//배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출
	//for문 활용할 수 있는가?
	//GUI 프로그램 익숙해 지기!!!
	
	private JButton[] buttons = new JButton[8];
	private FlowLayout flowLayout;
	
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayoutEx2");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton("button"+(i+1));
		}
		
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
	}
	
	private void setInitLayout() {
		setLayout(flowLayout);
		
		for(int i=0;i<buttons.length;i++) {
			add(buttons[i]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
