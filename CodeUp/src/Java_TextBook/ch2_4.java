package Java_TextBook;
import java.util.Scanner;
public class ch2_4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b,c;
		System.out.print("정수 3개 입력");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		int medium=0;
		if((a>=b)&&(a>=c)) {
			if(b>=c) {
				medium=b;
			}else {
				medium=c;
			}
		}else if((b>=a)&&(b>=c)) {
			if(a>=c) {
				medium=a;
			}else {
				medium=c;
			}
		}else if((c>=a)&&(c>=b)) {
			if(a>=b) {
				medium=a;
			}else {
				medium=b;
			}
		}
		System.out.println("중간값은 "+medium);
	}

}
