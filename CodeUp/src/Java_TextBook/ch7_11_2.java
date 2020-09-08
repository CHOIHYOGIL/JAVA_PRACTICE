package Java_TextBook;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ch7_11_2 {
	static Scanner scanner=new Scanner(System.in);
	static HashMap<String, String> Quiz=new HashMap<String, String>();
	
	public static void main(String[] args) {
	
		System.out.println(" *** ���� ���߱� ������ �����մϴ�. *** ");
		run();

	}
	
	public static void run() {
		boolean bool=true;
		
			
			System.out.println("�Է� :1, ����:2, ����:3 >>");
			int choice=scanner.nextInt();
			
			switch(choice) {
			
			case 1: 
				int n=Quiz.size();
				System.out.println("���� "+n+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�");
				while(bool) {
					System.out.print("����� ���� �Է� "+n+">>");
					String country=scanner.next();
					
					if(country.equals("�׸�")) {
						bool=false;
						run();
						break;
					}
					String capital=scanner.next();
					
					if(Quiz.containsKey(country)) {
						System.out.println(country+"�� �̹� �ֽ��ϴ�!!");
					}else {
						Quiz.put(country,capital);	
						n++;
					}
				
					
				}
				
				break;
			case 2:
				Set<String> keys = Quiz.keySet();
				Object [] array = (keys.toArray());
				
				while(bool) {
					int random=(int)(Math.random()*array.length);
					
					System.out.println(random);
					String question = (String)array[random];
					String answer = Quiz.get(question);
					
					System.out.print(question+"�� ������?");
					String UserAnswer=scanner.next();
					if(UserAnswer.equals("�׸�")) {
						bool=false;
						run();
						break;
					}
					
					if(UserAnswer.equals(answer)) {
						System.out.println("����!");
					}else {
						System.out.println("�ƴմϴ�!");
					}
				}
		
				break;
			case 3:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸��Է�");
				break;
			}
		
	}
}
