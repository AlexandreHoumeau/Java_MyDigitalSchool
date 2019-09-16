package fr.mds.inheritencedemoproject.launcher;

import fr.mds.inheritencedemoproject.model.Cat;
import fr.mds.inheritencedemoproject.model.Catlike;
import fr.mds.inheritencedemoproject.model.tiger;

public class Launcher {
	public static void main(String[] args) {

		Catlike catlike = new Catlike("Bob");
		//catlike.setName("Bob");
		catlike.eat();
		
		Catlike catlike2 = new Catlike("Rob", "Yellow", 10);
		catlike2.eat();
		
		tiger Tiger = new tiger();
		Tiger.setName("Tigrou");
		Tiger.setAge(10);
		Tiger.setColor("Orange");
		Tiger.eat();
		
		Cat cat = new Cat();
		cat.setName("GrosMinet");
		cat.setAge(100);
		cat.setColor("Grey");
		cat.canBePet();
	}
}
