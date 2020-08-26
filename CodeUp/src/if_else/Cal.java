package if_else;

import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		char a;
		
		int n1,n2;
		String s=scanner.nextLine();
		
		n1=s.charAt(0);
		a=s.charAt(1);
		n2=s.charAt(2);
		
		System.out.println(n1+" "+a+" "+n2);
		
	}

}
