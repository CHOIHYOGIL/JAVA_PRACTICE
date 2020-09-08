package Input;

import java.util.Scanner;

public class _1408 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String word=scanner.next();
		int arr[]=new int[word.length()];
		for(int i=0; i<word.length(); i++) {
			arr[i]=word.charAt(i);
		}
		for(int i=0; i<word.length();i++) {
			System.out.print((char)(arr[i]+2));
		}
		System.out.println();
		for(int i=0; i<word.length();i++) {
			System.out.print((char)(arr[i]*7%80+48));
		}
	

	}

}
