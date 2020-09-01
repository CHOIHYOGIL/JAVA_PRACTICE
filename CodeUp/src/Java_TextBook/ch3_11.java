package Java_TextBook;

import java.util.Scanner;

public class ch3_11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int [][]arr;
		arr=new int[4][4];

		
	   for(int i=0; i<10; i++) {
		   int n=(int)(Math.random()*4);
		   int m=(int)(Math.random()*4);
		   
		   if(arr[n][m]==0) {
			   arr[n][m]=(int)(Math.random()*10+1);
			   
		   }else {
			   i--;
			   continue;
		   }
	   }
	   
	   for(int i=0; i<4; i++) {
		   for(int j=0; j<4; j++) {
			   System.out.print(arr[i][j]+"\t");
		   }
		   System.out.println();
	   }
	}
	}

