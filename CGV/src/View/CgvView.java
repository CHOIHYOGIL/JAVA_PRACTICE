package View;

import java.util.Scanner;

import model.Drink;
import model.Food;
import model.Movie;
import model.Popcorn;

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
	
	// ���� ����
		public void showDrink(int dIndex, Drink []drink1) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink1[i].getName() + "\t\t" + drink1[i].getAmount() + "\t\t" + drink1[i].getPrice());
			}
		}

		// ���� ����
		public void showFood(int fIndex, Food []food) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
		}

		// ���� ����
		public void showPopcorn(int popIndex, Popcorn []popcorn) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t\t\t����\t\t����\t\t��");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
		}
		public Drink insertDrink() {
			System.out.print("��ǰ�� �Է� : ");
			String drinkName=scanner.next();
			System.out.print("���� �Է� : ");
			int drinkAmount=scanner.nextInt();
			System.out.print("���� �Է� : ");
			int drinkPrice=scanner.nextInt();
			Drink drink1=new Drink(drinkName, drinkAmount, drinkPrice);
			System.out.println("��ϿϷ�");
			return drink1;
			
		}
		public Food insertFood() {
			System.out.print("��ǰ�� �Է� : ");
			String foodName=scanner.next();
			System.out.print("���� �Է� : ");
			int foodAmount=scanner.nextInt();
			System.out.print("���� �Է� : ");
			int foodPrice=scanner.nextInt();
			Food food1=new Food(foodName, foodAmount, foodPrice);
			System.out.println("��ϿϷ�");
			return food1;
		}
		public Popcorn insertPopcorn() {
			System.out.print("��ǰ�� �Է� : ");
			String PopcornName=scanner.next();
			System.out.print("���� �Է� : ");
			int PopcornAmount=scanner.nextInt();
			System.out.print("���� �Է� : ");
			int PopcornPrice=scanner.nextInt();
			System.out.print("�� �Է� : ");
			String taste=scanner.next();
			Popcorn pop1=new Popcorn(PopcornName, PopcornAmount, PopcornPrice,taste);
			System.out.println("��ϿϷ�");
			return pop1;
			
		}
		public void updateDrink(int dIndex, Drink[]drink1) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink1[i].getName() + "\t\t" + drink1[i].getAmount() + "\t\t" + drink1[i].getPrice());
			}
			
			System.out.print("��� ������ ��ǰ�� No.�� �������ּ��� >");
			int sel=scanner.nextInt();
			System.out.println(drink1[sel-1].getName()+"��ǰ�� �����ϼ̽��ϴ�.");
			System.out.println("���� ����"+drink1[sel-1].getAmount()+"�Դϴ�.");
			System.out.print("��� �� ���� �������� �Է����ּ��� > ");
			int drinkA=scanner.nextInt();
			drink1[sel-1].setAmount(drinkA);
			System.out.println(drinkA+"���� ���� �Ϸ� �Ǿ����ϴ�.");
		}
		public void updateFood(int fIndex, Food[]food) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
			System.out.print("��� ������ ��ǰ�� No.�� �������ּ��� >");
			int sel=scanner.nextInt();
			System.out.println(food[sel-1].getName()+"��ǰ�� �����ϼ̽��ϴ�.");
			System.out.println("���� ����"+food[sel-1].getAmount()+"�Դϴ�.");
			System.out.print("��� �� ���� �������� �Է����ּ��� > ");
			int foodA=scanner.nextInt();
			food[sel-1].setAmount(foodA);
			System.out.println(foodA+"���� ���� �Ϸ� �Ǿ����ϴ�.");
		}
		public void updatePopcorn(int popIndex, Popcorn[]popcorn) {
		
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t\t\t����\t\t����\t\t��");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
			System.out.print("��� ������ ��ǰ�� No.�� �������ּ��� >");
			int sel=scanner.nextInt();
			System.out.println(popcorn[sel-1].getName()+"��ǰ�� �����ϼ̽��ϴ�.");
			System.out.println("���� ����"+popcorn[sel-1].getAmount()+"�Դϴ�.");
			System.out.print("��� �� ���� �������� �Է����ּ��� > ");
			int popA=scanner.nextInt();
			popcorn[sel-1].setAmount(popA);
			System.out.println(popA+"���� ���� �Ϸ� �Ǿ����ϴ�.");
		}
		
		public int deleteDrink(int dIndex, Drink[]drink) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink[i].getName() + "\t\t" + drink[i].getAmount() + "\t\t" + drink[i].getPrice());
			}
			System.out.print("���� >");
			int choice=scanner.nextInt();
			System.out.println("���� �Ϸ�");
			return choice;
			
			
		}
		public int deleteFood(int fIndex, Food []food) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t����\t\t����");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
			System.out.print("���� >");
			int choice=scanner.nextInt();
			System.out.println("���� �Ϸ�");
			return choice;
		}
		public int deletePopcorn(int popIndex, Popcorn []popcorn) {
			System.out.println("\n������������������ ���� ������������������");
			System.out.println("No.\t\t��ǰ��\t\t\t\t����\t\t����\t\t��");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
			System.out.print("���� >");
			int choice=scanner.nextInt();
			System.out.println("���� �Ϸ�");
			return choice;
		}
		public int DeleteThings() {
			System.out.println("====CGV����========");
			System.out.println("======��ǰ ���� ======");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("������ ��ǰ�� ī�װ��� �������ּ���>");
			int choice=scanner.nextInt();
			return choice;
		}
		public int UpdateThing() {
			
			System.out.println("===��ȭ�� ���� CGV ===");
			System.out.println("====CGV����========");
			System.out.println("======��� ���� ======");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.print("��� ������ ��ǰ�� ī�װ��� ���c�ּ��� > ");
			int choice=scanner.nextInt();
			return choice;
		}
		public int insertThing() {
			System.out.println("-------------------");
			System.out.println("====CGV����========");
			System.out.println("======��ǰ ��� ======");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ���");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");
			int choice=scanner.nextInt();
			return choice;
		}
}
