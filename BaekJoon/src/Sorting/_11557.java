package Sorting;

import java.util.Scanner;

public class _11557 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int T=scanner.nextInt();
		

		
		int max=0;
		String name="";
		String answ="";
		for(int i=0; i<T; i++) {
			int school=scanner.nextInt();
			for(int j=0; j<school; j++) {
			
				name=scanner.next();
				int soju=scanner.nextInt();
				if(soju>max) {
					max=soju;
					answ=name;
				}
				
			}
			System.out.println(answ);
		}
		
		


	}

}

