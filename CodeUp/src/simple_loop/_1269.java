package simple_loop;
import java.util.Scanner;

public class _1269 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int start, multi, plus,count;
		
		start=scanner.nextInt();
		multi=scanner.nextInt();
		plus=scanner.nextInt();
		count=scanner.nextInt();
		int result=start;
		for(int i=0; i<count-1; i++) {
		
			 result=multi*result+plus;
		}
		System.out.println(result);
		

	}

}
