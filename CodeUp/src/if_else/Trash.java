package if_else;
import java.util.Scanner;
//1180�� ����
/*�� �� �����ϴ� �˰����� ������ ����.

10�� �ڸ����� 1�� �ڸ����� ���� �ٲٰ�, �ű⿡ 2�� ���Ѵ�.

��) 70�� ��� 14�� �ȴ�.( 70 -> 07 -> 14 )

�� �˰����� ���δ� ���ۿ��� ������ �������� ������ �� ���� ������ �𸥴�.

���� �� �˰����� �ɰ��� ���ۿ����� ��ġ�� 100�� �Ѵ´ٸ� 100�� �ڸ����� ���õȴ�.
 * */
public class Trash {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		int ten=num/10;
		int rest=num%10;
		
		int newNum=rest*10+ten;
		
		if((newNum*2)<=50){
			System.out.println(newNum*2);
			System.out.println("GOOD");
			
		}else {
			if(newNum*2>=100) {
				newNum=newNum*2-100;
				if(newNum<=50) {
					System.out.println(newNum);
					System.out.println("GOOD");
				}else {
					System.out.println(newNum);
					System.out.println("OH MY GOD");
				}
				
			}else {
				System.out.println(newNum*2);
				System.out.println("OH MY GOD");
			}
		
		}
	}

}
