package if_else;
import java.util.Scanner;
//1180번 문제
/*이 때 압축하는 알고리즘은 다음과 같다.

10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.

예) 70일 경우 14가 된다.( 70 -> 07 -> 14 )

이 알고리즘은 때로는 부작용을 일으켜 휴지통의 내용이 더 많아 질지도 모른다.

만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.
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
