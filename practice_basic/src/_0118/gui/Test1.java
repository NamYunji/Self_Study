package _0118.gui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 방법2 : JFrame을 상속한 커스텀 클래스 작성后  객체 생성하기 (추천!)
public class Test1 extends JFrame{
	

	//1. Frame
	public Test1() {
		setLayout(null);
		//세팅
		setTitle("test1");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//2. panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.black);
		panel.setLocation(50, 50);
		panel.setSize(300, 300);
		
		//3. button
		JButton btn = new JButton("click");
		btn.setLayout(null);
		btn.setSize(100, 50);
		btn.setLocation(50, 20);
		btn.setBackground(Color.cyan);
		
//		btn.addActionListener(new MyActionListener());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("click!");
			}
		});	
		
		
		panel.add(btn);
		add(panel);
		
	}
	
	
//	public class MyActionListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("클릭!");
//		}
//	}
			
	public static void main(String[] args) {
		new Test1().setVisible(true);;
	}
	
	
	

}
