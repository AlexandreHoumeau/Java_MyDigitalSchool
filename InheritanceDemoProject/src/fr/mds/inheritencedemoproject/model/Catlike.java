package fr.mds.inheritencedemoproject.model;

//Javabean
public class Catlike {
	protected String name;
	protected String color;
	protected int age;
	
	public Catlike() {
		this.name = "Unkown";
		this.age = 0;
		this.color = "Unkown";
	}
	
	public Catlike(String name) {
		this.name = name;
		this.color = "White";
		this.age = age;
	}
	
	public void hunt() {
		System.out.println("Catlike hunting for food.");
	}
	
	public Catlike(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void eat() {
		System.out.println("My catelike named " + name + " is eating !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
