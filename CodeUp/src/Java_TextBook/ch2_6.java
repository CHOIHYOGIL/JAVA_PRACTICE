package Java_TextBook;

import java.util.Scanner;
public class ch2_6 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��ϼ��� : ");
		int num=scanner.nextInt();
		
		
		int count=0;
		int ten=num/10;
		int one=num%10;
		
		if(ten==3 || ten==6 || ten==9) {
			count++;
			if(one==3 || one ==6 || one ==9) {
				count++;
			}
		}else {
			if(one==3 || one ==6 || one ==9) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("�ڼ�¦¦");
		}else if(count==1) {
			System.out.println("�ڼ�¦");
		}else {
			System.out.println("�ش����");
		}
	}

}
