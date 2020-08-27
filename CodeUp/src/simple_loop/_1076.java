package simple_loop;

import java.util.Scanner;

public class _1076 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
		char n;
		
		n=scanner.next().charAt(0);
		
		for(int i=97;  i<=n; i++ ) {
			char k=(char)i;
			System.out.print(k+" ");
		}

	}

}
