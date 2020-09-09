
import java.util.Scanner;
public class Cgv {

	public static void main(String[] args) {
		
		cinema C=new cinema();
		C.Run();

	}

}

class Stuff{
	private String drink;
	private String food;
	private String popcorn;
	private String name;
	private int size;
	private int price;
	
	Stuff [] Menu;
	public Stuff() {
		Menu=new Stuff[3];
		
	}
	
	public Stuff(Stuff Menu[], String name, int size, int price) {
		this.Menu=Menu;
		this.name=name;
	    this.size=size;
		this.price=price;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getPopcorn() {
		return popcorn;
	}
	public void setPopcorn(String popcorn) {
		this.popcorn = popcorn;
	}

}
class cinema{
	
	Stuff []menu;
	int index=0;
	int id_index=0;
	int total_index=0;
	private int id_num;
	public int getId_num() {
		return id_num;
	}

	public void setId_num(int id_num) {
		this.id_num = id_num;
	}

	Scanner scanner;
	private String movie;
	private String time;
	private int seatA;
	private int seatNum;
	private int person;
	private String stuff;
	cinema []movieDisk;
	cinema	[]id;
	
	cinema[] total;
	public int getSeatA() {
		return seatA;
	}

	public void setSeatA(int seatA) {
		this.seatA = seatA;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}


	private String Item[]= {"����", "����", "����"};
	private String[][] movieSeat;
	private String movie1;

	public cinema() {
		scanner=new Scanner(System.in);
			menu=new Stuff[3];
			id=new cinema[100];
			total=new cinema[100];
	
			for(int i=0; i<menu.length; i++) {
				menu[i]=new Stuff();
			}
			movieDisk=new cinema[10];
			movieSeat=new String[10][10];
		
	}
	
	public cinema(String movie, String time) {
		this.movie=movie;
		this.time=time;
	}
	
	public cinema(String movie1, String[][] movieSeat) {
		this.movie1=movie1;
		this.movieSeat=movieSeat;
	}
	public cinema(int id_num, String movie, String time , int seatA, int seatNum) {
		this.id_num=id_num;
		this.movie=movie;
		this.time=time;
		this.seatA=seatA;
		this.seatNum=seatNum;
	}
	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public cinema[] getMovieDisk() {
		return movieDisk;
	}

	public void setMovieDisk(cinema[] movieDisk) {
		this.movieDisk = movieDisk;
	}

	public String getMovieSeat(int seatA, int seatNum) {
		return movieSeat[seatA][seatNum-1];
	}

	public void setMovieSeat(int seatA, int seatNum) {
		this.movieSeat[seatA][seatNum-1] = "��";
	}
	public void set1MovieSeat(int seatA, int seatNum) {
		this.movieSeat[seatA][seatNum-1] = "��";
	}
	
	
	
	
	public void Run() {
		System.out.println("==== CGV�� ���Ű� ȯ���մϴ� ====");
		System.out.println("==1. �˹ٻ� ==");
		System.out.println("==2. �մ� ==");
		System.out.println("==0. ���� ==");
		System.out.println("====���� ��ȭ�� CGV!!!====");
		System.out.print("����>>");
		int num=scanner.nextInt();
		switch(num) {
		
		case 1:
			Staff();
			break;
		case 2:
			Customer();
			break;
		case 0:
			//Finish();
			break;
		
		}
		
}
	
	public void miniShowMovie() {
		if(index!=0) {
	
			for(int i=0; i<index; i++) {
				System.out.println("\n\nNo.\t��ȭ����\t�󿵽ð�");
				System.out.println((i+1)+".\t"+movieDisk[i].getMovie()+"\t"+movieDisk[i].getTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------��ũ��-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int k='a'; k<='j'; k++) {
					System.out.println((char)k+"��\t��\t��\t��\t��\t��\t��\t��\t��\t��\t��");
				}
				System.out.println();
			}
			

			
		
		}else {
			System.out.println("������ ��ȭ�� �����ϴ�.");
			
		}
	}
	

	public void Customer() {
		
		System.out.println("=======================");
		System.out.println("======1. ��ȭ��==========");
		System.out.println("======2. ����===========");
		System.out.println("======0. ó��ȭ��=========");
		System.out.println("=======================");
		System.out.print("���� >>");
		int option=scanner.nextInt();
		
	
		CustomerChoose(option);
		
	}
	
