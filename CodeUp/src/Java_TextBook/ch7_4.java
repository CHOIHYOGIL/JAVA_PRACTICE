package Java_TextBook;

import java.util.Vector;
import java.util.Scanner;

public class ch7_4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Vector<Integer> v=new Vector<Integer>();
		
		boolean bool=true;
	
		while(bool) {
			int sum=0;
			System.out.print("������ �Է� (0 �Է½� ����) >>");
			int water=scanner.nextInt();
			if(water==0) {
				System.out.println("����");
				bool=false;
				break;
			}
			v.add(water);
			
			for(int i=0; i<v.size(); i++) {
				sum+=v.get(i);
				System.out.print(v.get(i)+" ");
			
			}
			System.out.println("\n������� "+sum/v.size());
		}

	}

}
