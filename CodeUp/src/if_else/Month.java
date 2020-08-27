package if_else;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int year, month;
		
		year=scanner.nextInt();
		month=scanner.nextInt();
		int day;
		if((year%400==0) ||((year%4==0)&&((year%100)!=0)) ) {
			
			
			if(month==2) {
				day=29;
			}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				day=31;
			}else {
				day=30;
			}
		}else {
			if(month==2) {
				day=28;
			}else if(month==1 || month==3 || month==5 ||month==7 || month==8 || month==10 || month==12) {
				day=31;
			}else {
				day=30;
			}
		}
		
		System.out.print(day);
	}

}
