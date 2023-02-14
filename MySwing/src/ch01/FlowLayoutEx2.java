package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	//배열로 선언
	//1단계 JButton 2개 생성
	private JButton[] buttons = new JButton[8];
	
	private FlowLayout flowLayout;
	//배치관리자 FlowLayout 멤버변수로 선언
	//화면에 Component를 그려주세요!
	public FlowLayoutEx2() {
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
		new FlowLayoutEx2();
	}
}
