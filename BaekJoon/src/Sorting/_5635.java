package Sorting;

import java.util.Scanner;

public class _5635 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int max=0;
		int min=1999*1000;
		String name="";
		int day=0;
		int month=0;
		int year=0;
		for(int i=0; i<n; i++) {
			
			name=scanner.next();
			day=scanner.nextInt();
			month=scanner.nextInt();
			year=scanner.nextInt();
			
			
			String Youngest="";
					String Oldest="";

					int sum=year*1000+month*100+day*10;
					if(sum>max) {
						max=sum;
						Youngest=name;
					}
					
					if(min>sum) {
						min=sum;
						Oldest=name;
					}
			
			
		}
	}

}
