package Java_TextBook;

import java.util.Scanner;
import java.util.HashMap;

public class ch7_3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 입력하세요 .");
		boolean bool=true;
		
		while(bool) {
			
			System.out.print("나라 이름, 인구 >>");
			String nation=scanner.next();
			if(nation.equals("그만")) {
				bool=false;
				break;
			}
			int people=scanner.nextInt();
			nations.put(nation, people);
		}
		
		for(int i=0; i<nations.size(); i++) {
			
			System.out.print("인구 검색 >>");
			String find=scanner.next();
			if(find.equals("그만")) {
				break;
			}
			System.out.println(find+"의 인구는"+nations.get(find));
		}

	}

}
