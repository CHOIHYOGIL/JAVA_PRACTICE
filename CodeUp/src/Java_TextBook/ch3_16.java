package Java_TextBook;
import java.util.Scanner;

public class ch3_16 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			
		String str[]= {"가위", "바위", "보"};
		boolean bool=true;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		
		while(bool) {
			
			System.out.print("가위 바위 보! >>");
			String str1=scanner.next();
			if(str1.equals("그만")) {
				System.out.println("게임을 종료합니다..\n");
				bool=false;
				break;
			}
			int n=(int)(Math.random()*3);
			System.out.print("사용자 = "+str1+" , 컴퓨터  = " + str[n]+", ");
		
			if(str[n]=="가위") {
		
				if(str1.equals("보")) {
					System.out.print(" 컴퓨터가 이겼습니다.\n");
				}else if(str1.equals("가위")) {
					System.out.print("비겼습니다.\n");
				}else if(str1.equals("주먹")){
					System.out.println(" 사용자가 이겼습니다.\n");
				}
			}else if(str[n]=="바위") {
		
				if(str1.equals("바위")) {
			
					System.out.print(" 비겼습니다.\n");
				}else if(str1.equals("보")) {
			
					System.out.print(" 사용자가 이겼습니다.\n");
				}else if(str1.equals("가위")) {
					
					System.out.print(" 컴퓨터가 이겼습니다.\n");
				}
			}else if(str[n]=="보") {
			
				if(str1.equals("보")) {
					System.out.print(" 비겼습니다.\n");
				}else if(str1.equals("가위")) {
					System.out.print(" 사용자가 이겼습니다.\n");
				}else if(str1.equals("바위")) {
					System.out.print(" 컴퓨터가 이겼습니다.\n");
				}
			}
			
			
			
		}
		
	}

}
