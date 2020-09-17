package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _9237 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		Integer arr[]=new Integer[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			
			arr[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr,Collections.reverseOrder());    //Integer 배열이어야함. int배열은 불가능
		int total=arr[0]+1;
		for(int i=1; i<n; i++) {
			
			if((i+1)+arr[i]>total) {
				total=arr[i]+(i+1);
			}
			
			
		}
		System.out.println(total+1);
	}

}
