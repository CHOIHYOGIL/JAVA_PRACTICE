package Java_TextBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ch8_6 {

	public static void main(String[] args) {
		
		
		FileInputStream fn=null;
		FileOutputStream fn1=null;
		
		String path="C:\\Users\\user\\Desktop\\";
		String fileName="elvis1.txt";
		String fileName1="elvis2.txt";
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־���մϴ�.");
		
		try {
			fn=new FileInputStream(path+fileName);
			fn1=new FileOutputStream(path+"append.txt");
			writeToFile(fn,fn1);
			
			fn=new FileInputStream(path+fileName1);
			fn1=new FileOutputStream(path+"append.txt");
			writeToFile(fn,fn1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeToFile(FileInputStream fn, FileOutputStream fn1) {
		
		byte buf []=new byte[60];
		int count=0;
				
				while(true) {
					
					try {
						count=fn.read(buf,0,buf.length);
						if(count ==-1)
							break;
						if(count>0)
							fn1.write(buf,0,buf.length);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
	}

}
