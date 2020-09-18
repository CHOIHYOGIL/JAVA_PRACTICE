package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _5800 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(br.readLine());
	
		StringTokenizer st;
		int score[]= {};
	
		int index=1;
		while(n>0) {
			
			int max=0;
			st=new StringTokenizer(br.readLine());
			int people=Integer.parseInt(st.nextToken());
			 score=new int[people];
			for(int i=0; i<people; i++) {
			
				score[i]=Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(score);
			
			for(int i=1; i<people; i++) {
				if(score[i]-score[i-1]>max) {
					max=score[i]-score[i-1];
				}
			}
			bw.write("Class "+index+"\n"+"Max "+score[score.length-1]+", Min "+score[0]+", Largest gap "+max+"\n");
			index++;
		n--;
		}

	
			
		
		bw.flush();
		bw.close();
	}
}
