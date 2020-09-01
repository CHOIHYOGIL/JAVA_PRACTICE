package Java_TextBook;
import java.util.Scanner;
public class ch2_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		int money=scanner.nextInt();
		int dollar=1100;
		
		
		System.out.println(money+"원은 $"+(double)(money/dollar)+"입니다");

	}

}
