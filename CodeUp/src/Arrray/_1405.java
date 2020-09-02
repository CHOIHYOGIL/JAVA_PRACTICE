package Arrray;

import java.util.Scanner;

public class _1405 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int []arr=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		int k;
		for(int i=0; i<arr.length; i++) {
			k=arr[0];
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
				
				if(j==arr.length-1) {
					arr[j]=k;
				}else {
					arr[j]=arr[j+1];
				}
		
			}
			System.out.println();
		}
	}

}
