package fr.mds.problem3.launcher;

import fr.mds.problem3.model.Person;

public class Launcher {
	public static void main(String[] args) {
		Person person1 = new Person("Alex", 23,"Male");
		System.out.println(person1.getName());
		
		Student student1 = new Student("Georges", 400, "GeOrGeS400",3.45);
	}
	
}
