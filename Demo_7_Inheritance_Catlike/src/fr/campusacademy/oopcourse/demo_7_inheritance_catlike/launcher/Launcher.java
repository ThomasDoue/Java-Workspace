package fr.campusacademy.oopcourse.demo_7_inheritance_catlike.launcher;

import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.Cat;
import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.Catlike;
import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.Tiger;

public class Launcher {

	
	public static void main(String[] args) {
		
		
		Catlike catlike = new Catlike("Bob", "Black", 100.0f);
		System.out.println(catlike);
		
		
		Tiger tiger = new Tiger();
		tiger.setName("Tigrou");
		tiger.setColor("Yellow");
		tiger.setWeight(45.5f);
		System.out.println(tiger);
	
		Cat cat = new Cat();
		cat.setName("Sombrero");
		cat.setColor("Grey");
		cat.setWeight(4.4f);
		System.out.println(cat);
		
		Tiger tiger2 = new Tiger("Robert", "Brown", 98.2f);
		
		Cat cat2 = new Cat("Pompom", "White", 3.2f);
	
		catlike.cleanItSelf();
		tiger.cleanItSelf();
		cat.cleanItSelf();
		tiger2.cleanItSelf();
		cat2.cleanItSelf();
	
	
	}
	
}