	public void CustomerChoose(int option) {
	switch(option) {
		
		case 1:
			System.out.println("========================");
			System.out.println("======1. ��ȭ����==========");
			System.out.println("======2. ���ų���Ȯ��=======");
			System.out.println("======3. ��ȭ�������=======");
			System.out.println("======0. ó��ȭ������=======");
			System.out.println("========================");
			System.out.print("���� >>");
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
				if(index==0) {
					System.out.println("������ ��ȭ�� �����ϴ�.");
					Customer();
				}else {
					miniShowMovie();
					System.out.println();
					System.out.print("�����ϰ� ���� ��ȭ�� No.�� �������ּ��� >>");
					int num=scanner.nextInt();
				
					if(movieDisk[num-1]==null) {
						System.out.println("������ ��ȭ�� �����ϴ�. Ȯ���Ͻñ� �ٽ� �Է����ּ���.");
						CustomerChoose(1);
						
					}
					System.out.println("�����Ͻ� ��ȭ�� ������ "+movieDisk[num-1].getMovie()+" �Դϴ�.");
					System.out.print("��� �����Ͻðڽ��ϱ�?");
					
					int person=scanner.nextInt();
					for(int i=1; i<=person; i++) {
						System.out.println(i+"��° ���� , ���� ���͵帮�ڽ��ϴ� ^^");
						System.out.print("�¼��߿��� ��� ���� �Ͻðڽ��ϱ�? (a~z)");
						char seatAlpha=scanner.next().charAt(0);
						int seatAlpha1=(int)seatAlpha-97;
						System.out.print(seatAlpha+"���� �� �� �ڸ��� �Ͻðڽ��ϱ�?(1~10) >");
						int seatNum=scanner.nextInt();
				
						
					
							id[id_index++]=new cinema(i, movieDisk[num-1].getMovie(), movieDisk[num-1].getTime(),seatAlpha1,(seatNum-1));

							
							movieSeat[seatAlpha1][seatNum-1]="��\t";
							
							//System.out.println("total result: "+total[0].getMovieSeat(seatAlpha1, seatNum-1)+" "+total[0].getMovie());
						
					
//							for(int n=0; n<total_index; n++) {
//								if(total[n].getMovie()==movieDisk[num-1].getMovie()) {
//									
//									total[total_index++]=new cinema(movieDisk[num-1].getMovie(), movieSeat[seatAlpha1][seatNum]);
//									total[0].setMovieSeat(seatAlpha1, seatNum);
//							
//								}
//							}
						System.out.println("������ �Ϸ�Ǿ����ϴ�!! ��ſ� �����Ǽ���\n");
						System.out.println("������ ID��"+i+"�Դϴ�.");
						System.out.println("�ο������� ID�� ���ų��� Ȯ���̳� ���� ��ҽ� ���˴ϴ� . ����������!!\n\n");
						
					}
					CustomerChoose(1);
				}
				break;
				
			case 2:
				if(index!=0) {
					int a=97;
	
					for(int k=0; k<index; k++) {
						System.out.println("\nNo.\t��ȭ����\t�󿵽ð�");
						System.out.println();
						System.out.println((k+1)+".\t"+movieDisk[k].getMovie()+"\t"+movieDisk[k].getTime());
						System.out.println("\t"+"------------------------------");
						System.out.println("\t"+"-                            -");
						System.out.println("\t"+"-                            -");
						System.out.println("\t"+"-------------��ũ��-------------");
						System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");


				
						//System.out.println("here1 :"+total[0].getMovieSeat(0, 1));
						for(int i=0; i<movieSeat.length; i++) {
							char b=(char)a;
							System.out.print(b+"\t");

							for(int j=0; j<movieSeat.length; j++){
								
								if(movieSeat[i][j]==null) {
									movieSeat[i][j]="��\t";
								}
								System.out.print(movieSeat[i][j]);
							
							}
						
							
							a++;
							System.out.println("");
						}
					 a=97;
					}
					
			
				

				CustomerChoose(1);
			}else {
				
					System.out.println("������ ��ȭ�� �����ϴ�.");
					CustomerChoose(1);
			
			}
			break;
			
			
		case 3:
			System.out.print("���Ž� �ο����� ID�� �Է��ϼ��� : ");
			int givenId=scanner.nextInt();
			
			for(int i=0; i<movieDisk.length; i++) {
				if(givenId==id[i].getId_num()) {
					System.out.println("�����ϼ̴� ��ȭ�� ������"+id[i].getMovie()+", �󿵽ð��� ("+id[i].getTime()+") �Դϴ�.");
					System.out.print("���� ���Ÿ� ����Ͻðھ��? (y/n)");
					char choice1=scanner.next().charAt(0);
					if(choice1=='y') {
					
						System.out.println("result : "+id[i].getSeatA()+" "+id[i].getSeatNum());
							movieSeat[id[i].getSeatA()][id[i].getSeatNum()]="��\t";
					
							
					
					
						System.out.println("������ҿϷ�!!");
						CustomerChoose(1);
						break;
					}else if(choice1=='n') {
						System.out.println("���Ÿ� ����ϰڽ��ϴ�.!");
						CustomerChoose(1);
					}
				}
			}
			
			break;
			
		case 0:
			Run();
			break;
		}}
	}

