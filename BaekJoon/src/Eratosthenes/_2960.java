package Eratosthenes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2960 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int arr[]=new int[n+1];
	
 		
 		for(int i=2; i<=n; i++) {
 			arr[i]=i;
 		}
 		int count=0;
 		int answ=0;
 		for(int i=2; i<=n; i++) {
 			for(int j=i; j<=n; j+=i) {
 				if(arr[j]==0) {
 					continue;
 				}
 				count++;
 				if(count==k) {
 					answ=arr[j];
 					break;
 				}
 				arr[j]=0;
 			}
 		}
 		
 		System.out.println(answ);
	}

}
