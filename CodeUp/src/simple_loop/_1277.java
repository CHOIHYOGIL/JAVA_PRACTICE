package simple_loop;
import java.util.Scanner;

public class _1277 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int size;
		
		size=scanner.nextInt();
		int arr[];
		arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		int middle= arr.length/2;

		System.out.print(arr[0]+" "+arr[middle]+" "+arr[arr.length-1]);

	}

}
