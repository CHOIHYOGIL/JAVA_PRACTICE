package Java_TextBook;

import java.util.Scanner;
import java.util.Vector;

public class ch7_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		Vector<Integer> v= new Vector<Integer>();
		
		System.out.print("���� (-1�� �Էµɶ�����) >>");
		boolean bool=true;
		while(bool) {
			
		
	
				int k=scanner.nextInt();
				if(k==-1) {
					bool=false;
					System.out.println("��");
					break;
				}
					
				v.add(k);
			
		

		}
		int max=0;
		for(int i=0; i<v.size() ; i++) {
			
			if(v.get(i)>max) {
				max=v.get(i);
			}
		}
		System.out.println("����ū���� "+max+"�Դϴ�.");
	}

}
