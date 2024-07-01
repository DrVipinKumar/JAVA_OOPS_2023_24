package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
class KeyEventHandler implements KeyListener {
JTextArea jta;
     KeyEventHandler(JTextArea jta){
    	 this.jta=jta;
     }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n Key Typed"+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n Key Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n Key Released");
		
	}
	
}
class MouseEventHandler implements MouseListener {
JTextArea jta;
        MouseEventHandler(JTextArea jta){
        	this.jta=jta;
        }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		jta.setText(jta.getText()+"\n mouse Exit");
	}
	
}
class JFrameKeyMouse extends JFrame {
	JPanel pdraw;
	JTextArea jta;
	  JFrameKeyMouse()
	  {
//		  pdraw=new JPanel() {
//			  public void paint(Graphics g) {
//				  Graphics2D gg=(Graphics2D)g.create();
//				  gg.setColor(Color.RED);
//				  gg.drawRect(20, 20,100, 100);
//				  gg.fillOval(30, 200, 100, 100);
//			  }
//		  };
		  jta=new JTextArea();
		  jta.addKeyListener(new KeyEventHandler(jta));
		  jta.addMouseListener(new MouseEventHandler(jta));
		  this.setSize(1000,600);
		  this.setLocationRelativeTo(null);
//		 /		  this.add(pdraw,BorderLayout.CENTER);
		  this.add(jta,BorderLayout.CENTER);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setVisible(true);
	  }
}
public class KeyBoardEventEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new JFrameKeyMouse();
	}

}
