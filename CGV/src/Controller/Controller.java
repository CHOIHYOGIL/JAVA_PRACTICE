package Controller;

import View.CgvView;
import model.Movie;

public class Controller {
	
	CgvView view;
	
	Movie [] movie;
	int index=0;
		public Controller() {
			movie=new Movie[10];
			view=new CgvView();
		}
	
	public void main() {
		
		while(true) {
			int sel=view.Welcome();
			
			switch(sel) {
			
			case 1:
				int sel1=view.Alba();
				AlbaChoice(sel1);
				break;
			case 2:
				break;
			case 0:
				break;
			default:
				System.out.println("잘못입력했습니다");
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
			//ShowThings();
			break;
		case 6:
			//insertThing();
			break;
		case 7:
			//UpdateThing();
			break;
		case 8:
			//DeleteThing();
			break;
		case 0:
			main();
			break;
		}
		
	}
	public	void ShowMovie() {
		
		view.ShowMovie(index,movie);
	}
	public void insertMovie() {
		
		Movie m=view.InsertMovie();
		movie[index++] =m;
		view.Alba();
	}
	
	public void UpdateMovie() {
		
		view.UpdateMovie(index,movie);
		
	}
	
	public void DeleteMovie() {
		String name=view.DeleteMovie(index, movie);
		int search=searchIndex(name);
		
		for(int i=search; i<index-1; i++) {
			movie[i]=movie[i+1];
		}
		index--;
		
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
