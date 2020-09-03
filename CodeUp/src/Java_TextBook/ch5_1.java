package Java_TextBook;

import java.util.Scanner;

public class ch5_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		
		iptv.printProperty();

	}

}

class IPTV extends ch5_1{
	
	private String IP;
	private int size;
	private int color;
	
	public IPTV(String IP, int size, int color) {
		this.IP=IP;
		this.size=size;
		this.color=color;
	}
	public void printProperty() {
		
		System.out.println("나의 IPTV는"+IP+" 주소의"+size+"인치"+color+"컬러");
	}
}
