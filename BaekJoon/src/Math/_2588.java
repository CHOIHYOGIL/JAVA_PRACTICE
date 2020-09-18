package Math;

import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();

		
		int k1= n1 *(n2%10);
		int k2= n1*( ((n2%100) - (n2%10))/10);
		int k3= n1*(n2/100);
		
		System.out.println(k1+"\n"+k2+"\n"+k3+"\n"+(k1+k2*10+k3*100));
		
	}

}
