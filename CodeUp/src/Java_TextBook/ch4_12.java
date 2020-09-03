package Java_TextBook;

import java.util.Scanner;
public class ch4_12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		Reservation r=new Reservation();
		r.Run();

} 		
}


class Seat{
	
	private String seat [];
	
	public Seat() {
		seat=new String[10];
		for(int i=0; i<10; i++) {
			seat[i]="---";
		}
	}
	
	public void show() {
		
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void Set(String name, int num) {
		seat[num-1]=name;
	}
	
	public boolean reset(String name) {
		
		for(int i=0; i<seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i]="---";
				return true;
			}
		}
		return false;
	}
	
}


class Reservation{
	
	Scanner scanner=new Scanner(System.in);
	private Seat s[];
	private String seatGrade[]= {"S","A","B"};
	
	public Reservation() {
		s=new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i]=new Seat();
		}
	}
	
	public void Reserve() {
		
		System.out.print("�¼����� S(1), A(2), B(3) >>");
		int seatNum=scanner.nextInt();
		
		System.out.print(seatGrade[seatNum-1]+">>");
		s[seatNum-1].show();
		
		System.out.print("�̸� >>");
		String name=scanner.next();
		System.out.print("��ȣ>>");
		int number=scanner.nextInt();
		s[seatNum-1].Set(name, number);
		
		
	}
	
	public void Check() {
		
		for(int i=0; i<s.length; i++) {
			
			System.out.print(seatGrade[i]+">>");
			s[i].show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��߽��ϴ�.>>>");
	}
	
	
	public void Cancel() {
		
		System.out.print("�¼����� S(1), A(2), B(3) >>");
		int seatNum=scanner.nextInt();
		
		System.out.print(seatGrade[seatNum-1]+">>");
		
         s[seatNum-1].show();
		
		System.out.print("�̸�>>");
		String name = scanner.next();
		
		boolean result = s[seatNum-1].reset(name);
		if(result==true)
			System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�.>>>");
		else
			System.out.println("�������� �ʴ� �����Դϴ�.");



	}
	
	public void Run() {
		int option;
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			option = scanner.nextInt();
			
			switch(option) {
			case 1:
				Reserve();
				break;
			case 2:
				Check();
				break;
			case 3:
				Cancel();
				break;
			case 4:
				return;
			}
		}
	}
}



	





