package kh.mart.model.vo;

import java.util.Date;

public class order_Cart {
	private int num;
	private String person;
	private Date date;
	private int sum;
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public order_Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public order_Cart(int num, String person, Date date, int sum,String name) {
		super();
		this.num = num;
		this.person = person;
		this.date = date;
		this.sum = sum;
		this.name=name;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

	
}
