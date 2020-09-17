package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _16212 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
