package Euclid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _3036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st;
	

		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
	
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<n; i++) {
			
			int gcd=findgcd(Math.max(arr[0], arr[i]),Math.min(arr[0], arr[i]));
			System.out.print(arr[0]/gcd);
			System.out.print("/");
			System.out.print(arr[i]/gcd+"\n");
		}
	}
		static int findgcd(int a, int b) {
			
			while(b!=0) {
				int tmp=a;
				a=b;
				b=tmp%b;
			}
			return a;
		}
}
