package ch02;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String phone;
	private Coffee[] orders;
	
	public Customer(int id, String name, String email, String phone, Coffee[] orders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public Coffee[] getOrders() {
		return orders;
	}
	
	
}