	public void Staff() {
		
		System.out.println("==== �ȳ� �̼�����! ====");
		System.out.println("==== 1. ��ȭ �߰��ϱ� ====");
		System.out.println("==== 2. ��ȭ �����ϱ� ====");
		System.out.println("==== 3. ��ȭ �����ϱ� ====");
		System.out.println("==== 4. ������ ��ȭ ====");
		
		System.out.println("\n==== CGV ���� ====");
		System.out.println("==== 5. ��� Ȯ���ϱ� ====");
		System.out.println("==== 6. ��ǰ��� ====");
		System.out.println("==== 7. ��ǰ���� ====");
		System.out.println("==== 8. ��ǰ���� ====");
		System.out.println("==== 0. ó�� ȭ������ ====");
	
		System.out.print("���� >>");
		int num=scanner.nextInt();
		
		switch(num) {
		
		case 1:
			AddMovie();
			break;
		case 2:
			UpdateMovie();
			break;
		case 3:
			deleteMovie();
			break;
		case 4:
			ShowMovie();
			break;
		case 5:
			ShowStuff();
			break;
		case 6:
			//AddStuff();
			break;
		case 7:
			//UpdateStuff();
			break;
		case 8:
			//deleteStuff();
			break;
		case 0:
			goBack();
			break;
		}
	}
	public void goBack() {
		Run();
	}
	
	public void ShowStuff() {
		
		System.out.println("===============����===============");
		System.out.println("===============����===============");
		System.out.println("===============����===============");
	}
	public void AddMovie() {
		System.out.println("=== ���ο� ��ȭ�� ���� �߳�������! ===");
		System.out.print("����ϰ� ���� ��ȭ�� ������ �Է��ϼ��� >>");
		String movie=scanner.next();
		System.out.print("��ȭ "+movie+"�� �󿵽ð��� �Է��Ͻÿ� (hh:mm) >");
		String time=scanner.next();
		System.out.print(movie+" ��ȭ �󿵽ð�("+time+")�� �½��ϱ�? (y/n)>");
		char a=scanner.next().charAt(0);
		
		switch(a) {
		
		case 'y' :
			cinema add=new cinema(movie,time);
			movieDisk[index++]=add;

			System.out.println("��ȭ ����� �Ϸ�Ǿ����ϴ�.");
			
			Staff();
			break;
		case 'n' :
			System.out.println("��ȭ����� ��ҵǾ����ϴ�.");
			Staff();
			break;
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			AddMovie();
			break;
		}
	}
	
	public void ShowMovie() {
		

		
		miniShowMovie();
		Staff();
	}
	
	public void UpdateMovie() {
		
		miniShowMovie();
		
		System.out.print("�����Ϸ��� ��ȭ�� No.�� �������ּ��� >>");
		int movieNum=scanner.nextInt();
		
		System.out.println(movieDisk[movieNum-1].getMovie()+"�� �����ϼ̽��ϴ�.");
		System.out.print("������ �����ϽÁٽ��ϱ�? [1. ��ȭ���� / 2. �󿵽ð� ] >>");
		int option=scanner.nextInt();
		if(option==1) {
			System.out.print("�����ϰ� ���� �� ������ �Է��ϼ��� >> ");
			String newMovie=scanner.next();
			movieDisk[movieNum-1].setMovie(newMovie);
			System.out.println(newMovie+"�� ���� �Ϸ�Ǿ����ϴ�.");
			Staff();
		}else if(option==2){
			System.out.print("�����ϰ� ���� �� �󿵽ð��� �Է��ϼ��� >> ");
			String newMovieTime=scanner.next();
			movieDisk[movieNum-1].setTime(newMovieTime);
			System.out.println(newMovieTime+"�� ���� �Ϸ�Ǿ����ϴ�.");
			Staff();
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			UpdateMovie();
		}
	}
	
	public void deleteMovie() {

	miniShowMovie();
		System.out.print("�����Ϸ��� ��ȭ�� No.�� �Է����ּ��� >>");
		int deleteNum=scanner.nextInt();
		System.out.println(movieDisk[deleteNum-1].getMovie()+"�� �����ϼ̽��ϴ�.");
		System.out.print("������ �����Ͻðڽ��ϱ�? [y/n] >");
		char a=scanner.next().charAt(0);
		
		if(a=='y') {
			System.out.println(movieDisk[deleteNum-1].getMovie());
			for(int i=deleteNum-1; i<index-1; i++) {
				movieDisk[i]=movieDisk[i+1];
			}
			index--;
			System.out.println("�����Ϸ� !");
			Staff();
		
		}else if(a=='n') {
			System.out.println("�����۾��� �ߴ��մϴ�.");
			Staff();
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			deleteMovie();
		}
	}
	
}
