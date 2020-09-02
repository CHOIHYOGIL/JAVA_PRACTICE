package Arrray;
import java.util.Scanner;

public class _1093 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int []arr=new int[n];
		int []arr1=new int[23];
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		for(int i=1; i<=arr.length; i++) {
			for(int k=1; k<=23; k++) {
				if(arr[i-1]==k) {
					arr1[k-1]=arr1[k-1]+1;
				}
			}
			
			
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
