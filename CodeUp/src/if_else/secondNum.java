package if_else;
import java.util.Scanner;


/*
  �ٽ��ѹ� �غ���!!
  �ι�°�� ���������
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
		
		if(num1<=num2 && num1<=num3) {  // num1�� ���� ������
			if(num2>=num3) {
				second=num3;
			}else {
				second=num2;
			}
		}else if(num2<=num1 && num2<=num3) {//num2�� ���� ������
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
	
		System.out.println("�ι�°�� ���� ����:"+second);
		}

	}


