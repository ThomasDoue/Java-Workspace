package fr.campusacademy.oopcourse.highschoolproject.model;

public class Student extends Person {

	protected String studentID;
	protected double gradePointAverage;
	
	public Student() {
	}

	public Student(String name, int age, char gender, String studentID, double gradePointAverage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.gradePointAverage = gradePointAverage;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public double getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", gradePointAverage=" + gradePointAverage + "]";
	}
	
	
	
}
