package fr.campusacademy.oopcourse.highschoolproject.model;

public class Person {

	protected String name;
	protected int age;
	protected char gender;
	
	public Person() {
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
