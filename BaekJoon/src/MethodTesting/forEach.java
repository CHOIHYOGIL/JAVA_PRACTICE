package MethodTesting;

import java.util.Scanner;

public class forEach {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[]=new int[5];
		arr[0]=17;
		arr[1]=3;
		arr[2]=42;
		arr[3]=4;
		arr[4]=8;
		
		for(int index : arr) {
			System.out.println("index :"+index);
		}
	}

}
