package Java_TextBook;
import java.util.Scanner;

public class ch2_5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a,b,c;
		System.out.print("���� 3���� �Է��ϼ��� : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		if((a>=b)&&(a>=c)) {
			if(b+c>a) {
				System.out.println("�ﰢ������");
			}else {
				System.out.println("�ﰢ���Ұ���");
			}
		}else if((b>=a)&&(b>=c)) {
			if(a+c>b) {
				System.out.println("�ﰢ������");
			}else {
				System.out.println("�ﰢ���Ұ���");
			}
		}else if((c>=a)&&(c>=b)) {
			if(a+b>c) {
				System.out.println("�ﰢ������");
			}else {
				System.out.println("�ﰢ���Ұ���");
			}
		}
	}

}
