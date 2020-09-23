package BinarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _12783 {
	  static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n+1];
		StringTokenizer st;
	
		List <Integer> list=new ArrayList<Integer>();
		st=new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		arr[0]=Integer.MIN_VALUE;
		list.add(arr[0]);
		
		for(int i=1; i<=n; i++) {
			int num=arr[i];
			int leftIndex=0;
			int rightIndex=list.size()-1;
			
			if(num>list.get(list.size()-1)) {
				list.add(num);
			}else {
				
				while(leftIndex<rightIndex) {
					int middleIndex=(leftIndex+rightIndex)/2;
					
					if(list.get(middleIndex)>=num) {
						rightIndex=middleIndex;
					}else {
						leftIndex=middleIndex+1;
					}
				}
			}
			list.set(rightIndex, num);
			
		}
		sb.append(list.size()-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
