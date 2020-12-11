package fr.campusacademy.oopcourse.abstraction.Laucher;

import fr.campusacademy.oopcourse.abstraction.model.Catlike;
import fr.campusacademy.oopcourse.abstraction.model.Cat;
import fr.campusacademy.oopcourse.abstraction.model.Tiger;

public class Launcher {
	public static void main(String[] args) {
		
		Catlike catlike = new Tiger();
		catlike.hunt();
		catlike.climb();
		Catlike catlike2 = new Cat();
		catlike2.hunt();
		catlike2.climb();
		
	}

}
