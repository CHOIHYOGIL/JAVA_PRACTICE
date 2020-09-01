package Java_TextBook;
import java.util.Scanner;
public class ch3_4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하세요 ");
		char a=scanner.next().charAt(0);
		
		for(int i=0; i<=a-97; i++) {
		
			for(int j='a'; j<=a-i; j++) {
				char p=(char)j;
				System.out.print(p);
				
			}
			System.out.println();
		}
		
	}

}
