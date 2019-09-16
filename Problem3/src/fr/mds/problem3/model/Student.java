package fr.mds.problem3.model;

class Student extends Person {
	protected String studentId;
	protected double gradePointAverage;
	
	public Student(String name, int age, String gender,String studentId,double gradePointAverage ) {
		super(name, age, gender);
		this.studentId = studentId; 
		this.gradePointAverage = gradePointAverage;
	}
}
