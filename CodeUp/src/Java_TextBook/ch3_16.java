package Java_TextBook;
import java.util.Scanner;

public class ch3_16 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			
		String str[]= {"����", "����", "��"};
		boolean bool=true;
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �����մϴ�.");
		
		while(bool) {
			
			System.out.print("���� ���� ��! >>");
			String str1=scanner.next();
			if(str1.equals("�׸�")) {
				System.out.println("������ �����մϴ�..\n");
				bool=false;
				break;
			}
			int n=(int)(Math.random()*3);
			System.out.print("����� = "+str1+" , ��ǻ��  = " + str[n]+", ");
		
			if(str[n]=="����") {
		
				if(str1.equals("��")) {
					System.out.print(" ��ǻ�Ͱ� �̰���ϴ�.\n");
				}else if(str1.equals("����")) {
					System.out.print("�����ϴ�.\n");
				}else if(str1.equals("�ָ�")){
					System.out.println(" ����ڰ� �̰���ϴ�.\n");
				}
			}else if(str[n]=="����") {
		
				if(str1.equals("����")) {
			
					System.out.print(" �����ϴ�.\n");
				}else if(str1.equals("��")) {
			
					System.out.print(" ����ڰ� �̰���ϴ�.\n");
				}else if(str1.equals("����")) {
					
					System.out.print(" ��ǻ�Ͱ� �̰���ϴ�.\n");
				}
			}else if(str[n]=="��") {
			
				if(str1.equals("��")) {
					System.out.print(" �����ϴ�.\n");
				}else if(str1.equals("����")) {
					System.out.print(" ����ڰ� �̰���ϴ�.\n");
				}else if(str1.equals("����")) {
					System.out.print(" ��ǻ�Ͱ� �̰���ϴ�.\n");
				}
			}
			
			
			
		}
		
	}

}
