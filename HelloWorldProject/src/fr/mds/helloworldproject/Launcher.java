package fr.mds.helloworldproject;

public class Launcher {

	// entry point
	public static void main(String[] args) {
		Character myFirstChar = new Character();
		myFirstChar.height = 220;
		myFirstChar.isAlive = true;
		myFirstChar.name = "Bob";

		Character mySecondChar = new Character();
		mySecondChar.height = 175;
		mySecondChar.isAlive = false;
		mySecondChar.name = "Rob";

		System.out.println(myFirstChar.name);
		System.out.println(mySecondChar.name);

		myFirstChar.move();
		mySecondChar.move();

		// PRIMITIF
		int myOriginalInt = 10;
		System.out.println("Before = " + myOriginalInt);

		changeMyInt(myOriginalInt);
		System.out.println("After = " + myOriginalInt);

		// OBJECT
		Character character = new Character();
		character.name = "Job";
		System.out.println("Before = " + character.name);
		changeMyName(character);
		System.out.println("After = " + character.name);

		// CHANGE MY INT
		int mySecondInt = 12;
		System.out.println("Before = " + mySecondInt);
		mySecondInt = changeMySecondInt(mySecondInt);
		System.out.println("After = " + mySecondInt);
	}

	static void changeMyName(Character character) {
		character.name = "Anatole";
	}

	static void changeMyInt(int myInt) {
		myInt = 0;
	}

	static int changeMySecondInt(int myInt) {
		return myInt * 2;
	}
}
