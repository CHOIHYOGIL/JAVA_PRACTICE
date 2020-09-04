package Java_TextBook;

import java.util.Scanner;
import java.util.ArrayList;

public class ch7_5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Student s[]=new Student[4];
		ArrayList<Student> a = new ArrayList<Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요 :");
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
			System.out.println("이름 : "+s[i].getName());
			System.out.println("학과 : "+s[i].getMajor());
			System.out.println("학번 : "+s[i].getNum());
			System.out.println("학점평균 : "+s[i].getAvg());
		}
		System.out.println("----------------------------");
		
		boolean bool=true;
		while(bool) {
			
			System.out.print("\n학생이름 : ");
			String name=scanner.next();
			
			if(name.equals("그만")) {
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