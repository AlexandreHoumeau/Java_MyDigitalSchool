package fr.mds.inheritencedemoproject.model;

public class Cat extends Catlike {
	
	public void canBePet() {
		System.out.println(super.name + " allows you to pet him");
	}
	
	@Override
	public void hunt() {
		System.out.println("Cat is hunting for fun !");
	}
}
