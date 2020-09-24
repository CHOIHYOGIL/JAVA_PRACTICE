package Euclid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _13241 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		long k=Integer.parseInt(st.nextToken());
	
		long p=Integer.parseInt(st.nextToken());
	
		long gcd=gcd(k,p);
		
		System.out.println((k*p)/gcd);
	}
	
	static long gcd(long a, long b) {
		
		while(b!=0) {
			
			long tmp=a;
			a=b;
			b=tmp%b;
		}
		return a;
	}

}
