package ch02;

public class CoffeeShop {
	private int id;
	private String name;
	private String location;
	
	public CoffeeShop(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "CoffeeShop [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
