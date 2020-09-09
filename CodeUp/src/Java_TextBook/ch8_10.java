package Java_TextBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ch8_10 {

	public static void main(String[] args) {
		String path="C:\\Users\\user\\Desktop\\";
		File file=new File(path+"phone.txt");
		Scanner scanner;
		Phone phone1[]= new Phone[30];
		int count=0;
		int i=0;
		try {
			 scanner=new Scanner(new FileReader(file));
			while(scanner.hasNext()) {
				String name=scanner.next();
				String phone=scanner.next();
			
				 phone1[i++]=new Phone(name,phone);
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("총 "+count+"개의 전화번호를 읽었습니다.");
		boolean bool=true;
		while(bool) {
			
			System.out.print("이름 >>");
			scanner=new Scanner(System.in);
			String name1=scanner.next();
			
			boolean bool1=true;
			if(name1.equals("그만"))
			{
				System.out.println("종료합니다ㅣ.");
				bool=false;
				break;
			}
			
			for(int k=0; k<phone1.length; k++) {
				
				if(name1.equals(phone1[k].getName())) {
					System.out.println(phone1[k].getPhone());
					bool1=true;
					break;
				}else {
				
				bool1=false;
				if(k==2)
					
				break;
				}
				
			}
			if(bool1==false) {
				System.out.println("찾는 사람이 없습니다.");
			}
		
				
			
		}

	}

}
