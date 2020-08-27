package simple_loop;
import java.util.Scanner;

public class _1272 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int john= scanner.nextInt();
		int Bob=scanner.nextInt();
		int size;
		int arr[];
		if(john>Bob) {
			size=john;
		}else {
			size=Bob;
		}

		arr=new int[size];
		int k=0;
		for(int i=0; i<size ;i++) {
		
			if(i%2==0) {
				if(i==0) {
					arr[0]=1;
					System.out.println("Â¦¼öÀÏ¶§ : "+i+"¹ø¤Š : "+arr[i]);
				}else {
					k=i;
					arr[i]=arr[i-2]+1;
					System.out.println("Â¦¼öÀÏ¶§ : "+i+"¹ø¤Š : "+arr[i]);
				}
			
			}else {
				if(i==1) {
					arr[1]=10;
					System.out.println("È¦¼öÀÏ¶§ : "+i+"¹ø¤Š : "+arr[i]);
				}else {
					arr[i]=arr[i-1]*10;
					System.out.println("È¦¼öÀÏ¶§ : "+i+"¹ø¤Š : "+arr[i]);
				}
	
			}
		
		}
		
		System.out.println(arr[john-1]+arr[Bob-1]);

	}

}
