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
		
		System.out.println("��ȭ��ȣ �Է� ���α׷�!");
		try {
			fout=new FileWriter("C:\\Users\\user\\Desktop\\phone.txt");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String line=scanner.nextLine();
				if(line.equals("�׸�"))
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
