package if_else;
import java.util.Scanner;
import java.lang.Math;
// ��Ģ����� ���������ؼ� ���� ū ��츦 ���

public class Max {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		float max=0;
		
		if(a+b>=max)
			max=a+b;
		if(a-b>=max)
			max=a-b;
		if(b-a>=max)
			max=b-a;
		if(a*b>=max)
			max=a*b;
		if(a/b>=max)
			max=a/b;
		if(b/a>=max)
			max=b/a;
		if(Math.pow(a, b)>=max)
			max=(float)Math.pow(a, b);
		if(Math.pow(b, a)>=max)
			max=(float)Math.pow(b, a);
		
		System.out.printf("%.6f",max);

	}

}
