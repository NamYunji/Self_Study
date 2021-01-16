package gui.swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	
	public static void main(String[] args) {
		new JPanelTest();
	}

	public JPanelTest() {
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//배치담당매니저
//		setLayout(new BorderLayout());
	//layout manager객체를 사용하지 않고 직접 좌표를 지정
		setLayout(null);
		
		//자식 컴포넌트 추가
		JPanel p1 = new JPanel();
		//색상명 입력
		p1.setBackground(Color.blue);
		JLabel l1 = new JLabel("panel1");
		p1.setBounds(100, 50, 300, 400);
		//add메소드 필요
	
		
		add(p1);
		
		setVisible(true);
		
	}
}
