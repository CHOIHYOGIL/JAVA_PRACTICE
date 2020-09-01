package Java_TextBook;
import java.util.Scanner;
public class ch2_2 {

	public static void main(String[] args) {
		
		System.out.print("2자리수 정수 입력(10~99)");
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int one=num%10;
		int ten=num/10;
		
		if(one==ten) {
			System.out.println("Yes! 10의 자리와 1의 자리의 숫자가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리의 숫자가 다릅니다.");
		}
	}

}
