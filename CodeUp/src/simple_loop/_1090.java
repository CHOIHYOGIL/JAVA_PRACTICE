package simple_loop;

import java.util.Scanner;

public class _1090 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int start, r, count;
		
		start=scanner.nextInt();
		r=scanner.nextInt();
		count=scanner.nextInt();
		 long num;
		num=start;
		for(int i=1; i<count; i++) {
		
			 num=num*r;
		}
		System.out.println(num);
		
	}

}
