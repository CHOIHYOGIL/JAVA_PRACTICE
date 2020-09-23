package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashMap<String ,Integer> map=new HashMap<String,Integer>();
		
		
		String input="";
		
		for(int i=0; i<n; i++) {
			
			input=br.readLine();
			if(map.containsKey(input)) {
				map.replace(input, map.get(input)+1);
			}else {
				map.put(input,1);
			}
		}
		
		int max=0;
		
		for(String a: map.keySet()) {
			max=Math.max(max, map.get(a));
		}
		
		ArrayList <String> al=new ArrayList<String>(map.keySet());
		Collections.sort(al);
		
		for(String a: al) {
			if(map.get(a)==max) {
				System.out.println(a);
				break;
			}
		}
	}

}
