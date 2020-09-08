package Java_TextBook;
import java.util.Scanner;
import java.util.Vector;
public class ch7_11 {
	static Vector <Nation> vec=new Vector<Nation>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" *** 수도 맞추기 게임을 시작합니다 *** ");
//		vec.add(new Nation("멕시코", "멕시코시티"));
//		vec.add(new Nation("스페인", "리스본"));
//		vec.add(new Nation("프랑스", "파리"));
//		vec.add(new Nation("영국", "런던"));
//		vec.add(new Nation("그리스", "아테네"));
//		vec.add(new Nation("독일", "베를린"));
//		vec.add(new Nation("일본", "동경"));
//		vec.add(new Nation("중국", "베이찡"));
//		vec.add(new Nation("러시아", "모스크바"));
//	
		run();
	}
	
	
	public static void run() {
		

		Scanner scanner=new Scanner(System.in);
	
		System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
		int choice=scanner.nextInt();
		boolean bool=true;
		
		switch(choice) {
		
		case 1:
			int n=vec.size();
			System.out.println("현재 "+n+"개 나라와 수도가 입력되어 있습니다.");
			while(bool) {
				System.out.print("나라와 수도 입력"+vec.size()+">>");
				String country=scanner.next();
				if(country.equals("그만")) {
					bool=false;
					run();
				}
				String capital=scanner.next();
				Nation na;
			
				if(vec.contains(country)) {
					System.out.println(country+"는 이미 있습니다.");
					
				}else {
					System.out.println("Hi");
					vec.add(new Nation(country,capital));
					n++;
				}
			
				
			}
			break;
		
		case 2:
			
			for(int i=0; i<vec.size(); i++) {
				System.out.print(vec.get(i).getCountry()+"의 수도는 ?");
				String answer=scanner.next();
				if(answer.equals("그만")) {
					run();
					break;
				}
				if(answer.equals(vec.get(i).getCapital())) {
					System.out.println("정답!!");
				}else {
					System.out.println("아닙니다");
				}
			}
		
			
			break;
			
		case 3:
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못입력했음");
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

