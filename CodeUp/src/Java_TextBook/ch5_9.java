package Java_TextBook;

import java.util.Scanner;
import simple_loop.BubbleSort;;
public class ch5_9  {

	public static void main(String[] args) {
		
		BubbleSort a=new BubbleSort();
		a.bubbleSort();
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
//	      int num = sc.nextInt();
//	      StringStack stack = new StringStack(num);
//	      while(true) {
//	         System.out.print("���ڿ� �Է� >> ");
//	         String val = sc.next();
//	         if(val.equals("�׸�"))
//	            break;
//	         if(!stack.push(val)) {
//	            System.out.println("������ �� ���� Ǫ�� �Ұ�!");
//	         }
//	      }
//	      System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
//	      int len = stack.length();
//	      for(int i=0; i<len; i++) {
//	         String s = stack.pop();
//	         System.out.print(s+" ");
//	      }
//	      sc.close();

	}

	

}

interface Stack{
	
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	
	private int num;   //�����Ҽ� �ִ� �ε��� ����
	private int set;   //�����ε���
	
	private String []stack; //���ù迭
	
	public StringStack(int num) {
		
		this.num=num;
		this.set=0;
		stack=new String[num];
	}
	
	public int length() {
		return set;
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public boolean push(String val) {
		
		if(set<num) {
			stack[set]=val;
			set++;
			return true;
		}else
			return false;
	
		
	}
	
	public String pop() {
		
		if(set-1 < 0){
			
		return null;
	}
		set--;
		String s=stack[set];
		return s;
		
	
	
}
}