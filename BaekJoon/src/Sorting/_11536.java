package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11536 {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String arr[]=new String[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			arr[i]=name;
		}
		
		int sum=0;
		int sum1=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i].compareTo(arr[i-1])>0) {
				sum+=1;
			}else if(arr[i].compareTo(arr[i-1])<0){
				sum1+=1;
			}
		}
		
		if(sum==n-1) {
			System.out.println("INCREASING");
		}else if(sum1==n-1) {
			System.out.println("DECREASING");
		}else {
			System.out.println("NEITHER");
		}
	}

}

/* 다른사람이 푼거!!
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner         		= new Scanner(System.in);
		Integer nameCount				= scanner.nextInt();
		ArrayList<String> originNames	= new ArrayList<String>();
		
		for ( Integer i = 0; i < nameCount; ++ i ) {
			originNames.add( scanner.next() );
		}
		
		ArrayList<String> sortNames	= new ArrayList<String>();
		sortNames.addAll(originNames);
		Collections.sort(sortNames);
		String result = "INCREASING";
		
		if ( !originNames.equals(sortNames) ) {
			
			Collections.reverse(sortNames);
			result = ( originNames.equals(sortNames) ) ? "DECREASING" : "NEITHER"; 
		}
		
		System.out.println(result);
	}

}
*/