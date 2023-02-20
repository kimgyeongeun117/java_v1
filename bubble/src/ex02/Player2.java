package ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player2 extends JLabel implements Moveable2{
	
	private int x;
	private int y;
	private ImageIcon playerR,playerL;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	public Player2() {
		initData();
		setInitLayout();
	}
	
	
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
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
		left = true;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				setIcon(playerL);
				x = x - 10;
				setLocation(x,y);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	@Override
	public void right() {
		right = true;
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				setIcon(playerR);
				x = x + 10;
				setLocation(x,y);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}

	@Override
	public void up() {
		System.out.println("점프 !");
		up = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<130/JUMPSPEED;i++) {
					y= y-JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				up = false;
				// 중력으로 내려가도록 
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<130/JUMPSPEED;i++) {
					y= y+ JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
			}
		}).start();
	}

}
