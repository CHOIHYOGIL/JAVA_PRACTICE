package Java_TextBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ch8_3 {

	public static void main(String[] args) {
		
		File f=new File("C:\\Windows\\system.ini");
		FileReader fin=null;
		try {
			fin=new FileReader(f);
			Scanner sc=new Scanner(fin);
			System.out.println(f.getPath()+"파일을 읽고 출력");
		
			int i=0;
			while(sc.hasNext()) {
				i++;
				String line=sc.nextLine();
				System.out.print(i+" :");
				System.out.println(line);
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
