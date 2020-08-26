package if_else;

import java.util.Scanner;
public class Soccer1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int time;
		int first;
		int second;
		
		time=scanner.nextInt();
		first=scanner.nextInt();
		second=scanner.nextInt();
		
		int rest=90-time;
		int total=0;
		
		if(rest%5==0) {
			total=rest/5+first;
		}else {
			total=rest/5+1+first;
		}
		
		if(total==second) {
			System.out.print("same");
		}else if(total>second) {
			System.out.print("win");
		}else {
			System.out.print("lose");
		}

	}

}
