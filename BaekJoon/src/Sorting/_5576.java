package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _5576 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int K[]=new int[10];
		int W[]=new int[10];
		
		for(int i=0; i<10; i++) {
			K[i]=scanner.nextInt();
		}
		for(int k=0; k<10; k++) {
			W[k]=scanner.nextInt();
		}
		
		Arrays.sort(K);
		Arrays.sort(W);
		int sum1=0;
		int sum2=0;
		for(int i=7; i<10; i++) {
			
			sum1+=K[i];
		}
		for(int i=7; i<10; i++) {
		
			sum2+=W[i];
		}
		
		System.out.print(sum1+" "+sum2);
	}

}
