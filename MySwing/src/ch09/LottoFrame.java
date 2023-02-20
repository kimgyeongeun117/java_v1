package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener{
	
	//화면을 담당!!
	//LottoRandomNumber 클래스에 받아서 처리해 보자
	JButton button;
	LottoRandomNumber lottoClass;
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start");
		lottoClass = new LottoRandomNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작!");
		isStart = true;
		// 그림을 다시 그리다
		repaint(); // F5 : paint메서드 호출
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int[] lotto = lottoClass.getLottoNumber();
		// g.setColor(Color.BLACK);
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);
		if (isStart == false) {
			// 게임 초기 상태
			g.drawString("로또 번호를 클릭하세요", 180, 200);
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미 이다.
		// 그럼 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있다.

		for (int i = 0; i < lotto.length; i++) {
			g.drawString(lotto[i] + "", 50 + (100 * i), 200); // <--- 여기서 오류 나는 이유는 뭘까요????
		}
	}
}
