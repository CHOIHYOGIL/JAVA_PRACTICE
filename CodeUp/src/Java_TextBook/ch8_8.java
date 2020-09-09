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
		System.out.println("C 드라이브에서 가장 큰 파일은 "+name+" 크기는 "+max+"입니다.");
	}

}
