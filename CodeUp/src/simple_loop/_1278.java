package simple_loop;
import java.util.Scanner;

public class _1278 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int count=1;
		
		while(true) {
			if(num/10!=0) {
				count=count+1;
				num/=10;
			
			}
			else {
				break;
			}
		}
		
		System.out.println(count);
		

	}

}
