package model;

public class Movie {
	private String movieName;
	private String movieTime;
	private boolean[][] selectedChair = new boolean[10][10];
	
	//기본생성자
	public Movie() {
		
	}

	// 추가생성자
	public Movie(String movieName, String movieTime) {
		this.movieName = movieName;
		this.movieTime = movieTime;
	}
		
	
	//getter(출력)
	public String getMovieName() {
		return movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public boolean getSelectedChair(int alpha, int num) {
		return selectedChair[alpha][num];
	}
	
	//setter(입력)
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public void setSelectedChair(int i, int j, boolean bool) {
		this.selectedChair[i][j] = bool;
	}
}
