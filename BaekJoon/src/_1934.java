package 유클리드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st;

		
		int n=Integer.parseInt(br.readLine());
		int max=0;
		int min=0;
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			int k=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			if(k>p) {
				max=k;
				min=p;
			}else {
				max=p;
				min=k;
			}
			int max1=gcd(max,min);
			bw.write(String.valueOf((k*p)/max1)+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int gcd(int a, int b) {
		
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}
}
