package Java_TextBook;

import java.util.Scanner;

public class ch3_7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("정수 몇개?");
		int num=scanner.nextInt();
		
		int [] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			int tmp=(int)(Math.random()*100+1);
			arr[i]=tmp;

			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					continue;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			 if(i%10==0) {
				 System.out.println();
			 }
			 System.out.print(arr[i]+" ");
		}
		
	}

}
