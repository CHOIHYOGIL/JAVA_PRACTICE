package Java_TextBook;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class ch7_7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�̷� ���б� �����ý����Դϴ�.");
		
		HashMap<String, Double> stu=new HashMap<String, Double>();
		
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ����>> ");
			String name=scanner.next();
			double grade=scanner.nextDouble();
			
			stu.put(name,grade);
			
		}
		
		System.out.print("���б� ���� ���� ���� �Է� >>");
		double c=scanner.nextDouble();
		
		Set<String> keys=stu.keySet();
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			double grade1=stu.get(name);
			
			if(grade1> c) {
				System.out.print(name+" ");
			}
		}

	}

}
