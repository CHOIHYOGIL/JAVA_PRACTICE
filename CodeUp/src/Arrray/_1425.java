package Arrray;

import java.util.Scanner;

public class _1425 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int arr[];
		
		int input=scanner.nextInt();
		arr=new int[input];
		int temp=0;
		int seat=scanner.nextInt();
		
		for(int i=0; i<input; i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input-1; j++) {
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0; i<input; i++) {
			if(i==seat) {
				System.out.print(" ");
				System.out.println();
			}
			
			System.out.print(arr[i]+" ");
		}

	}

}
