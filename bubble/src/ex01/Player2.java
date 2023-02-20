package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player2 extends JLabel implements Moveable2{
	
	private int x;
	private int y;
	private ImageIcon playerR,playerL;
	
	public Player2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
	}
	
	private void setInitLayout() {
		
		x=155;
		y=535;
		
		setSize(50,50);
		setLocation(x,y);
		setIcon(playerR);
	}

	@Override
	public void left() {
		setIcon(playerL);
		x = x - 10;
		setLocation(x,y);
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x,y);
	}

	@Override
	public void up() {
		System.out.println("점프 !");
	}

	@Override
	public void down() {
		System.out.println("p down");
	}

}
