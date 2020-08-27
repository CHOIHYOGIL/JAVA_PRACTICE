package simple_loop;
import java.util.Scanner;

public class _1253 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b;
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		int big,small;
		
		if(a>b) {
			big=a;
			small=b;
		}else {
			big=b;
			small=a;
		}
		
		for(int i=small; i<=big; i++) {
			System.out.print(i+" ");
		}

	}

}
