package Java_TextBook;
import java.util.Scanner;

public class ch4_11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		add Add1=new add();
		sub Sub1=new sub();
		mul Mul1=new mul();
		div Div1=new div();
		
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		char a=scanner.next().charAt(0);
		int result=0;
		switch(a) {
		
		case '+':
			Add1.setValue(num1,num2);
			result=Add1.calculate();
			break;
		case '-':
			Sub1.setValue(num1, num2);
			result=Sub1.calculate();
			break;
		case '*':
			Mul1.setValue(num1, num2);
			result=Mul1.calculate();
			break;
		case '/':
			Div1.setValue(num1, num2);
			result=Div1.calculate();
			break;
			
		}
		
		System.out.println(result);
	}



}

class sub{
	
	int a,b;
	
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a-b;
	}
}
class add{
	
	int a,b;
	
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	

	public int calculate() {
		return a+b;
	}
}

class mul{
	
	int a,b;
	
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a*b;
	}
}
class div{
	
	int a,b;
	
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calculate() {
		return a/b;
	}
}