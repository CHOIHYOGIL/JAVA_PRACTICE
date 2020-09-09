package model;


public class Guest extends Movie {
	private int id;
	private int numId;
	private int alphaId;

	// 기본 생성자
	public Guest() {
	}

	// 추가생성자
	public Guest(String movieName, String movieTime, int id, int rowId, int colId) {
		
		super(movieName, movieTime);
		// 부모클래스 Common의 속성값을 받는 것.

		this.setId(id);
		this.setNumId(numId);
		this.setAlphaId(alphaId);
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getAlphaId() {
		return alphaId;
	}

	public void setAlphaId(int alphaId) {
		this.alphaId = alphaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
