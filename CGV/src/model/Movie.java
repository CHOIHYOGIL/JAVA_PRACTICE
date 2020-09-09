package model;

public class Movie {
	private String movieName;
	private String movieTime;
	private boolean[][] selectedChair = new boolean[10][10];
	
	//�⺻������
	public Movie() {
		
	}

	// �߰�������
	public Movie(String movieName, String movieTime) {
		this.movieName = movieName;
		this.movieTime = movieTime;
	}
		
	
	//getter(���)
	public String getMovieName() {
		return movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public boolean getSelectedChair(int alpha, int num) {
		return selectedChair[alpha][num];
	}
	
	//setter(�Է�)
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
