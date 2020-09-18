package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10867 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		StringTokenizer st;
		
		String input="";
		input=br.readLine();
		st=new StringTokenizer(input);
		for(int i=0; i<n; i++) {
	
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int temp=0;
		Arrays.sort(arr);
		int index=1 ;
		
		for(int i=1; i<n; i++) {
			
			if(arr[i-1]==arr[i])continue;
			arr[index++]=arr[i];
			
		}
		
		for(int i=0; i<index; i++) {
			bw.write(arr[i]+" ");
		
		}
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음
	}

}
