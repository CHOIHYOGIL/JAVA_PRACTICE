package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _2693 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int arr[]=new int[10];
		
		for(int j=0; j<n; j++) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(arr[7]);
		}
		
	}

}
