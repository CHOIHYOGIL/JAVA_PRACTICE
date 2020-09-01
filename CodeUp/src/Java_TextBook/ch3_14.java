package Java_TextBook;
import java.util.Scanner;

public class ch3_14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String coures[]= {"Java", "C++", "HTML5","컴퓨터구조","안드로이드"};
		int score []= {95,88,76,62,55};
		boolean s=true;
		int count=0;
		while(s) {
			System.out.print("과목이름>>");
			String subject=scanner.next();
			
			for(int i=0; i<coures.length; i++) {
				if(coures[i].equals(subject)) {
					int subScore=score[i];
					
					System.out.println(coures[i]+"의 점수는"+score[i]+"점입니다.");
					break;
				}else if(subject.equals("그만")){
					s=false;
					break;
				}else {
					if(i==coures.length-1) {
						System.out.println("없는과목입니다.");
						break;
					}
				
					
				}
				
				
			}
			
	
		}

	}

}
