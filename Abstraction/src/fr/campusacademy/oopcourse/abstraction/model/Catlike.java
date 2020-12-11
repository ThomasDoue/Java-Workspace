package fr.campusacademy.oopcourse.abstraction.model;

public class Catlike implements Animal {
	public abstract void hunt();
	
	public void climb() {
		System.out.println("Climbing lke a catlike");
	}
	
	@Override
	public void play() {
		System.out.println("");
		
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
