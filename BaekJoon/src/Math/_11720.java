package Math;
import java.io.IOException;
import java.util.Scanner;

public class _11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int n=scanner.nextInt();
		
		String line=scanner.next();
		
		for(int i=0; i<n; i++) {
			sum+=line.charAt(i)-'0';
		}

		System.out.println(sum);
		
	}

}
