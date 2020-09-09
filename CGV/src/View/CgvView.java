package View;

import java.util.Scanner;

import model.Movie;

public class CgvView {
	Scanner scanner;
	String time,name;
	Movie movie[];

	public CgvView() {
		movie=new Movie[10];
		scanner=new Scanner(System.in);
		
	}
	public int Welcome() {
		
		System.out.println("--- CGV�� ���Ű��� ȯ���մϴ� ---");
		System.out.println("1. �˹ٻ�");
		System.out.println("2. �մ�");
		System.out.println("3. ����");
		System.out.println("=== ��ȭ�� ���� CGV ===");
		System.out.print("����>");
		int choice=scanner.nextInt();
		return choice;
	}
	
	
	public int Alba() {
		System.out.println("-------�ȳ� �̼����� -------");
		System.out.println("1. ��ȭ �߰��ϱ�");
		System.out.println("2. ��ȭ �����ϱ�");
		System.out.println("3. ��ȭ �����ϱ�");
		System.out.println("4. ������ ��ȭ");
		System.out.println("\n-----CGV ����-----");
		System.out.println("5. ��� ��Ȳ����");
		System.out.println("6. ��ǰ���");
		System.out.println("7. ��ǰ����");
		System.out.println("8. ��ǰ����");
		System.out.println("0. ó��ȭ������");
		System.out.print("���� > ");
		int choice=scanner.nextInt();
		return choice;
	}
	
	public Movie InsertMovie() {
		
		System.out.println("���ο� ��ȭ�� �����Ƴ�������!!");
		while(true) {
			System.out.print("����ϰ� ���� ��ȭ�� ������ �Է��ϼ��� > ");
			 name=scanner.next();
			System.out.print("��ȭ �׳��� �󿵽ð��� �Է��Ͻÿ� (hh:mm) >");
			 time=scanner.next();
			System.out.print(name+" ��ȭ �󿵽ð��� ("+time+") �� �½��ϱ�? (y/n) >");
			char decide=scanner.next().charAt(0);
			if(decide=='y') {
				System.out.println("��ȭ����� �Ǿ����ϴ�.");
				Movie m=new Movie(name,time);
			
				return m;
			}else if(decide=='n') {
				System.out.println("��ȭ����� ��� �Ǿ����ϴ�.");
				Alba();
				
			}else {
				System.out.println("�߸� �����Ͽ����ϴ�.");
				
			}
	
		}
	}
	public void ShowMovie(int index, Movie movie[]) {
		
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t��ȭ����\t�󿵽ð�");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------��ũ��-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"��\t��\t��\t��\t��\t��\t��\t��\t��\t��\t��");
				}
				System.out.println();
				
			}
		
	}else {
		System.out.println("������ ��ȭ�� �����ϴ�.");
		Alba();
	}
	}
	public String DeleteMovie(int index, Movie movie[]) {
		
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t��ȭ����\t�󿵽ð�");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------��ũ��-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"��\t��\t��\t��\t��\t��\t��\t��\t��\t��\t��");
				}
				System.out.println();
				
			}
			
			System.out.println("�����Ϸ��� ��ȭ�� No.��  �������ּ��� > (1~"+(i-1)+")>");
			int choice=scanner.nextInt();
			System.out.println(movie[choice-1].getMovieName()+"��ȭ�� �����ϼ̽��ϴ�.");
			
			System.out.print("��¥�� �����Ͻðڽ��ϱ�? [y/n]");
			char choice1=scanner.next().charAt(0);
			if(choice1=='y') {
				System.out.println("�����Ϸ�");
				return movie[choice-1].getMovieName();
				
			}else if(choice1=='n') {
				System.out.println("���� �۾��� �ߴ��մϴ�.");
				Alba();
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		return "";
	}
	
	public void UpdateMovie(int index, Movie movie[]) {
		System.out.println(index);
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t��ȭ����\t�󿵽ð�");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------��ũ��-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"��\t��\t��\t��\t��\t��\t��\t��\t��\t��\t��");
				}
				System.out.println();
				
			}
			
			System.out.println("�����Ϸ��� ��ȭ�� No.��  �������ּ��� > (1~"+(i-1)+")>");
			int choice=scanner.nextInt();
			System.out.println(movie[choice-1].getMovieName()+" ��ȭ�� �����������ϴ�.");
			System.out.println("������ �����Ͻðڽ��ϱ�? [1. ��ȭ���� / 2. �󿵽ð� ] ");
			int choice1=scanner.nextInt();
			if(choice1==1) {
				System.out.println("�����ϰ� ���� �� ������ �Է��ϼ��� > ");
				String newMovieName=scanner.next();
				System.out.println(newMovieName+"���� ���� �Ϸ�Ǿ����ϴ�.");
				movie[choice-1].setMovieName(newMovieName);
			
			}else if(choice1==2) {
				System.out.println("�����ϰ� ���� �� �󿵽ð��� �Է��ϼ��� ((hh:mm) >");
				String newMovieTime=scanner.next();
				System.out.println(newMovieTime+"���� ���� �Ϸ�Ǿ����ϴ�.");
				movie[choice-1].setMovieTime(newMovieTime);
			}else {
				System.out.println("�߸��� ��ȣ�� �����Ͽ����ϴ�.");
				Alba();
			}
			
		}else {
			System.out.println("������ ��ȭ�� �����ϴ�.");
		}
		
		

	}
}
