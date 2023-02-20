package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	
	MyPanel myPanel;

	// 내부 클래스를 활용해서
	// JPanel 를 상속 받고 paint 메서드로 
	// 집 그림을 그려주세요
	class MyPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);			
			g.drawLine(300,100,200,200);
			g.drawLine(300,100,400,200);
			g.drawRect(200, 200, 200, 200);
			g.drawRect(250, 250, 100, 50);
			g.drawLine(300,250,300,300);
			g.drawLine(250,275,350,275);
			g.drawLine(0,400,600,400);
			
			g.drawOval(50, 50, 100, 100);
			g.drawLine(130,140,160,180);
			g.drawLine(100,150,100,200);
			g.drawLine(150,100,200,100);
			g.drawLine(50,100,00,100);
			g.drawLine(100,50,100,10);
			g.drawLine(130,60,180,30);
			g.drawLine(70,140,20,180);
			g.drawLine(70,60,20,30);
			
			g.drawString("★★★★★★★",500,50);
			g.drawString(" ★★★★★ ",500,60);
			g.drawString(" ★★★★★ ",500,40);
			
			g.drawString("★★★★★★",300,50);
			g.drawString(" ★★★★ ",300,40);
			g.drawString(" ★★★★ ",300,60);
			
			
		}
	}
	
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	private void setInitLayout() {
		add(myPanel);
		setVisible(true);
	}
	
}
