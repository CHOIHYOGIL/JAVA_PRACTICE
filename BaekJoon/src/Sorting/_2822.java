package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _2822 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[8];
		int index[]=new int[3]; //가장 작은 점수를 가진 인덱스 담을 배열
		int sum=0;
		for(int i=0; i<8; i++) {
			arr[i]=scanner.nextInt();
			
		}
		
		int arr1[]=Arrays.copyOf(arr, 8);   //array 배열 복제
		
		Arrays.sort(arr1);   //arr배열 오름차순 정렬
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<8; j++) {
				if(arr1[i]==arr[j]) {
					index[i]=j;
				}
			}
		}
		int temp=0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<7-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	
		for(int i=3; i<8; i++) {
			sum+=arr1[i];
		}
		System.out.println(sum);
		
		for(int i=0; i<8; i++) {
			if(i==index[0] || i==index[1] || i==index[2]) {
				continue;
			}
			System.out.print(i+1 +" ");
		}
	}

}
