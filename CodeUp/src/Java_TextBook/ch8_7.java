package Java_TextBook;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ch8_7 {

	public static void main(String[] args) {
		
		BufferedInputStream bfn=null;
		BufferedOutputStream bfn1=null;
		FileInputStream fn=null;
		FileOutputStream fn1=null;
		String path="C:\\Users\\user\\Desktop\\";
	
		File src=new File(path+"피드백3.PNG");
		File dest=new File(path+"answer1.PNG");
		
		try {
			fn=new FileInputStream(src);
			bfn=new BufferedInputStream(fn);
		
			fn1=new FileOutputStream(dest);
			bfn1=new BufferedOutputStream(fn1);
			long tenPercent=src.length()/10;
			long progress=0;
			
			System.out.println("a.jpg를 answer1.png로 복사합니다. ");
			
			int numRead=0;
			while(true) {
				
				byte [] buf=new byte[1024];
				numRead=bfn.read(buf,0,buf.length);
				
				if(numRead==-1) {

					if(progress>0) {
						System.out.print("*");
					}
					break;
				}
				
				if(numRead>0)
					bfn1.write(buf,0,buf.length);
				
				progress+=numRead;
				if(progress>=tenPercent) {
					System.out.print("*");
					progress=0;
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
