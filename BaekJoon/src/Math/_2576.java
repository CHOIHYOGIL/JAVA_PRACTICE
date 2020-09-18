package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int arr[]=new int[7];
		for(int i=0; i<7; i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int index=0;
		int sum=0;
		for(int i=0; i<7; i++) {
			if(arr[i]%2==0) {
				continue;
			}else {
				arr[index++]=arr[i];
			}
		}
		
		for(int i=0; i<index; i++) {
			sum+=arr[i];
			
		}
		Arrays.sort(arr,0,index);
	
		
		if(index==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(arr[0]);
		}
	
	
		

	}

}
