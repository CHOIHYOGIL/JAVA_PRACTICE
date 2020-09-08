package Java_TextBook;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ch8_2 {
	
	public static void main(String []args) {
		
		Scanner scanner=new Scanner(System.in);
		FileReader fin=null;
		try {
			 fin=new FileReader("C:\\Users\\user\\Desktop\\phone.txt");
			int c;
			while((c=fin.read())!= -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
