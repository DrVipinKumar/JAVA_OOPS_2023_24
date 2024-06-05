package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CharRead {
	int ch;
	CharRead(){
		File f =new File("src\\\\data.txt");
		try {
			FileReader fr =new FileReader(f);
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class CharWrite {
	
	String data="this is my text file";
	CharWrite(){
		File f =new File("src\\data.txt");
		try {
			FileWriter fw =new FileWriter(f);
			fw.write(data);
//			for(int i=0;i<data.length();i++) {
//				fw.write((int)data.charAt(i));
//			}
			System.out.println("File created!");
		fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class ByteRead {
	int ch;
	ByteRead(){
		File f =new File("src\\sum.java");
		try {
			FileInputStream fr =new FileInputStream(f);
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class ReadCharFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    new CharWrite();
            new CharRead();
//            new ByteRead();
	}

}
