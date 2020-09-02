package Java_TextBook;
import java.util.Scanner;


public class ch4_8 {
	static phone[] phones;
	
	static int index=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("인원수 >>");
		int n=scanner.nextInt();
	
		phones=new phone[n];
		phone Phone=new phone();

		int i=0;
		boolean bool=true;
		
			for(int j=0; j<n; j++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
				String name=scanner.next();
				String phoneNum=scanner.next();
				phone Phone1=new phone(name,phoneNum);
				phones[index++]=Phone1;
				
			}
	
		
				System.out.println("저장되었습니다.");
				
		
		
		
		while(bool) {
			System.out.print("검색할 이름 :");
			String name=scanner.next();
			if(name.equals("그만")) {
				bool=false;
				System.out.println("종료");
				break;
			}
			int num=searchIndex(name);
			
			if(num==-1) {
				System.out.println(name+"이 없습니다.");
			}else {
				System.out.println(name+"의 번호는"+phones[num].getPhoneNum());
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
