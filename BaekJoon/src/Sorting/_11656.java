package Sorting;

import java.util.Scanner;

public class _11656 {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			
			String name=scanner.next();
			
			String arr[]=new String[name.length()];
			
			for(int i=0; i<arr.length; i++) {
				
				arr[i]=name.substring(i);
				
			}
			//Arrays.sort(arr);
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length-1-i; j++) {
			
					if(arr[j+1].compareTo(arr[j])<0) {
						String temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
						
					}
				}
			
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
	}

}
