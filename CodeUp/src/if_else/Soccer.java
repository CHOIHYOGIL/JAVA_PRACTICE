package if_else;

import java.util.Scanner;

/*
 * �ڵ�� 1165
 * �����̴� 5�и��� ���� ���� �� �ִ� �ɷ��� ������ �ִ�.

���� 80�п� ������ �Ǹ� 80�п� ��ٷ� ���� �ְԵǰ� 85�п� ���� �������μ� ������ �����ϰ� �ȴ�.

(90���̵Ǹ� ��Ⱑ �ٷ� ����ǹǷ� ���� ���� �� ����. ���������� �����̴� �����̰� �� �Ǵ� ���� �Ⱦ��ϱ� ������ �߰��ð� ������ ���� �ʴ´�. )

���� ���Ÿ�Ӱ� �츮���� ������ �Է����� �־� ����, �����̸� �����ϸ� �츮���� ���� ������ �� ������ ����Ͻÿ�.
 * */
public class Soccer {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int time=scanner.nextInt();
		int score=scanner.nextInt();
		int total=0;
		total=score;
		for(int i=time; i<90; i=i+5) {
			
			total+=1;
			}
		
		System.out.println(total);
		}
	

}
