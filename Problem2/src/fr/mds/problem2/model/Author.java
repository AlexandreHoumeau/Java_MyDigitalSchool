package fr.mds.problem2.model;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char string) {
		super();
		this.name = name;
		this.email = email;
		this.gender = string;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

}
