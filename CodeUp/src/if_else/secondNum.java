package if_else;
import java.util.Scanner;


/*
  다시한번 해보자!!
  두번째로 작은수출력
 * */


public class secondNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num1,num2,num3;
		int arr[]=new int[3];
		int second=0;
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		if(num1<=num2 && num1<=num3) {  // num1이 가장 작은값
			if(num2>=num3) {
				second=num3;
			}else {
				second=num2;
			}
		}else if(num2<=num1 && num2<=num3) {//num2가 가장 작은값
			if(num1>=num3) {
				second=num3;
			}else {
				second=num1;
			}
		} else if(num3<=num1 && num3<=num2) {
			if(num1>=num2) {
				second=num2;
			}else {
				second=num1;
			}
		}
	
		System.out.println("두번째로 작은 숫자:"+second);
		}

	}


