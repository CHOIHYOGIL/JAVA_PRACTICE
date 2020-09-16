package Java_TextBook;


class Phone1{
	
	public Phone1(String name, String phone) {
		super();
		this.phone = phone;
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String phone;
	private String name;
}

