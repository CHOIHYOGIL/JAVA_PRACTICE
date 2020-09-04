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
			System.out.print("강수량 입력 (0 입력시 종료) >>");
			int water=scanner.nextInt();
			if(water==0) {
				System.out.println("종료");
				bool=false;
				break;
			}
			v.add(water);
			
			for(int i=0; i<v.size(); i++) {
				sum+=v.get(i);
				System.out.print(v.get(i)+" ");
			
			}
			System.out.println("\n현재평균 "+sum/v.size());
		}

	}

}
