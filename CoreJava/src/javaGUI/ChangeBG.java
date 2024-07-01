package javaGUI;
//import java.awt.FlowLayout;
//import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JButton btnRed, btnYellow, btnGreen;
	MyFrame(){
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		btnRed=new JButton("Red");
		btnRed.addActionListener(this);
		btnYellow=new JButton("Yellow");
		btnYellow.addActionListener(this);
		btnGreen=new JButton("Green");
		btnGreen.addActionListener(this);
		this.add(btnRed);
		this.add(btnYellow);
		this .add(btnGreen);
		this.setVisible(true);
//		this.setDefaultCloseOperation();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnRed) {
			this.getContentPane().setBackground(Color.RED);
		}
		else if(e.getSource()==btnYellow) {
			this.getContentPane().setBackground(Color.YELLOW);
		}
		else if(e.getSource()==btnGreen) {
			this.getContentPane().setBackground(Color.GREEN);

		}
	}
}

public class ChangeBG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
