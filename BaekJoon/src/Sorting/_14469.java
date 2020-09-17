package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _14469 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
	
		Cow [] cow=new Cow[n];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			
			int arrive=Integer.parseInt(st.nextToken());
			int search=Integer.parseInt(st.nextToken());
			cow[i]=new Cow(arrive,search);
			
		
		}
		Arrays.sort(cow);
		
		
		int ans = 0;
		
		for (int i=0; i<n; i++) {
			ans = Math.max(ans, cow[i].arriveTime) + cow[i].searchTime;
		}
		
		System.out.println(ans);

	}

}


class Cow implements Comparable<Cow> {
	int arriveTime;
	int searchTime;
	
	public Cow(int arriveTime, int searchTime) {
		super();
		this.arriveTime = arriveTime;
		this.searchTime = searchTime;
	}
	public int getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}
	public int getSearchTime() {
		return searchTime;
	}
	public void setSearchTime(int searchTime) {
		this.searchTime = searchTime;
	}
	@Override
	public int compareTo(Cow cow) {
		//return cow.arriveTime-this.arriveTime;  이것은 내림차순
		return this.arriveTime-cow.arriveTime;
	}


}