package Java_TextBook;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class ch7_6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Student1 s;
		Student1 s1;
		HashMap<String, Student1> stu=new HashMap<String,Student1>();
		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ��� . ");
		for(int i=0; i<4; i++) {
			String name=scanner.next();
			String major=scanner.next();
			int num=scanner.nextInt();
			double avg=scanner.nextDouble();
			
			s=new Student1(major,num,avg);
			stu.put(name,s);
			
		}
		Set<String> keys=stu.keySet();
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			 s1=stu.get(name);
				System.out.println("---------------------------");
			System.out.println("�̸� : "+name);
			System.out.println("�а� : "+s1.getMajor());
			System.out.println("�й� : "+s1.getNum());
			System.out.println("������� : "+s1.getAvg());
			
		}
		System.out.println("---------------------------");
		
		boolean bool=true;
		
		while(bool) {
			System.out.print("�л��̸�>>");
			String name=scanner.next();
			if(name.equals("�׸�")) {
				bool=false;
				break;
			}
		
				System.out.println(name+" "+stu.get(name).getMajor()+" "+stu.get(name).getNum()+" "+stu.get(name).getAvg());
			
		
		}
	}

}


class Student1{
	
	private String name;
	private String major;
	private int num;
	private double avg;

	

	public Student1(String name, String major, int num, double avg) {
		super();
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}
	public Student1(String major, int num, double avg) {
		super();

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