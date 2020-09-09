package Controller;

import View.CgvView;
import model.Drink;
import model.Food;
import model.Movie;
import model.Popcorn;
import model.Product;

public class Controller {
	
	CgvView view;
	
	Movie [] movie;
	int mindex=0;
	
	Product [] product=new Product[10];
	int pIndex=0;
	
	Drink[] drink=new Drink[10];
	int dIndex=0;
	
	Food[] food=new Food[10];
	int fIndex=0;
	
	Popcorn[] popcorn=new Popcorn[10];
	int popIndex=0;
	
		public Controller() {
			movie=new Movie[10];
			view=new CgvView();
			drink[dIndex++] = new Drink("Æé½Ã   ", 30, 2500);
			drink[dIndex++] = new Drink("»çÀÌ´Ù ", 20, 2500);
			drink[dIndex++] = new Drink("È¯Å¸   ", 25, 3000);
			drink[dIndex++] = new Drink("ÁÖ½º", 40, 2000);
			drink[dIndex++] = new Drink("³ÃÄ¿ÇÇ ", 10, 2000);
			food[fIndex++] = new Food("³ªÃÝ   ", 10, 3000);
			food[fIndex++] = new Food("ÇÁ·¹Áñ ", 20, 2000);
			food[fIndex++] = new Food("ÇÖµµ±× ", 17, 4000);
			food[fIndex++] = new Food("ÇÖ¹Ù   ", 18, 4000);
			food[fIndex++] = new Food("¿ÀÂ¡¾î ", 19, 4500);
			popcorn[popIndex++] = new Popcorn("Ä«·ª¸áÆËÄÜ", 200, 5000, "´ÞÄÞÇÑ¸À");
			popcorn[popIndex++] = new Popcorn("ÆËÄÜ      ", 200, 5000, "Â¬Â©ÇÑ¸À");
			popcorn[popIndex++] = new Popcorn("Ä¡ÁîÆËÄÜ  ", 200, 5000, "Ä¡Áî¸À");

			
		}
	
	public void main() {
		boolean bool=true;
		while(bool) {
			int sel=view.Welcome();
			
			switch(sel) {
			
			case 1:
				int sel1=view.Alba();
				AlbaChoice(sel1);
				break;
			case 2:
				break;
			case 3:
				bool=false;
				System.out.println("Á¾·áÇÕ´Ï´Ù.");
				break;
			default:
				System.out.println("Àß¸øÀÔ·ÂÇß½À´Ï´Ù");
				break;
			}
		}
	}
	
	public void AlbaChoice(int sel1) {
		switch(sel1) {
		
		case 1:
			insertMovie();
			break;
		case 2:
			UpdateMovie();
			break;
		case 3:
			DeleteMovie();
			break;
		case 4:
			ShowMovie();
			break;
		case 5:
			ShowThings();
			break;
		case 6:
			insertThing();
			break;
		case 7:
			UpdateThing();
			break;
		case 8:
			DeleteThings();
			break;
		case 0:
			main();
			break;
		}
		
	}
	
	
	public void DeleteThings() {
		int sel=view.DeleteThings();
		switch(sel) {
		case 1:
			int choice=view.deleteDrink(dIndex,drink);
			for(int i=choice; i<dIndex; i++) {
				drink[i]=drink[i+1];
			}
			dIndex--;
			break;
		case 2:
			int choice1=view.deleteFood(fIndex,food);
			for(int i=choice1; i<fIndex; i++) {
				food[i]=food[i+1];
			}
			fIndex--;
			break;
		case 3:
			int choice3=view.deletePopcorn(popIndex,popcorn);
			for(int i=choice3; i<popIndex; i++) {
				popcorn[i]=popcorn[i+1];
			}
			popIndex--;
			break;
		default:
			System.out.println("Àß¸øÀÔ·Â");
			break;
		}
	}
	public void UpdateThing() {
		int sel=view.UpdateThing();
		switch(sel) {
		case 1:
			view.updateDrink(dIndex,drink);
			break;
		case 2:
			view.updateFood(fIndex,food);
			break;
		case 3:
			view.updatePopcorn(popIndex,popcorn);
			break;
		default:
			System.out.println("Àß¸øÀÔ·Â");
			break;
		}
	}
	public void insertThing() {
		
		int sel=view.insertThing();
		switch(sel) {
		case 1:
			Drink d=view.insertDrink();
			drink[dIndex++]=d;
			break;
		case 2:
			Food f=view.insertFood();
			food[fIndex++]=f;
			break;
		case 3:
			Popcorn p=view.insertPopcorn();
			popcorn[popIndex++]=p;
			break;
		}
	}
	public void ShowThings() {
		
		view.showDrink(dIndex, drink);
		view.showFood(fIndex, food);
		view.showPopcorn(popIndex, popcorn);
	}
	public	void ShowMovie() {
		
		view.ShowMovie(mindex,movie);
	}
	public void insertMovie() {
		
		Movie m=view.InsertMovie();
		movie[mindex++] =m;
		view.Alba();
	}
	
	public void UpdateMovie() {
		
		view.UpdateMovie(mindex,movie);
		
	}
	
	public void DeleteMovie() {
		String name=view.DeleteMovie(mindex, movie);
		int search=searchIndex(name);
		
		for(int i=search; i<mindex-1; i++) {
			movie[i]=movie[i+1];
		}
		mindex--;
		
	}
	public int searchIndex(String name) {
		
		for(int i=0; i<movie.length; i++) {
			if(movie[i].getMovieName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
