package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5565 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int total=0;
		st=new StringTokenizer(br.readLine());
		total=Integer.parseInt(st.nextToken());
		int arr[]=new int[9];
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=Integer.parseInt(st.nextToken());
			
		}
		int sum=0;
		for(int i=0; i<9; i++) {
			sum+=arr[i];
		}
		System.out.println(total-sum);
	
	
	}

}
