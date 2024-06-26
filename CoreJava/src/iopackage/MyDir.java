package iopackage;

import java.io.File;

class FileInfo {
	File f;
	FileInfo(String path){
		f=new File(path);
	}
	void getFileInfo() {
		System.out.println("Path=<<"+f.getAbsolutePath());
		System.out.println("IsRead Permission=<<"+f.canRead());
		System.out.println("Size =<<"+f.length()+" Bytes");
		System.out.println("Last Modified Date=<<"+f.lastModified());
	}
}
class ListFiles{
	File f;
	ListFiles(String path){
		f=new File(path);
	}
	void getFileListing() {
		File[] files=f.listFiles();
		for(File sf:files) {
			if(sf.isFile()) {
				System.out.println("File Path=<<"+sf.getAbsolutePath());
				System.out.println("IsRead Permission=<<"+sf.canRead());
				System.out.println("Size =<<"+sf.length()+" Bytes");
				System.out.println("Last Modified Date=<<"+sf.lastModified());
				System.out.println("Type=>File");
			} else {
				System.out.println("Directory Path=<<"+sf.getAbsolutePath());
				System.out.println("Type=>Directory");
			}
		}
	}
}

public class MyDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // new FileInfo("src\\Sum.java").getFileInfo();
		new ListFiles("src").getFileListing();
	}

}
