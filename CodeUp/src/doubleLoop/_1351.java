package doubleLoop;

import java.util.Scanner;

public class _1351 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		int num3=0;
		int num2=0;
		if(n1>n2) {
			num3=n2;
			num2=n1;
		}else {
			num3=n1;
			num2=n2;
		}
	
			for(int j=num3; j<=num2; j++) {
				for(int k=1; k<=9; k++) {
					System.out.println(j+"*"+k+"="+j*k);
				}
				
			}
		

	}

}
