package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
	
	
	}
	
	static int fibonacci(int N) {
		if(N==0)return 0;
		if(N==1)return 1;
		
		return fibonacci(N-1)+fibonacci(N-2);
	}

}
