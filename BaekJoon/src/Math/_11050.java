package Math;
import java.util.Scanner;

public class _11050 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		int result1=factorial(n1);
		int result2=factorial(n2);
		int result3=factorial(n1-n2);
		
		System.out.println(factorial(n1)/(factorial(n1-n2)*factorial(n2)));
		
	}
	
	static int factorial(int n) {
		
		int i=1;
		
		for(int j=1; j<=n; j++) {
			i*=j;
		}
	return i;
	}

}
