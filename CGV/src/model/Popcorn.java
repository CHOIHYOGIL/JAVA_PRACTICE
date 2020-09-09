package model;

public class Popcorn extends Product{
	
	private String taste;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Popcorn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Popcorn(String name, int amount, int price, String taste) {
		super(name,amount,price);
		this.taste = taste;
	}
	
	

}
