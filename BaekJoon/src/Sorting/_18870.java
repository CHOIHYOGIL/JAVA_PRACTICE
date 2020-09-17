package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(br.readLine());
		
		Point []point=new Point[n];
		
		StringTokenizer st;
	
		int index=0;
			
		
		st=new StringTokenizer(br.readLine());
	
			
		
		
		
		int arr[]=new int[n];
		int count=0;
		for(int i=0; i<n;i++) {
			int temp=point[i].getX();
			for(int j=0; j<n;j++ ) {
				if(temp>arr[j]) {
					count++;
				}
				arr[j]=count;
			}
			count=0;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

class Point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
