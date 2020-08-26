package if_else;

import java.util.Scanner;
public class num_align {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[]=new int[3];
		
		arr[0]=scanner.nextInt();
		arr[1]=scanner.nextInt();
		arr[2]=scanner.nextInt();
		
		if(arr[0]>=arr[1] &&arr[0]>=arr[2]) {
			if(arr[1]>=arr[2]) {
				System.out.println(arr[2]+" "+arr[1]+" "+arr[0]);
			}else {
				System.out.println(arr[1]+" "+arr[2]+" "+arr[0]);
			}
		}else if(arr[1]>=arr[2] && arr[1]>=arr[0]) {
			if(arr[2]>=arr[0]) {
				System.out.println(arr[0]+" "+arr[2]+" "+arr[1]);
			}else {
				System.out.println(arr[2]+" "+arr[0]+" "+arr[1]);
			
			}
		}else if(arr[2]>=arr[0] && arr[2]>=arr[1]) {
			if(arr[1]>arr[0]) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			}else {
				System.out.println(arr[1]+" "+arr[0]+" "+arr[2]);
			}
		}

	}

}
