package Java_TextBook;

import java.io.File;

public class ch8_8 {

	public static void main(String[] args) {
		
		File f=new File("C:\\");
		
		File [] subFiles=f.listFiles();
		long max=0;
		String name="";
		for(int i=0; i<subFiles.length; i++) {
			
			if(!subFiles[i].isFile()) {
				continue;
			}
			long size=subFiles[i].length();
		
			if(max<size) {
				max=size;
		  name=subFiles[i].getName();
			}
			
		}
		System.out.println("C ����̺꿡�� ���� ū ������ "+name+" ũ��� "+max+"�Դϴ�.");
	}

}
