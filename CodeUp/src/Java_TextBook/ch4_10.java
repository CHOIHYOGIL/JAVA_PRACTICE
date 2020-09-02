package Java_TextBook;
import java.util.Scanner;
public class ch4_10 {

	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner=new Scanner(System.in);
		Dictionary []dic;
		Dictionary dic1=new Dictionary();
		
		while(true) {
			
			System.out.print("한글단어  ?");
			String word=scanner.next();
			if(word.equals("그만")) {
				break;
			}
			String kor=dic1.kor2eng(word);
			if(kor=="") {
				System.out.println(word+"는 저의 사전에 없습니다.");
			}else {
				System.out.println(word+"는 "+kor);
			}
			
				
		}

	}

}

class Dictionary{
	
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String []eng= {"love", "baby", "money","future","hope"};
	public static String kor2eng(String word) {
		
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return "";
		
	}
}