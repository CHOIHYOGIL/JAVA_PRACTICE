package Euclid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int limit=Integer.parseInt(st.nextToken());
		int arr[]=new int[limit+1];
		int count=0;
		for(int i=0; i<n; i++) {
			int time=Integer.parseInt(br.readLine());
			
			for(int k=time ; k<=limit; k+=time) {
				if(time==arr[k]) {
					continue;
				}
				arr[k]=1;
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
		
	}

}
