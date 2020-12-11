package fr.campusacademy.oopcourse.highschoolproject.model;

public class CollegeStudent extends Student {
	
	private int year;
	private String major;
	
	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollegeStudent(String name, int age, char gender, String studentID, double gradePointAverage, int year, String major) {
		super(name, age, gender, studentID, gradePointAverage);
		this.year = year;
		this.major = major;

	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "CollegeStudent [year=" + year + ", major=" + major + "]";
	}
	
	

}
