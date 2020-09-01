package Java_TextBook;
import java.util.Scanner;

public class ch2_5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b,c;
		System.out.print("정수 3개를 입력하세요 : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		if((a>=b)&&(a>=c)) {
			if(b+c>a) {
				System.out.println("삼각형가능");
			}else {
				System.out.println("삼각형불가능");
			}
		}else if((b>=a)&&(b>=c)) {
			if(a+c>b) {
				System.out.println("삼각형가능");
			}else {
				System.out.println("삼각형불가능");
			}
		}else if((c>=a)&&(c>=b)) {
			if(a+b>c) {
				System.out.println("삼각형가능");
			}else {
				System.out.println("삼각형불가능");
			}
		}
	}

}
