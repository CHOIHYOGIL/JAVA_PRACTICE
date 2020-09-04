package Java_TextBook;

import java.util.Scanner;
import java.util.Vector;

public class ch7_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		Vector<Integer> v= new Vector<Integer>();
		
		System.out.print("정수 (-1이 입력될때까지) >>");
		boolean bool=true;
		while(bool) {
			
		
	
				int k=scanner.nextInt();
				if(k==-1) {
					bool=false;
					System.out.println("끝");
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
		System.out.println("가장큰수는 "+max+"입니다.");
	}

}
