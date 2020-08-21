package if_else;

import java.util.Scanner;
//문제 :  q가 입력될때까지 입력된 문자를 줄을 바꿔 한줄 씩 출력한다.

public class Character {

	public static void main(String[] args) {
		
	     char a;
	     Scanner scanner=new Scanner(System.in);
	     System.out.print("문자를 입력하세요 :");
	     while(true) {
	    	
	    	 a=scanner.next().charAt(0);
	    	 if(a=='q') {
	    		 System.out.println("q가 눌려 종료하겠습니다.");
	    		 break; 
	    	 }
	    		 
	    	 
	     }

	}

}
