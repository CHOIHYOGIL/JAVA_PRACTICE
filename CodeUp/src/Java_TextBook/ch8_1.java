package Java_TextBook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ch8_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		FileWriter fout=null;
		
		System.out.println("전화번호 입력 프로그램!");
		try {
			fout=new FileWriter("C:\\Users\\user\\Desktop\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >>");
				String line=scanner.nextLine();
				if(line.equals("그만"))
					break;
				if(line.length()==0)
					break;
				fout.write(line);
				fout.write("\r\n");
			}
	
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	}

}
