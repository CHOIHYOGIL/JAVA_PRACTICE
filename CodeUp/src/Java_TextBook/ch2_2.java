package Java_TextBook;
import java.util.Scanner;
public class ch2_2 {

	public static void main(String[] args) {
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)");
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int one=num%10;
		int ten=num/10;
		
		if(one==ten) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� ���ڰ� �����ϴ�.");
		}else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���ڰ� �ٸ��ϴ�.");
		}
	}

}
