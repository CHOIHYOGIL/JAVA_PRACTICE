package Java_TextBook;

import java.util.Scanner;
import java.util.HashMap;

public class ch7_3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ��� .");
		boolean bool=true;
		
		while(bool) {
			
			System.out.print("���� �̸�, �α� >>");
			String nation=scanner.next();
			if(nation.equals("�׸�")) {
				bool=false;
				break;
			}
			int people=scanner.nextInt();
			nations.put(nation, people);
		}
		
		for(int i=0; i<nations.size(); i++) {
			
			System.out.print("�α� �˻� >>");
			String find=scanner.next();
			if(find.equals("�׸�")) {
				break;
			}
			System.out.println(find+"�� �α���"+nations.get(find));
		}

	}

}
