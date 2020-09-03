package Java_TextBook;

import java.util.Scanner;

public class ch5_2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
	}

}


abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	private int won;
	
	public Won2Dollar(int won) {
		this.won=won;
	}
	
	public String getSrcString() {
		return "원";
	}
	public String getDestString() {
		return "달러";
	}
	
	public double convert(double src) {
		return src/1200;
	}

	
}
