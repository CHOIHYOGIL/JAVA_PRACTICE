package simple_loop;

import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		char a;
		
		while(true) {
			
			a=scanner.next().charAt(0);
			System.out.println(a);
			if(a=='q')
				break;
			
		}

	}

}
