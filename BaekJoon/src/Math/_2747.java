package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2747 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long arr[];
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		arr=new long[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<n+1; i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		
		System.out.println(arr[n]);
	}

}
