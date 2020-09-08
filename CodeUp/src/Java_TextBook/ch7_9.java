package Java_TextBook;

import java.util.Scanner;
import java.util.Vector;

public class ch7_9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		IStack<Integer> stack=new MyStack<Integer>();
		for(int i=0; i<10; i++)
			stack.push(i);
		
		while(true) {
			Integer n=stack.pop();
			if(n==null)break;
			System.out.print(n+" ");
		}
		

	}

}
class MyStack<T> implements IStack<T>{

	Vector<T> vector=new Vector<T>();
	public void MyStack() {
		
	}
	public T pop() {
		if(vector.size()!=0) 
			return vector.remove(vector.size()-1);
		else
			return null;
	
	}
	public boolean push(T ob) {
		
		
			vector.add(ob);
			return true;
		
		
	}
}
interface IStack<T>{
	T pop();
	boolean push(T ob);
}
