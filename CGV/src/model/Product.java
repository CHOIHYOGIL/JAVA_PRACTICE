package model;

public class Product {
	
	private int price;	
	private int amount;
	private String name;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product (String name, int price, int amount) {
		super();
		this.price = price;
		this.amount = amount;
		this.name = name;
	}

	
	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
