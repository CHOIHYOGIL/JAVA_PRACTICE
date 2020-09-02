package Java_TextBook;
import java.util.Scanner;


public class ch4_8 {
	static phone[] phones;
	
	static int index=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�ο��� >>");
		int n=scanner.nextInt();
	
		phones=new phone[n];
		phone Phone=new phone();

		int i=0;
		boolean bool=true;
		
			for(int j=0; j<n; j++) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
				String name=scanner.next();
				String phoneNum=scanner.next();
				phone Phone1=new phone(name,phoneNum);
				phones[index++]=Phone1;
				
			}
	
		
				System.out.println("����Ǿ����ϴ�.");
				
		
		
		
		while(bool) {
			System.out.print("�˻��� �̸� :");
			String name=scanner.next();
			if(name.equals("�׸�")) {
				bool=false;
				System.out.println("����");
				break;
			}
			int num=searchIndex(name);
			
			if(num==-1) {
				System.out.println(name+"�� �����ϴ�.");
			}else {
				System.out.println(name+"�� ��ȣ��"+phones[num].getPhoneNum());
			}
			
		
			
		}
	
	}
	
	public static int searchIndex(String name) {
		
		for(int i=0; i<index; i++) {
			if(phones[i].getName().equals(name)) {
				return i;
			}
		}
		
			return -1;
		
	}

}

class phone {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	private String phoneNum;
	
	public phone() {
		
	}
	public phone(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	
	
	
	
}

class phoneBook{
	
	public phoneBook() {
		
	}
	
	
	
}
