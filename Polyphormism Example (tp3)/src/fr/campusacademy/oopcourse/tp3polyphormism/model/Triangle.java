package fr.campusacademy.oopcourse.tp3polyphormism.model;

public class Triangle extends Shape {
	
	private double base;
	private double height;
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
		
	}
	@Override
	public void getArea() {
		
		System.out.println(0.5*base*height);
	}
	

}
