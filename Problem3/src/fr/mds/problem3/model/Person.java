package fr.mds.problem3.model;

public class Person {
protected String name; 
protected int age; 
protected String gender;


public Person(String name, int age, String gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}


@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}


public String getName() {
	return name;
}



public int getAge() {
	return age;
}


public String getGender() {
	return gender;
}


}
