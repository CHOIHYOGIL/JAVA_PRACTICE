package BinarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {

		private static int n;
		private static int arr[];
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		n=Integer.parseInt(br.readLine());
		arr=new int[n];
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
	
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
	
		int k=Integer.parseInt(br.readLine());
	
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			int numCheck=Integer.parseInt(st.nextToken());

			if(binaryCheck(numCheck)) bw.write("1 ");
			else bw.write("0 ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static boolean binaryCheck(int num) {
		
		int pl=0;
		int pr=n-1;

		while(pl<=pr) {
			int m=(pl+pr)/2;
			
			if(arr[m]>num) {
				pr=m-1;
				
			}else if(arr[m]<num){
				pl=m+1;
			}else {
				return true;
			}
		}
		return false;
		
	}

}
