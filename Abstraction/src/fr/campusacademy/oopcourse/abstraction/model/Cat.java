package fr.campusacademy.oopcourse.abstraction.model;

public class Cat extends Catlike{

	@Override
	public void hunt() {
		System.out.println("Miaou, hunting like a cat")
	}
	
	@Override
	public void climb() {
		System.out.println("I AM CLIMBING LIKE A CAT");
	}

}