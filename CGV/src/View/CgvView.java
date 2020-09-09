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
		
		System.out.println("--- CGV에 오신것을 환영합니다 ---");
		System.out.println("1. 알바생");
		System.out.println("2. 손님");
		System.out.println("3. 종료");
		System.out.println("=== 영화는 역시 CGV ===");
		System.out.print("선택>");
		int choice=scanner.nextInt();
		return choice;
	}
	
	
	public int Alba() {
		System.out.println("-------안녕 미소지기 -------");
		System.out.println("1. 영화 추가하기");
		System.out.println("2. 영화 수정하기");
		System.out.println("3. 영화 삭제하기");
		System.out.println("4. 상영중인 영화");
		System.out.println("\n-----CGV 매점-----");
		System.out.println("5. 재고 현황보기");
		System.out.println("6. 상품등록");
		System.out.println("7. 상품수정");
		System.out.println("8. 상품삭제");
		System.out.println("0. 처음화면으로");
		System.out.print("선택 > ");
		int choice=scanner.nextInt();
		return choice;
	}
	
	public Movie InsertMovie() {
		
		System.out.println("새로운 영화가 개봉됐나보군요!!");
		while(true) {
			System.out.print("등록하고 싶은 영화의 제목을 입력하세요 > ");
			 name=scanner.next();
			System.out.print("영화 테넷의 상영시간을 입력하시오 (hh:mm) >");
			 time=scanner.next();
			System.out.print(name+" 영화 상영시간이 ("+time+") 이 맞습니까? (y/n) >");
			char decide=scanner.next().charAt(0);
			if(decide=='y') {
				System.out.println("영화등록이 되었습니다.");
				Movie m=new Movie(name,time);
			
				return m;
			}else if(decide=='n') {
				System.out.println("영화등록이 취소 되었습니다.");
				Alba();
				
			}else {
				System.out.println("잘못 선택하였습니다.");
				
			}
	
		}
	}
	public void ShowMovie(int index, Movie movie[]) {
		
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t영화제목\t상영시간");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------스크린-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"열\t□\t□\t□\t□\t□\t□\t□\t□\t□\t□");
				}
				System.out.println();
				
			}
		
	}else {
		System.out.println("상영중인 영화가 없습니다.");
		Alba();
	}
	}
	public String DeleteMovie(int index, Movie movie[]) {
		
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t영화제목\t상영시간");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------스크린-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"열\t□\t□\t□\t□\t□\t□\t□\t□\t□\t□");
				}
				System.out.println();
				
			}
			
			System.out.println("삭제하려는 영화의 No.를  선택해주세요 > (1~"+(i-1)+")>");
			int choice=scanner.nextInt();
			System.out.println(movie[choice-1].getMovieName()+"영화를 선택하셨습니다.");
			
			System.out.print("진짜로 삭제하시겠습니까? [y/n]");
			char choice1=scanner.next().charAt(0);
			if(choice1=='y') {
				System.out.println("삭제완료");
				return movie[choice-1].getMovieName();
				
			}else if(choice1=='n') {
				System.out.println("삭제 작업을 중단합니다.");
				Alba();
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		return "";
	}
	
	public void UpdateMovie(int index, Movie movie[]) {
		System.out.println(index);
		int i=1;
		if(index>0) {

			for(int k=0; k<index; k++) {
				System.out.println("No.\t영화제목\t상영시간");
				System.out.println((i++)+"\t"+movie[k].getMovieName()+"\t"+movie[k].getMovieTime());
				System.out.println("\t"+"------------------------------");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-                            -");
				System.out.println("\t"+"-------------스크린-------------");
				System.out.println("\t"+"1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t");
				for(int j='a'; j<='j'; j++) {
					System.out.println((char)j+"열\t□\t□\t□\t□\t□\t□\t□\t□\t□\t□");
				}
				System.out.println();
				
			}
			
			System.out.println("수정하려는 영화의 No.를  선택해주세요 > (1~"+(i-1)+")>");
			int choice=scanner.nextInt();
			System.out.println(movie[choice-1].getMovieName()+" 영화를 선택하혔습니다.");
			System.out.println("무엇을 수정하시겠습니까? [1. 영화제목 / 2. 상영시간 ] ");
			int choice1=scanner.nextInt();
			if(choice1==1) {
				System.out.println("변경하고 싶은 새 제목을 입력하세요 > ");
				String newMovieName=scanner.next();
				System.out.println(newMovieName+"으로 변경 완료되었습니다.");
				movie[choice-1].setMovieName(newMovieName);
			
			}else if(choice1==2) {
				System.out.println("변경하고 싶은 새 상영시간을 입력하세요 ((hh:mm) >");
				String newMovieTime=scanner.next();
				System.out.println(newMovieTime+"으로 변경 완료되었습니다.");
				movie[choice-1].setMovieTime(newMovieTime);
			}else {
				System.out.println("잘못된 번호를 선택하였습니다.");
				Alba();
			}
			
		}else {
			System.out.println("수정할 영화가 없습니다.");
		}
		
		

	}
	
	// 음료 보기
		public void showDrink(int dIndex, Drink []drink1) {
			System.out.println("\n───────── 음료 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink1[i].getName() + "\t\t" + drink1[i].getAmount() + "\t\t" + drink1[i].getPrice());
			}
		}

		// 음식 보기
		public void showFood(int fIndex, Food []food) {
			System.out.println("\n───────── 음식 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
		}

		// 팝콘 보기
		public void showPopcorn(int popIndex, Popcorn []popcorn) {
			System.out.println("\n───────── 팝콘 ─────────");
			System.out.println("No.\t\t제품명\t\t\t\t수량\t\t가격\t\t맛");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
		}
		public Drink insertDrink() {
			System.out.print("제품명 입력 : ");
			String drinkName=scanner.next();
			System.out.print("수량 입력 : ");
			int drinkAmount=scanner.nextInt();
			System.out.print("가격 입력 : ");
			int drinkPrice=scanner.nextInt();
			Drink drink1=new Drink(drinkName, drinkAmount, drinkPrice);
			System.out.println("등록완료");
			return drink1;
			
		}
		public Food insertFood() {
			System.out.print("제품명 입력 : ");
			String foodName=scanner.next();
			System.out.print("수량 입력 : ");
			int foodAmount=scanner.nextInt();
			System.out.print("가격 입력 : ");
			int foodPrice=scanner.nextInt();
			Food food1=new Food(foodName, foodAmount, foodPrice);
			System.out.println("등록완료");
			return food1;
		}
		public Popcorn insertPopcorn() {
			System.out.print("제품명 입력 : ");
			String PopcornName=scanner.next();
			System.out.print("수량 입력 : ");
			int PopcornAmount=scanner.nextInt();
			System.out.print("가격 입력 : ");
			int PopcornPrice=scanner.nextInt();
			System.out.print("맛 입력 : ");
			String taste=scanner.next();
			Popcorn pop1=new Popcorn(PopcornName, PopcornAmount, PopcornPrice,taste);
			System.out.println("등록완료");
			return pop1;
			
		}
		public void updateDrink(int dIndex, Drink[]drink1) {
			System.out.println("\n───────── 음료 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink1[i].getName() + "\t\t" + drink1[i].getAmount() + "\t\t" + drink1[i].getPrice());
			}
			
			System.out.print("재고를 변경할 제품의 No.를 선택해주세요 >");
			int sel=scanner.nextInt();
			System.out.println(drink1[sel-1].getName()+"제품을 선택하셨습니다.");
			System.out.println("현재 재고는"+drink1[sel-1].getAmount()+"입니다.");
			System.out.print("재고를 몇 개로 수정할지 입력해주세요 > ");
			int drinkA=scanner.nextInt();
			drink1[sel-1].setAmount(drinkA);
			System.out.println(drinkA+"개로 수정 완료 되었습니다.");
		}
		public void updateFood(int fIndex, Food[]food) {
			System.out.println("\n───────── 음식 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
			System.out.print("재고를 변경할 제품의 No.를 선택해주세요 >");
			int sel=scanner.nextInt();
			System.out.println(food[sel-1].getName()+"제품을 선택하셨습니다.");
			System.out.println("현재 재고는"+food[sel-1].getAmount()+"입니다.");
			System.out.print("재고를 몇 개로 수정할지 입력해주세요 > ");
			int foodA=scanner.nextInt();
			food[sel-1].setAmount(foodA);
			System.out.println(foodA+"개로 수정 완료 되었습니다.");
		}
		public void updatePopcorn(int popIndex, Popcorn[]popcorn) {
		
			System.out.println("\n───────── 팝콘 ─────────");
			System.out.println("No.\t\t제품명\t\t\t\t수량\t\t가격\t\t맛");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
			System.out.print("재고를 변경할 제품의 No.를 선택해주세요 >");
			int sel=scanner.nextInt();
			System.out.println(popcorn[sel-1].getName()+"제품을 선택하셨습니다.");
			System.out.println("현재 재고는"+popcorn[sel-1].getAmount()+"입니다.");
			System.out.print("재고를 몇 개로 수정할지 입력해주세요 > ");
			int popA=scanner.nextInt();
			popcorn[sel-1].setAmount(popA);
			System.out.println(popA+"개로 수정 완료 되었습니다.");
		}
		
		public int deleteDrink(int dIndex, Drink[]drink) {
			System.out.println("\n───────── 음료 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < dIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + drink[i].getName() + "\t\t" + drink[i].getAmount() + "\t\t" + drink[i].getPrice());
			}
			System.out.print("선택 >");
			int choice=scanner.nextInt();
			System.out.println("삭제 완료");
			return choice;
			
			
		}
		public int deleteFood(int fIndex, Food []food) {
			System.out.println("\n───────── 음식 ─────────");
			System.out.println("No.\t\t제품명\t\t수량\t\t가격");
			for (int i = 0; i < fIndex; i++) {
				System.out
						.println((i + 1) + "\t\t" + food[i].getName() + "\t\t" + food[i].getAmount() + "\t\t" + food[i].getPrice());
			}
			System.out.print("선택 >");
			int choice=scanner.nextInt();
			System.out.println("삭제 완료");
			return choice;
		}
		public int deletePopcorn(int popIndex, Popcorn []popcorn) {
			System.out.println("\n───────── 팝콘 ─────────");
			System.out.println("No.\t\t제품명\t\t\t\t수량\t\t가격\t\t맛");
			for (int i = 0; i < popIndex; i++) {
				System.out.println((i + 1) + "\t\t" + popcorn[i].getName() + "\t\t\t" + popcorn[i].getAmount() + "\t\t"
						+ popcorn[i].getPrice() + "\t\t" + popcorn[i].getTaste());
			}
			System.out.print("선택 >");
			int choice=scanner.nextInt();
			System.out.println("삭제 완료");
			return choice;
		}
		public int DeleteThings() {
			System.out.println("====CGV매점========");
			System.out.println("======재품 삭제 ======");
			System.out.println("1. 음료 삭제");
			System.out.println("2. 음식 삭제");
			System.out.println("3. 팝콘 삭제");
			System.out.println("삭제할 제품의 카테고리를 선택해주세요>");
			int choice=scanner.nextInt();
			return choice;
		}
		public int UpdateThing() {
			
			System.out.println("===영화는 역시 CGV ===");
			System.out.println("====CGV매점========");
			System.out.println("======재고 수정 ======");
			System.out.println("1. 음료 수정");
			System.out.println("2. 음식 수정");
			System.out.println("3. 팝콘 수정");
			System.out.print("재고를 변경할 제품의 카테고리를 선태갷주세요 > ");
			int choice=scanner.nextInt();
			return choice;
		}
		public int insertThing() {
			System.out.println("-------------------");
			System.out.println("====CGV매점========");
			System.out.println("======상품 등록 ======");
			System.out.println("1. 음료 등록");
			System.out.println("2. 음식 등록");
			System.out.println("3. 팝콘 등록");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int choice=scanner.nextInt();
			return choice;
		}
}
