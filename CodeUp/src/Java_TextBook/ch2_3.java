package Java_TextBook;
import java.util.Scanner;

public class ch2_3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money=scanner.nextInt();
		
		int fiveM=money/50000;
		int M=(money%50000)/10000;
		int ten=(money%10000)/1000;
		int thousand=(money%1000)/100;
		int fifty=(money%100)/50;
		int t=(money%50)/10;
		int one=(money%10);
		
		System.out.println("\n �������� :"+fiveM+"�� \n������ : "+M+"��\nõ���� : "+ten+"��\n��� : "+thousand+"��\n���ʿ� : "+fifty+"��\n�ʿ� : "+t+"��\n�Ͽ� : "+one+"��\n");
	}

}
