package javaGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class LayoutClass extends JFrame {
	JButton b1,b2,b3,b4,b5;
	JLabel lheading;
	Font f;
	JPanel p,psouth;
	LayoutClass(){
		b1=new JButton("B1");
		b2=new JButton("OK");
		b3=new JButton("B3");
		b4=new JButton("B4");
	    b5=new JButton("B5");
		f=new Font("Arial",Font.BOLD,30);
		p=new JPanel();
		p.setLayout(new GridLayout(2,2));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		psouth=new JPanel();
		psouth.add(b2);
		lheading=new JLabel("Complex Layout Example",SwingConstants.CENTER);
		lheading.setFont(f);
	//	this.setLayout(new FlowLayout());
	//	this.setLayout(new GridLayout(3,2));
//		this.add(b1);
//		this.add(b2);
//		this.add(b3);
//		this.add(b4);
//		this.add(b5);
		this.add(lheading,BorderLayout.NORTH);
		this.add(psouth,BorderLayout.SOUTH);
		this.add(p,BorderLayout.CENTER);
	//	this.add(b4,BorderLayout.EAST);
	//	this.add(b5,BorderLayout.WEST);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
public class LayoutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new  LayoutClass();
	}

}
