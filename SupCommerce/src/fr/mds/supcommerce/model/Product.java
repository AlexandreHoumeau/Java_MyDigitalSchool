package fr.mds.supcommerce.model;

public class Product {
	private long id;
	private String name;
	private String descrption;
	private float price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String descrption, float price) {
		this.name = name;
		this.descrption = descrption;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
