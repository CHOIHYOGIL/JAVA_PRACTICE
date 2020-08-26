package if_else;
import java.util.Scanner;
/*
 * 1212번
 * 세 개의 직선이 있다.

숫자의 의미는 직선의 길이를 말한다.

이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.

삼각형의 성립 조건)

a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면

c < a + b 이면 삼각형이 성립됨
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
