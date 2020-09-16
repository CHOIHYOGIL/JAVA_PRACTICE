package doubleLoop;

import java.util.Scanner;

public class _1380 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int first=0;
		int second=0;
		
		int input=0;
		input=scanner.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				sum=i+j;
				if(sum==input) {
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
