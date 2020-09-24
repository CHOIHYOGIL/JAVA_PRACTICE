package Euclid;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n1=Integer.parseInt(st.nextToken());
		int n2=Integer.parseInt(st.nextToken());
		
		int max=gcd(n1,n2);
		int min=(n1*n2)/max;
		System.out.println(max);
		System.out.println(min);
		
		
	}
	
	static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}

}
