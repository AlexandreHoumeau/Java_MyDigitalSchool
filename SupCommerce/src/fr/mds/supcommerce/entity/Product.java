package fr.mds.supcommerce.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {
	

	private long id; 
	private String name;
	
	public Product() {
		return; 
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
	
	
}
