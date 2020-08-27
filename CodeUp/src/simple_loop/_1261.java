package simple_loop;
import java.util.Scanner;

public class _1261 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		int k=0;;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%5==0) {
				 k=i;
		
				break;
			}else {
				k=1;
			}
		}
		
		if(k==1) {
			System.out.println("0");
		} else {
			System.out.println(arr[k]);
		}
	
	}

}
