package kh.mart.model.vo;

public class Customer {
	
	
	private int num;
	private String id;
	private String phone;
	private String grade;
	private String address;
	private int point;
	private String pW;
	
	public Customer(int num, String id, String phone, String grade, String address, int point, String pW) {
		super();
		this.num = num;
		this.id = id;
		this.phone = phone;
		this.grade = grade;
		this.address = address;
		this.point = point;
		this.pW = pW;
	}

	public String getPw() {
		return pW;
	}

	public void setPw(String pW) {
		this.pW = pW;
	}

	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
