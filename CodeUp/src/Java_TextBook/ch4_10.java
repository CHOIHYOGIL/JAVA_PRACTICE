package Java_TextBook;
import java.util.Scanner;
public class ch4_10 {

	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner=new Scanner(System.in);
		Dictionary []dic;
		Dictionary dic1=new Dictionary();
		
		while(true) {
			
			System.out.print("�ѱ۴ܾ�  ?");
			String word=scanner.next();
			if(word.equals("�׸�")) {
				break;
			}
			String kor=dic1.kor2eng(word);
			if(kor=="") {
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			}else {
				System.out.println(word+"�� "+kor);
			}
			
				
		}

	}

}

class Dictionary{
	
	private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
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