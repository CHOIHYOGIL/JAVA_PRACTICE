package Java_TextBook;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class ch7_8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�, **");
		HashMap<String, Integer> Manage=new HashMap<String, Integer>();
		boolean bool=true;
		while(bool) {
			
			System.out.print("�̸��� ����Ʈ �Է� >>");
			String name=scanner.next();
			int point=scanner.nextInt();
			if(name.equals("�׸�")) {
				bool=false;
				break;
			}
			int newPoint;
			if(Manage.containsKey(name)) {
				 newPoint=Manage.get(name)+point;
			}
			else {
				 newPoint=point;
			}
			Manage.put(name,newPoint);
			
			
			Set<String> keys= Manage.keySet();
			Iterator<String> it=keys.iterator();
			while(it.hasNext()) {
				String name1=it.next();
				int point1=Manage.get(name1);
				System.out.print("("+name1+","+point1+")"+" ");
			}
			System.out.println();

			
			
		}

	}

}
