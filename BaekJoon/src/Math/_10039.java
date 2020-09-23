package Math;

import java.util.Scanner;

public class _10039 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]<40) {
				arr[i]=40;
			}
		}
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum/5);
		
		
	}

}
