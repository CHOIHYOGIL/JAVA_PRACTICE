package Java_TextBook;
import java.util.Scanner;
import java.util.Vector;
public class ch7_11 {
	static Vector <Nation> vec=new Vector<Nation>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" *** ���� ���߱� ������ �����մϴ� *** ");
//		vec.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
//		vec.add(new Nation("������", "������"));
//		vec.add(new Nation("������", "�ĸ�"));
//		vec.add(new Nation("����", "����"));
//		vec.add(new Nation("�׸���", "���׳�"));
//		vec.add(new Nation("����", "������"));
//		vec.add(new Nation("�Ϻ�", "����"));
//		vec.add(new Nation("�߱�", "������"));
//		vec.add(new Nation("���þ�", "��ũ��"));
//	
		run();
	}
	
	
	public static void run() {
		

		Scanner scanner=new Scanner(System.in);
	
		System.out.print("�Է�:1, ����:2, ����:3 >>");
		int choice=scanner.nextInt();
		boolean bool=true;
		
		switch(choice) {
		
		case 1:
			int n=vec.size();
			System.out.println("���� "+n+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
			while(bool) {
				System.out.print("����� ���� �Է�"+vec.size()+">>");
				String country=scanner.next();
				if(country.equals("�׸�")) {
					bool=false;
					run();
				}
				String capital=scanner.next();
				Nation na;
			
				if(vec.contains(country)) {
					System.out.println(country+"�� �̹� �ֽ��ϴ�.");
					
				}else {
					System.out.println("Hi");
					vec.add(new Nation(country,capital));
					n++;
				}
			
				
			}
			break;
		
		case 2:
			
			for(int i=0; i<vec.size(); i++) {
				System.out.print(vec.get(i).getCountry()+"�� ������ ?");
				String answer=scanner.next();
				if(answer.equals("�׸�")) {
					run();
					break;
				}
				if(answer.equals(vec.get(i).getCapital())) {
					System.out.println("����!!");
				}else {
					System.out.println("�ƴմϴ�");
				}
			}
		
			
			break;
			
		case 3:
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�߸��Է�����");
			break;
		}
		
		
		
	}
	

}
  class Nation{
	  
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	private String country;
	private String capital;
	
	  public Nation(String country, String capital) {
		  this.country=country;
		  this.capital=capital;
	  }
	  

	
}

