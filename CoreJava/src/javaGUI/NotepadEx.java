package javaGUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
class Notepad extends JFrame {
	JTextArea text;
	JMenuBar menuBar;
	JMenu file,edit,about;
	JMenuItem fileNew,fileSave,fileOpen,fileExit;
	JMenuItem editCut,editCopy,editPaste;
	JFrame thisRef=this;
	Font font;
	 Notepad(){
		 font=new Font("Area",Font.BOLD,20);
		 text=new JTextArea();
		 text.setFont(font);
		 menuBar=new JMenuBar();
		 this.setJMenuBar(menuBar);
		 file =new JMenu("File");
		 file.setMnemonic(KeyEvent.VK_F);
		 fileNew=new JMenuItem("New");
		 fileNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("");
				thisRef.setTitle("Document1.txt");
			}});
		 fileSave=new JMenuItem("Save");
		 fileSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser file=new JFileChooser();
				FileNameExtensionFilter filter=new FileNameExtensionFilter("Text(.txt)","txt");
				file.setAcceptAllFileFilterUsed(false);
				file.addChoosableFileFilter(filter);
				int action=file.showSaveDialog(text);
				if(action==JFileChooser.APPROVE_OPTION) {
					try {
						BufferedWriter br=new BufferedWriter(new FileWriter(file.getSelectedFile().getAbsoluteFile()));
						text.write(br);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}});
		 fileOpen=new JMenuItem("Open");
		 fileOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser file=new JFileChooser();
			//	FileNameExtensionFilter filter=new FileNameExtensionFilter(".txt","Text(.txt) file");
			//	file.setAcceptAllFileFilterUsed(false);
			//	file.addChoosableFileFilter(filter);
				int action=file.showOpenDialog(thisRef);
				if(action==JFileChooser.APPROVE_OPTION)
				{
					try {
						BufferedReader br=new BufferedReader(new FileReader(file.getSelectedFile().getAbsoluteFile()));
						try {
							text.read(br,null);
							thisRef.setTitle(file.getSelectedFile().getName());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}});
		 fileExit=new JMenuItem("Exit");
		 fileExit.addActionListener(new ActionListener() {
			 @Override
				public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			 
			 }
		 });
		 file.add(fileNew);
		 file.add(fileOpen);
		 file.add(fileSave);
		 file.add(fileExit);
		 edit =new JMenu("Edit");
		 editCut=new JMenuItem("Cut");
		 editCut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.cut();
			}});
		 editCopy=new JMenuItem("Copy");
		 editCopy.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					text.copy();
				}});
		 editPaste=new JMenuItem("Paste");
		 editPaste.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					text.paste();
				}});
		 edit.add(editCut);
		 edit.add(editCopy);
		 edit.add(editPaste);
		 edit.setMnemonic(KeyEvent.VK_E);
		 about =new JMenu("About");
		 about.setMnemonic(KeyEvent.VK_A);
		 about.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "KIET Java Swing");
			}			 
		 });
		 menuBar.add(file);
		 menuBar.add(edit);
		 menuBar.add(about);
		 this.add(new JScrollPane(text),BorderLayout.CENTER);
		 this.setTitle("Document.txt");
		 this.setSize(1000,600);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);
	 }
}
public class NotepadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new Notepad();
	}

}
