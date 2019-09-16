package fr.mds.helloworldproject;

public class Character {

	String name;
	int height;
	boolean isAlive;

	void move() {
		if (!isAlive) {
			System.out.println(this.name + " can't move ! He's dead !");
			return;
		} else {
			System.out.println(this.name + " is moving !");
		}

	}

	void eat() {
		System.out.println("My current character is eating !");
	}

}
