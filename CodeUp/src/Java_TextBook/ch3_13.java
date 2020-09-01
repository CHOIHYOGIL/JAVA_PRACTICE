package Java_TextBook;
import java.util.Scanner;

public class ch3_13 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1; i<=99; i++) {
			
			int ten=i/10;
			int one=i%10;
			if(ten==0) {
				if(one%3==0)
				{
					System.out.println(i+"¹Ú¼ö Â¦");
				}
			}else {
				if(ten!=0 && one!=0) {
					if(ten%3==0 && one%3==0)	 {
						System.out.println(i+" ¹Ú¼ö Â¦Â¦");
					}else if(one%3==0 && ten%3!=0) {
						System.out.println(i+" ¹Ú¼ö Â¦");
					}else if(one%3!=0 && ten%3==0) {
						System.out.println(i+" ¹ß¼ö Â¦");
					}else {
						continue;
					}
				}else {
					if(i%3==0) {
						System.out.println(i+"¹Ú¼ö Â¦");
					}
				}
				
			}
			
	
		}
	}

}
