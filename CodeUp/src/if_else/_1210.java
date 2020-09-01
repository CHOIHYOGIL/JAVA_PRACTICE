package if_else;

import java.util.Scanner;
public class _1210 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int cheeseBurger=400;
		int vegetable=340;
		int milk=170;
		int egg=100;
		int salad=70;
		int total=0;
		int num=scanner.nextInt();
		int num1=scanner.nextInt();
		switch(num) {
		
		
		case 1:
			total+=400;
			break;
		case 2:
			total+=340;
			break;
		case 3:
			total+=170;
			break;
		case 4:
			total+=100;
			break;
		case 5:
			total+=70;
			break;
		default:
			break;
		}
	switch(num1) {
		
		
		case 1:
			total+=400;
			break;
		case 2:
			total+=340;
			break;
		case 3:
			total+=170;
			break;
		case 4:
			total+=100;
			break;
		case 5:
			total+=70;
			break;
		default:
			break;
		}
		if(total>500) {
			System.out.println("angry");
		}else {
			System.out.println("no angry");
		}

	}

}
