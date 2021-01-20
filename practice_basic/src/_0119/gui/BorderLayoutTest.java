package _0119.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
	
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(300, 300, 500, 500);
		
		mf.setLayout(new BorderLayout());
		
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		mf.add(north, "North");
		mf.add(south, "South");
		mf.add(west, "West");
		mf.add(east, "East");
		mf.add(center, "Center");
		
		mf.setVisible(true);
	}
	
}
