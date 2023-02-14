package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{

	private JButton[] buttons = new JButton[6];
	//JButton <---
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("연습");
		setSize(1100,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0;i<buttons.length;i++) {
			buttons[i] = new JButton("계단"+(i+1));
			buttons[i].setSize(100,100);
		}
		
	}
	private void setInitLayout() {
		setLayout(null);
		for(int i=0;i<buttons.length;i++) {
			
			buttons[i].setLocation(100+(i*100), 100+(i*50));
			add(buttons[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
	
}
