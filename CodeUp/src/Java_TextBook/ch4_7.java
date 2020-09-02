package Java_TextBook;

import java.util.Scanner;

public class ch4_7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		MonthSchedule month=new MonthSchedule(30);
		month.run();
		

	}

}

class MonthSchedule{
	Scanner scanner;
	Day days[];
	Day day=new Day();
	int index;
	boolean bool=true;
	public MonthSchedule(int x) {
	 scanner=new Scanner(System.in);
	 
	 index=x;
	 days=new Day[index];
	 for(int i=0; i<index; i++) {
		 days[i]=new Day();
	 }
	 
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int date=scanner.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		String job=scanner.next();
		System.out.println();
		days[date-1].set(job);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int date1=scanner.nextInt();
		String work=days[date1-1].get();
		System.out.println(date1+"일의 할 일은 "+work+"입니다.\n\n");
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		bool=false;
		
	}
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램");
		while(bool) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int num=scanner.nextInt();
			
			switch(num) {
			
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
	
				break;
			}
			
		}
		
	}
	
}


class Day{
	
	private String work;
	public void set(String work) {
		this.work=work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work==null) System.out.println("없습니다");
		else
			System.out.println(work="입니다.");
	}
}
