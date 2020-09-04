package Java_TextBook;

import java.util.Scanner;
import java.util.ArrayList;

public class ch7_5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Student s[]=new Student[4];
		ArrayList<Student> a = new ArrayList<Student>();
		
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ��� :");
		for(int i=0; i<s.length; i++) {
			String name=scanner.next();
			String major=scanner.next();
			int num=scanner.nextInt();
			double avg=scanner.nextDouble();
			
			s[i]=new Student(name,major,num,avg);
			a.add(s[i]);
			
		}
		
		for(int i=0; i<a.size(); i++) {
			System.out.println("----------------------------");
			System.out.println("�̸� : "+s[i].getName());
			System.out.println("�а� : "+s[i].getMajor());
			System.out.println("�й� : "+s[i].getNum());
			System.out.println("������� : "+s[i].getAvg());
		}
		System.out.println("----------------------------");
		
		boolean bool=true;
		while(bool) {
			
			System.out.print("\n�л��̸� : ");
			String name=scanner.next();
			
			if(name.equals("�׸�")) {
				bool=false;
				break;
			}
			for(int i=0; i<a.size(); i++) {
				if(a.get(i).getName().equals(name)) {
					System.out.print(a.get(i).getName()+" "+a.get(i).getMajor()+" "+a.get(i).getNum()+" "+a.get(i).getAvg());
				}
			}
		}

	}

}



class Student{
	
	private String name;
	private String major;
	private int num;
	private double avg;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String major, int num, double avg) {
		super();
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}