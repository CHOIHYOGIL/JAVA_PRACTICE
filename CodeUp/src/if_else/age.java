package if_else;

import java.util.Scanner;

//�ڵ��  1169
/*
 ���̰� �־����� �� �⵵�� �¾������ ����Ͻÿ�. (���̴� 2012�⵵ �����Դϴ�.)

��, ����� �� �⵵ 4�ڸ� �� ���� ���ڸ��� ����ϰ�, �� ĭ ��� �� 1900�⵵ ����̸� 1�� ���, 2000��� ����̸� 3�� ����Ͻÿ�.

��) 18���̸� 1995����̹Ƿ� 95 1�� ����Ѵ�.
 * */
public class age {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int age;
		age=scanner.nextInt();
		
		int year=2012-age+1;
		
	
		int count=0;
		if(year<2000) {
			year=year-1900;
			count=1;
		}else {
			year=year-2000;
			count=3;
		}
		
		System.out.println(year+" "+count);

	}

}
