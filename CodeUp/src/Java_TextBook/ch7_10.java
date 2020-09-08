package Java_TextBook;
import java.util.Scanner;
import java.util.Vector;

public class ch7_10 {
	
	static Vector<Shape> vec=new Vector<Shape>();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		boolean bool=true;
		while(bool) {
			
	
		System.out.print("����(1), ����(2), ��� ����(3), ����(4) >>");

		int num=scanner.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.print("Line(1), Rect(2), Circle(3) >>");
			int ch=scanner.nextInt();
			if(ch<1 || ch>3) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}else {
				insert(ch);
				break;
			}
		case 2:
			System.out.print("������ ������ ��ġ>>");
			int position=scanner.nextInt();
			if(position>= vec.size() || vec.size()==0) {
				System.out.println("�����Ҽ������ϴ�.");
			}else {
				vec.remove(position);
			}
			break;
		case 3:
			view();
			break;
		case 4:
			bool=false;
			break;
		default:
			System.out.println("�߸��Է�����");
				break;
		}
		}
	}




public static void view() {
	
	for(int i=0; i<vec.size(); i++) {
		vec.get(i).draw();
	}
}

public static void insert(int ch) {
	Shape shape=null;
	switch(ch) {
	
	case 1:
		shape=new Line();
		break;
	case 2:
		shape=new Rect();
		break;
	case 3:
		shape=new Circle();
		break;
	
	
	}
	vec.add(shape);
}
public static abstract class Shape{
	
	
	public abstract void draw();
	
}

public static class Circle extends Shape{
	
	public void draw() {
		System.out.println("Circle");
	}
}
public static class Line extends Shape{
	
	public void draw() {
		System.out.println("Line");
	}
}
public static class Rect extends Shape{
	
	public void draw() {
		System.out.println("Rect");
	}
}
}