package fr.campusacademy.oopcourse.tp3polyphormism.launcher;

import fr.campusacademy.oopcourse.tp3polyphormism.model.Rectangle;
import fr.campusacademy.oopcourse.tp3polyphormism.model.Shape;
import fr.campusacademy.oopcourse.tp3polyphormism.model.Triangle;

public class Launcher {
	
	public static void main(String[] args) {
		
		Shape shape1 = new Rectangle("Red", 3.0, 4.0);
		System.out.println(shape1 );
		System.out.println("Area is ");
		shape1.getArea();
		
		System.out.println("");
		
		Shape shape2 = new Triangle("Green", 5.0, 7.0);
		System.out.println(shape2);
		System.out.println("Area is" );
		shape2.getArea();
		
		System.out.println("");
	}

}
