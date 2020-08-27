package simple_loop;
import java.util.Scanner;

public class _1072 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arr[];
		
		int size;
		size=scanner.nextInt();
		int num;
		arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			num=scanner.nextInt();
			arr[i]=num;;
	
		}
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}

	}

}
