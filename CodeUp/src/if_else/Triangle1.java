package if_else;
import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		int a1= (int)Math.pow(a, 2);
		int b1= (int)Math.pow(b, 2);
		int c1= (int)Math.pow(c, 2);
		
;
		if((a==b && b==c && a==c)&&(a+b>c)) {
			System.out.print("Á¤»ï°¢Çü");
		}
		
		else if((((a==b) &&(b!=c)) ||((b==c)&&(a!=c)) ||((c==a)&&(a!=b)))&&(a+b>c)) {
			System.out.print("ÀÌµîº¯»ï°¢Çü");
		}else if(((a1+b1)==c1)&&(a+b>c)) {
			System.out.print("Á÷°¢»ï°¢Çü");
		}else if(a+b>c) {
			System.out.print("»ï°¢Çü");
		}else {
			System.out.print("»ï°¢Çü¾Æ´Ô");
		}
		
		
		

	}

}
