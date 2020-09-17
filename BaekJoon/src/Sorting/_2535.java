package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2535 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		
		int n=Integer.parseInt(br.readLine());
		Contest[] con=new Contest[n];
		
		StringTokenizer st;
		for(int i=0; i<con.length; i++) {
			st=new StringTokenizer(br.readLine());
				int country=Integer.parseInt(st.nextToken());
				int num=Integer.parseInt(st.nextToken());
				int score=Integer.parseInt(st.nextToken());
				
				con[i]=new Contest(country,num,score);
				
		
		}
		
		Contest winner[]=new Contest[3];
		int max=0;
		for(int i=0; i<con.length-1; i++) {
			
			for(int j=0; j<con.length-1-i; j++) {
				if(con[j].getScore()<con[j+1].getScore()) {
					
					Contest temp=con[j];
					con[j]=con[j+1];
					con[j+1]=temp;
				}
			}
			
		}
		int count=0;
		for(int i=0; i<con.length-2; i++) {
			
			if(con[i].getCountry()==con[i+1].getCountry()) {
				count++;
			}
			if(count==2) {
				Contest temp=con[i+1];
				con[i+1]=con[i+2];
				con[i+2]=temp;
				count=0;
			}
			

		

			
		
		}
		
		for(int i=0; i<winner.length; i++) {
			
			winner[i]=new Contest(con[i].getCountry(),con[i].getNum());
		
		}
		for(int i=0; i<winner.length; i++) {
			System.out.println(winner[i].getCountry()+" "+winner[i].getNum());
		}
	}

}

class Contest{
	private int country;
	private int num;
	private int score;
	
	public Contest(int country, int num) {
		this.country=country;
		this.num=num;
	}
	public Contest(int country, int num, int score) {
		super();
		this.country = country;
		this.num = num;
		this.score = score;
	}
	
	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



	
	
}

/*   
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int s [][] = new int[N][3];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			s[i][0] = Integer.parseInt(st.nextToken());
			s[i][1] = Integer.parseInt(st.nextToken());
			s[i][2] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(s, new Comparator<int[]>(){
			public int compare(int[] a, int[] b) {
				return a[2] - b[2];
			}
		});
		
		//for (int i = 0; i < N; i++) 
		//	System.out.println(s[i][2] + " " + s[i][0] + " " + s[i][1]);
		
		System.out.println(s[N-1][0] + " " + s[N-1][1]);
		System.out.println(s[N-2][0] + " " + s[N-2][1]);
	
		if(s[N-1][0] == s[N-2][0]) {
			if(s[N-3][0] == s[N-1][0])
				System.out.println(s[N-4][0] + " " + s[N-4][1]);
			else
				System.out.println(s[N-3][0] + " " + s[N-3][1]);
		} else {
			System.out.println(s[N-3][0] + " " + s[N-3][1]);
		}
			
	}

}
*/
