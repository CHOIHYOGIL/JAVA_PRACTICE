package if_else;
import java.util.Scanner;
/*
 * 1212��
 * �� ���� ������ �ִ�.

������ �ǹ̴� ������ ���̸� ���Ѵ�.

�� �������� �ﰢ���� ���� �� �ִ��� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

�ﰢ���� ���� ����)

a, b, c �� ���� �����̰� c�� ���� �� ���̶�� �Ѵٸ�

c < a + b �̸� �ﰢ���� ������
 * */
public class Triangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		
		int max=0;
		int medium=0;
		int least=0;
		
		if(num1>=num2 && num1>=num3) {
			max=num1;
			if(num2>=num3) {
				medium=num2;
				least=num3;
			}else {
				medium=num3;
				least=num2;
			}
		}else if(num2>=num1 && num2>=num3) {
			max=num2;
			if(num1>=num3) {
				medium=num1;
				least=num3;
			}else {
				medium=num3;
				least=num2;
			}
		}else if(num3>=num1 && num3>=num2) {
			max=num3;
			if(num1>=num2) {
				medium=num1;
				least=num2;
			}else {
				medium=num2;
				least=num1;
			}
		}
		
		if(max<medium+least) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
