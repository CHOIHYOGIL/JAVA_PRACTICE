package if_else;

import java.util.Scanner;
//���� :  q�� �Էµɶ����� �Էµ� ���ڸ� ���� �ٲ� ���� �� ����Ѵ�.

public class Character {

	public static void main(String[] args) {
		
	     char a;
	     Scanner scanner=new Scanner(System.in);
	     System.out.print("���ڸ� �Է��ϼ��� :");
	     while(true) {
	    	
	    	 a=scanner.next().charAt(0);
	    	 if(a=='q') {
	    		 System.out.println("q�� ���� �����ϰڽ��ϴ�.");
	    		 break; 
	    	 }
	    		 
	    	 
	     }

	}

}
