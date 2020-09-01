package Java_TextBook;
import java.util.Scanner;

public class ch2_3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money=scanner.nextInt();
		
		int fiveM=money/50000;
		int M=(money%50000)/10000;
		int ten=(money%10000)/1000;
		int thousand=(money%1000)/100;
		int fifty=(money%100)/50;
		int t=(money%50)/10;
		int one=(money%10);
		
		System.out.println("\n 오만원권 :"+fiveM+"매 \n만원권 : "+M+"매\n천원권 : "+ten+"개\n백원 : "+thousand+"개\n오십원 : "+fifty+"개\n십원 : "+t+"개\n일원 : "+one+"개\n");
	}

}
