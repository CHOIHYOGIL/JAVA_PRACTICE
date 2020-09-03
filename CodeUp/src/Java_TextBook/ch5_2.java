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
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String getSrcString(); // �߻� �޼ҵ�
	abstract protected String getDestString(); // �߻� �޼ҵ�
	protected double ratio; // ����
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	private int won;
	
	public Won2Dollar(int won) {
		this.won=won;
	}
	
	public String getSrcString() {
		return "��";
	}
	public String getDestString() {
		return "�޷�";
	}
	
	public double convert(double src) {
		return src/1200;
	}

	
}
