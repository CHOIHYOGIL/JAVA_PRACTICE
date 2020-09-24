<<<<<<< HEAD
package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		StringBuilder sb=new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		int arr[][]=new int[15][15];
		
		for(int i=0; i<15; i++) {
			arr[i][1]=1;
			arr[0][i]=i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				arr[i][j]=arr[i][j-1]+arr[i-1][j];
			}
		}
		for(int i=0; i<n; i++) {
			int k=Integer.parseInt(br.readLine());
			int p=Integer.parseInt(br.readLine());
	
			bw.write(String.valueOf(arr[k][p])+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
=======
package Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		StringBuilder sb=new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		
		int arr[][]=new int[15][15];
		
		for(int i=0; i<15; i++) {
			arr[i][1]=1;
			arr[0][i]=i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				arr[i][j]=arr[i][j-1]+arr[i-1][j];
			}
		}
		for(int i=0; i<n; i++) {
			int k=Integer.parseInt(br.readLine());
			int p=Integer.parseInt(br.readLine());
	
			bw.write(String.valueOf(arr[k][p])+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
>>>>>>> refs/remotes/origin/master
