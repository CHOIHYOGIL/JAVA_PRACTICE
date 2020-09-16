package doubleLoop;

import java.util.Scanner;

public class _1382 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1; i<=9; i++) {
			
			for(int j=2; j<=5; j++) {
				//System.out.print(j+" x "+i+" = "+i*j+"\t");
				System.out.printf("%d x %d = %2d\t",j,i,i*j);
			}
			System.out.println();
		}
	}

}
