package Java_TextBook;
import java.util.Scanner;

public class ch3_14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String coures[]= {"Java", "C++", "HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score []= {95,88,76,62,55};
		boolean s=true;
		int count=0;
		while(s) {
			System.out.print("�����̸�>>");
			String subject=scanner.next();
			
			for(int i=0; i<coures.length; i++) {
				if(coures[i].equals(subject)) {
					int subScore=score[i];
					
					System.out.println(coures[i]+"�� ������"+score[i]+"���Դϴ�.");
					break;
				}else if(subject.equals("�׸�")){
					s=false;
					break;
				}else {
					if(i==coures.length-1) {
						System.out.println("���°����Դϴ�.");
						break;
					}
				
					
				}
				
				
			}
			
	
		}

	}

}
