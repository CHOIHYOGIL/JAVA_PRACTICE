package simple_loop;
import java.util.Scanner;
import java.lang.Math;

public class _1282 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n,k;
		n=scanner.nextInt();
		
		int b=(int)Math.sqrt(n);
		int c=n-b*b;
		
		System.out.println(c+" "+b);

	}

}
