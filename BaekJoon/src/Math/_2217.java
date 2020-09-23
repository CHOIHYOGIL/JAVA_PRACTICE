package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2217 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
	
		long max=0;
		for(int i=n-1; i>=0; i--) {
			arr[i]=arr[i]*(n-i);
			if(max<arr[i])max=arr[i];
		}
		System.out.println(max);
			
	}

}
