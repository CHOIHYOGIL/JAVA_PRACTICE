package Java_TextBook;
import java.util.Scanner;
public class ch2_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >>");
		int money=scanner.nextInt();
		int dollar=1100;
		
		
		System.out.println(money+"���� $"+(double)(money/dollar)+"�Դϴ�");

	}

}
