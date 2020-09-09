
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


	private String Item[]= {"음료", "음식", "팝콘"};
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
		this.movieSeat[seatA][seatNum-1] = "■";
	}
	public void set1MovieSeat(int seatA, int seatNum) {
		this.movieSeat[seatA][seatNum-1] = "□";
	}
	
	
	
	
	public void Run() {
		System.out.println("==== CGV에 오신걸 환영합니다 ====");
		System.out.println("==1. 알바생 ==");
		System.out.println("==2. 손님 ==");
		System.out.println("==0. 종료 ==");
		System.out.println("====역시 영화는 CGV!!!====");
		System.out.print("선택>>");
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
				System.out.println("\n\nNo.\t영화제목\t상영시간");
				System.out.println((i+1)+".\t"+movieDisk[i].getMovie()+"\t"+movieDisk[i].getTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------스크린-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int k='a'; k<='j'; k++) {
					System.out.println((char)k+"열\t□\t□\t□\t□\t□\t□\t□\t□\t□\t□");
				}
				System.out.println();
			}
			

			
		
		}else {
			System.out.println("상영중인 영화가 없습니다.");
			
		}
	}
	

	public void Customer() {
		
		System.out.println("=======================");
		System.out.println("======1. 영화관==========");
		System.out.println("======2. 매점===========");
		System.out.println("======0. 처음화면=========");
		System.out.println("=======================");
		System.out.print("선택 >>");
		int option=scanner.nextInt();
		
	
		CustomerChoose(option);
		
	}
	
	public void CustomerChoose(int option) {
	switch(option) {
		
		case 1:
			System.out.println("========================");
			System.out.println("======1. 영화예매==========");
			System.out.println("======2. 예매내역확인=======");
			System.out.println("======3. 영화예매취소=======");
			System.out.println("======0. 처음화면으로=======");
			System.out.println("========================");
			System.out.print("선택 >>");
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
				if(index==0) {
					System.out.println("상영중인 영화가 없습니다.");
					Customer();
				}else {
					miniShowMovie();
					System.out.println();
					System.out.print("예역하고 싶은 영화의 No.를 선택해주세요 >>");
					int num=scanner.nextInt();
				
					if(movieDisk[num-1]==null) {
						System.out.println("상영중인 영화가 없습니다. 확인하시구 다시 입력해주세요.");
						CustomerChoose(1);
						
					}
					System.out.println("선택하신 영화의 제목은 "+movieDisk[num-1].getMovie()+" 입니다.");
					System.out.print("몇명 예약하시겠습니까?");
					
					int person=scanner.nextInt();
					for(int i=1; i<=person; i++) {
						System.out.println(i+"번째 고객님 , 예매 도와드리겠습니다 ^^");
						System.out.print("좌석중에서 어디 열로 하시겠습니까? (a~z)");
						char seatAlpha=scanner.next().charAt(0);
						int seatAlpha1=(int)seatAlpha-97;
						System.out.print(seatAlpha+"열의 몇 번 자리로 하시겠습니까?(1~10) >");
						int seatNum=scanner.nextInt();
				
						
					
							id[id_index++]=new cinema(i, movieDisk[num-1].getMovie(), movieDisk[num-1].getTime(),seatAlpha1,(seatNum-1));

							
							movieSeat[seatAlpha1][seatNum-1]="■\t";
							
							//System.out.println("total result: "+total[0].getMovieSeat(seatAlpha1, seatNum-1)+" "+total[0].getMovie());
						
					
//							for(int n=0; n<total_index; n++) {
//								if(total[n].getMovie()==movieDisk[num-1].getMovie()) {
//									
//									total[total_index++]=new cinema(movieDisk[num-1].getMovie(), movieSeat[seatAlpha1][seatNum]);
//									total[0].setMovieSeat(seatAlpha1, seatNum);
//							
//								}
//							}
						System.out.println("예약이 완료되었습니다!! 즐거운 관람되세요\n");
						System.out.println("고객님의 ID는"+i+"입니다.");
						System.out.println("부여받으신 ID는 예매내역 확인이나 예매 취소시 사용됩니다 . 잊지마세요!!\n\n");
						
					}
					CustomerChoose(1);
				}
				break;
				
			case 2:
				if(index!=0) {
					int a=97;
	
					for(int k=0; k<index; k++) {
						System.out.println("\nNo.\t영화제목\t상영시간");
						System.out.println();
						System.out.println((k+1)+".\t"+movieDisk[k].getMovie()+"\t"+movieDisk[k].getTime());
						System.out.println("\t"+"------------------------------");
						System.out.println("\t"+"-                            -");
						System.out.println("\t"+"-                            -");
						System.out.println("\t"+"-------------스크린-------------");
						System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");


				
						//System.out.println("here1 :"+total[0].getMovieSeat(0, 1));
						for(int i=0; i<movieSeat.length; i++) {
							char b=(char)a;
							System.out.print(b+"\t");

							for(int j=0; j<movieSeat.length; j++){
								
								if(movieSeat[i][j]==null) {
									movieSeat[i][j]="□\t";
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
				
					System.out.println("상영중인 영화가 없습니다.");
					CustomerChoose(1);
			
			}
			break;
			
			
		case 3:
			System.out.print("예매시 부여받은 ID를 입력하세요 : ");
			int givenId=scanner.nextInt();
			
			for(int i=0; i<movieDisk.length; i++) {
				if(givenId==id[i].getId_num()) {
					System.out.println("예매하셨던 영화의 제목은"+id[i].getMovie()+", 상영시간은 ("+id[i].getTime()+") 입니다.");
					System.out.print("정말 예매를 취소하시겠어요? (y/n)");
					char choice1=scanner.next().charAt(0);
					if(choice1=='y') {
					
						System.out.println("result : "+id[i].getSeatA()+" "+id[i].getSeatNum());
							movieSeat[id[i].getSeatA()][id[i].getSeatNum()]="□\t";
					
							
					
					
						System.out.println("예매취소완료!!");
						CustomerChoose(1);
						break;
					}else if(choice1=='n') {
						System.out.println("예매를 취소하겠습니다.!");
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
		
		System.out.println("==== 안녕 미소지기! ====");
		System.out.println("==== 1. 영화 추가하기 ====");
		System.out.println("==== 2. 영화 수정하기 ====");
		System.out.println("==== 3. 영화 삭제하기 ====");
		System.out.println("==== 4. 상영중인 영화 ====");
		
		System.out.println("\n==== CGV 매점 ====");
		System.out.println("==== 5. 재고 확인하기 ====");
		System.out.println("==== 6. 상품등록 ====");
		System.out.println("==== 7. 상품수정 ====");
		System.out.println("==== 8. 상품삭제 ====");
		System.out.println("==== 0. 처음 화면으로 ====");
	
		System.out.print("선택 >>");
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
		
		System.out.println("===============음료===============");
		System.out.println("===============음식===============");
		System.out.println("===============팝콘===============");
	}
	public void AddMovie() {
		System.out.println("=== 새로운 영화가 개봉 했나보군요! ===");
		System.out.print("등록하고 싶은 영화의 제목을 입력하세요 >>");
		String movie=scanner.next();
		System.out.print("영화 "+movie+"의 상영시간을 입력하시오 (hh:mm) >");
		String time=scanner.next();
		System.out.print(movie+" 영화 상영시간("+time+")이 맞습니까? (y/n)>");
		char a=scanner.next().charAt(0);
		
		switch(a) {
		
		case 'y' :
			cinema add=new cinema(movie,time);
			movieDisk[index++]=add;

			System.out.println("영화 등록이 완료되었습니다.");
			
			Staff();
			break;
		case 'n' :
			System.out.println("영화등록이 취소되었습니다.");
			Staff();
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
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
		
		System.out.print("수정하려는 영화의 No.를 선택해주세요 >>");
		int movieNum=scanner.nextInt();
		
		System.out.println(movieDisk[movieNum-1].getMovie()+"를 선택하셨습니다.");
		System.out.print("무엇을 수정하시곘습니까? [1. 영화제목 / 2. 상영시간 ] >>");
		int option=scanner.nextInt();
		if(option==1) {
			System.out.print("변경하고 싶은 새 제목을 입력하세요 >> ");
			String newMovie=scanner.next();
			movieDisk[movieNum-1].setMovie(newMovie);
			System.out.println(newMovie+"로 변경 완료되었습니다.");
			Staff();
		}else if(option==2){
			System.out.print("변경하고 싶은 새 상영시간을 입력하세요 >> ");
			String newMovieTime=scanner.next();
			movieDisk[movieNum-1].setTime(newMovieTime);
			System.out.println(newMovieTime+"로 변경 완료되었습니다.");
			Staff();
		}else {
			System.out.println("잘못입력하셨습니다.");
			UpdateMovie();
		}
	}
	
	public void deleteMovie() {

	miniShowMovie();
		System.out.print("삭제하려는 영화의 No.를 입력해주세요 >>");
		int deleteNum=scanner.nextInt();
		System.out.println(movieDisk[deleteNum-1].getMovie()+"를 선택하셨습니다.");
		System.out.print("정말로 삭제하시겠습니까? [y/n] >");
		char a=scanner.next().charAt(0);
		
		if(a=='y') {
			System.out.println(movieDisk[deleteNum-1].getMovie());
			for(int i=deleteNum-1; i<index-1; i++) {
				movieDisk[i]=movieDisk[i+1];
			}
			index--;
			System.out.println("삭제완료 !");
			Staff();
		
		}else if(a=='n') {
			System.out.println("삭제작업을 중단합니다.");
			Staff();
		}else {
			System.out.println("잘못입력하셨습니다.");
			deleteMovie();
		}
	}
	
}
