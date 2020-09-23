package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		
		int	M=Integer.parseInt(br.readLine());
		
		int arr[]=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int a=0;
		int count=0;
		for(int i=0; i<N; i++) {
			a=arr[i];
			for(int j=N-1; j>i; j--) {
				if(a+arr[j]==M) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
