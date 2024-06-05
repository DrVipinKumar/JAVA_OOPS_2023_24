package iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
        File fin =new File("src\\Welcome.java");
        File fout=new File("src\\WelcomeCopy.java");
        try {
			FileReader fr =new FileReader(fin);
			FileWriter fw=new FileWriter(fout);
			BufferedReader bfr=new BufferedReader(fr);
			BufferedWriter bfw=new BufferedWriter(fw);
			while((line=bfr.readLine())!=null)
			{
				bfw.write(line);
			}
			System.out.println("File Copied!");
			bfr.close();
			bfw.close();
			fr.close();
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
