package Java_TextBook;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ch7_11_2 {
	static Scanner scanner=new Scanner(System.in);
	static HashMap<String, String> Quiz=new HashMap<String, String>();
	
	public static void main(String[] args) {
	
		System.out.println(" *** 수도 맞추기 게임을 시작합니다. *** ");
		run();

	}
	
	public static void run() {
		boolean bool=true;
		
			
			System.out.println("입력 :1, 퀴즈:2, 종료:3 >>");
			int choice=scanner.nextInt();
			
			switch(choice) {
			
			case 1: 
				int n=Quiz.size();
				System.out.println("현재 "+n+"개 나라와 수도가 입력되어 있습니다");
				while(bool) {
					System.out.print("나라와 수도 입력 "+n+">>");
					String country=scanner.next();
					
					if(country.equals("그만")) {
						bool=false;
						run();
						break;
					}
					String capital=scanner.next();
					
					if(Quiz.containsKey(country)) {
						System.out.println(country+"는 이미 있습니다!!");
					}else {
						Quiz.put(country,capital);	
						n++;
					}
				
					
				}
				
				break;
			case 2:
				Set<String> keys = Quiz.keySet();
				Object [] array = (keys.toArray());
				
				while(bool) {
					int random=(int)(Math.random()*array.length);
					
					System.out.println(random);
					String question = (String)array[random];
					String answer = Quiz.get(question);
					
					System.out.print(question+"의 수도는?");
					String UserAnswer=scanner.next();
					if(UserAnswer.equals("그만")) {
						bool=false;
						run();
						break;
					}
					
					if(UserAnswer.equals(answer)) {
						System.out.println("정답!");
					}else {
						System.out.println("아닙니다!");
					}
				}
		
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못입력");
				break;
			}
		
	}
}
