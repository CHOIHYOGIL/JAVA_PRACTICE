package Java_TextBook;

import java.util.Scanner;
import java.util.ArrayList;
public class ch7_2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<Double> a=new ArrayList<Double>();
		
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		double sum=0;
		for(int j=0; j<6; j++) {
			char grade=scanner.next().charAt(0);
			double score=0;
		
			if(grade=='A') {
				score=4.0;
			}else if(grade=='B') {
				score=3.0;
			}else if(grade=='C') {
				score=2.0;
			}else if(grade=='D') {
				score=1.0;
			}else if(grade=='F') {
				score=0.0;
			}
			
			a.add(score);
		}

		
		for(int i=0; i<a.size(); i++) {
			sum+=a.get(i);
		}
		System.out.println(sum/a.size());
		
		
		
	}

}
