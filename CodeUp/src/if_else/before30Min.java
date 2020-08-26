package if_else;

//입력한 시각의 30분 시각을 맞추는 문제   코드업 1173번
import java.util.Scanner;
public class before30Min {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int hour=scanner.nextInt();
		int min=scanner.nextInt();
		
		if(min<30) {
			
			hour=hour-1;
			if(hour<0) {
				hour=23;
			}
			min=min+60-30;
					
		}else {
			min=min-30;
		}

		System.out.println(hour+" "+min);
	}

}
