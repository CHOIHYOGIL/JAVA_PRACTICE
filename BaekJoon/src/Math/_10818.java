package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _10818 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		StringTokenizer st;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
	
		int []arr=new int[n];
		
	
		st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
		
			arr[i]=Integer.parseInt(st.nextToken());
		}
		

		
		Arrays.sort(arr);
		
		
		bw.write(arr[0]+" "+arr[n-1]);
		bw.flush();
		bw.close();
		br.close();
		

	}

}
