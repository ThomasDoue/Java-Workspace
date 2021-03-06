package fr.campusacademy.oopcourse.tp3polyphormism.model;

public abstract class Shape {
	
	protected String color;
	
	public Shape(String color) {
		
		this.color = color;
	}
	
	public abstract void getArea();
	
	@Override
	public String toString() {
		return "Shape color; " + color;
	}

}
