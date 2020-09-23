package Math;

import java.util.Scanner;

public class _1193 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		int past=0;
		int present=1;
		
		int n=scanner.nextInt();
		
		
		while(true) {
			
			
			if(n<=present+past) {
				
				
				if(present %2==1) {
					
					System.out.println(present-(n-past-1)+"/"+(n-past));
					break;
				}else {
					
					System.out.println((n-past)+"/"+(present-(n-past-1)));
					break;
				}
			}else {
				past+=present;
				present++;
			}
			
			
		}
		
	}

}
