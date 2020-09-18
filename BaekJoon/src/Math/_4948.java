package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _4948 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scanner=new Scanner(System.in);
		StringTokenizer st;
		
		int index=0;
		int arr[]=new int[100];
		boolean bool=true;
		while(bool) {
			st=new StringTokenizer(br.readLine());
			int n=scanner.nextInt();
			if(n==0) {
				bool=false;
				break;
			}
		
			
			for(int i=n; i<=2*n; i++) {
				int count=0;
				for(int j=2; j<=2*n-1; j++) {
					if(i/j!=0) {
						count++;
					}
					
				}
				arr[index]=count;
				index=index+1;
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
