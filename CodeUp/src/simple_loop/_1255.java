package simple_loop;
import java.util.Scanner;

public class _1255 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		double a,b;
		
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		
		for(double i=a; i<=b; i=i+0.01) {
			System.out.printf("%.2f ",i);
		}

	}

}
