package javaGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//class AwtGUI extends Frame {
//	AwtGUI(){
//		   this.setSize(600, 400);
//		  // this.setLocation(200, 200);
//		   this.setLocationRelativeTo(null);
//		   this.setVisible(true);	}
//}
class SwingGUI extends JFrame implements ActionListener {
	JLabel lheading,lusername,lpassword;
	JTextField txtUsername;
	JPasswordField txtPassword;
	JButton btnLogin,btnSum,btnChangeBG;
	Panel gridPanel;
	Font f,fu;
	SwingGUI(){
		f=new Font("Arial",Font.BOLD,30);
		fu=new Font("Arial",Font.BOLD,20);
		this.setSize(600,430);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		lheading=new JLabel("Login Information");
		lheading.setBounds(150, 20, 300, 50);
		lheading.setFont(f);
		lusername=new JLabel("Enter user name");
		lusername.setBounds(50, 0, 300, 200);
		lusername.setFont(fu);
		txtUsername=new JTextField();
		txtUsername.setBounds(50, 130, 300, 50);
		txtUsername.setFont(fu);
		lpassword=new JLabel("Enter password");
		lpassword.setBounds(50, 100, 300, 200);
		lpassword.setFont(fu);
		txtPassword=new JPasswordField();
		txtPassword.setBounds(50, 220, 300, 50);
		txtPassword.setFont(fu);
		btnLogin =new JButton("Login");
		btnLogin.setBounds(100, 300, 100, 50);
		btnLogin.setFont(fu);
		btnLogin.addActionListener(this);
		btnSum=new JButton("Add");
		btnSum.setBounds(250, 300, 100, 50);
		btnSum.setFont(fu);
		btnSum.addActionListener(this);
		btnChangeBG=new JButton("Change BG");
		btnChangeBG.setBounds(380, 300, 180, 50);
		btnChangeBG.setFont(fu);
		btnChangeBG.addActionListener(this);
		this.add(lheading);		
		this.add(lusername);
		this.add(txtUsername);
		this.add(lpassword);
		this.add(txtPassword);
		this.add(btnLogin);
		this.add(btnSum);
		this.add(btnChangeBG);
		//this.setBounds(600, 400, 600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnLogin)
		{
			if(txtUsername.getText().equalsIgnoreCase("kiet") 
					&& txtPassword.getText().equalsIgnoreCase("mca"))
			{
				JOptionPane.showMessageDialog(null, "Login OK!");
			} else {
				JOptionPane.showMessageDialog(null, "Login Failed!");
			}
		} else if (e.getSource()==btnSum) {
			int s=Integer.parseInt(txtUsername.getText())+Integer.parseInt(txtPassword.getText());
			JOptionPane.showMessageDialog(null, "Sum="+s);
		} else if (e.getSource()==btnChangeBG) {
			Color c =new Color(200,100,233);
			this.getContentPane().setBackground(c);
		}
	
	}
}
public class FirstAWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SwingGUI();
         //new AwtGUI();
	}

}
