package simple_loop;
import java.util.Scanner;


public class _1281 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b;
		a=scanner.nextInt();
		b=scanner.nextInt();
		int sum=0;
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				sum=sum-i;
				if(i==b) {
					System.out.print("-"+i);
				}else {
					System.out.print("-"+i+"+");
				}
			
			}else {
				sum=sum+i;
				System.out.print(i);
			}
		
		
			
		}
		System.out.print("="+sum);

	}

}
