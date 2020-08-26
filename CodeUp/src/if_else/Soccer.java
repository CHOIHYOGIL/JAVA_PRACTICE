package if_else;

import java.util.Scanner;

/*
 * 코드업 1165
 * 성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 동내심판인 성빈이는 성익이가 잘 되는 것을 싫어하기 때문에 추가시간 따위는 주지 않는다. )

현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.
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
