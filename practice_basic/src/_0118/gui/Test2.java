package _0118.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test2 extends JFrame{
	
	public Test2() {
		setLayout(null);
		setSize(500, 300);
		setTitle("test");
		setLocationRelativeTo(null);
		setBackground(Color.black);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(300, 200);
		panel.setLocation(50, 50);
		panel.setBackground(Color.pink);
		
		JLabel label = new JLabel("hello");
		label.setLayout(null);
		label.setForeground(Color.cyan);
		label.setLocation(10, 10);
		label.setSize(50, 50);
		
		JButton button = new JButton("클릭");
		button.setLayout(null);
		button.setBackground(Color.red);
		button.setLocation(20, 50);
		button.setSize(150, 50);
		button.setForeground(Color.blue);
		
		button.addActionListener(new MyActionListener());
		
		
		
		add(panel);
		panel.add(label);
		panel.add(button);
	}
	
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("클릭!!");
		}
		
	}
	
	public static void main(String[] args) {
		new Test2().setVisible(true);;
	}

}
