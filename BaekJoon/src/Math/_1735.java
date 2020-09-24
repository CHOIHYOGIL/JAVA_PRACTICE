package Math;
import java.util.Scanner;

public class _1735 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		if(a2%a1==0) {
			a2/=a1;
			a1=1;
		}
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		if(b2%b1==0) {
			b2/=b1;
			b1=1;
		}
		int resultUp=a1*b2+a2*b1;
		System.out.println(resultUp+" "+a2*b2);
	}

}
