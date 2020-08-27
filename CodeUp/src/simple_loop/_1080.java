package simple_loop;

import java.util.Scanner;

public class _1080 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int n;
		int i=0;
		n=scanner.nextInt();
		while(true) {
			i++;
			sum+=i;
			if(sum>=n) {
				System.out.println(i);
				break;
			}
		
		
			
		}
	
		

	}

}
