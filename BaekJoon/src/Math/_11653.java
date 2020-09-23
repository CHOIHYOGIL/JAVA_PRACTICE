package Math;

import java.util.Scanner;

public class _11653 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int k=2;
		while(n>=k) {
			if(n%k==0) {
				System.out.println(k);
				n/=k;
			}else {
				k++;
			}
		}
	
		

}
}