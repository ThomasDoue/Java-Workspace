package fr.campusacademy.oopcourse.polymorphism;

import fr.campusacademy.oopcourse.polymorphism.model.félin;
import fr.campusacademy.oopcourse.polymorphism.model.tigre;
import fr.campusacademy.oopcourse.polymorphism.model.chat;


public class Launcher {
	
	public static void main(String[] args) {
		
		félin félin = new félin();
		chat chat = new chat();
		tigre tigre = new tigre();
		
		
		félin félin2 = new tigre();
		félin félin3 = new chat();
		
		félin[] félinarray = new félin[3];
		félinarray[0] = new chat();
		félinarray[1] = new tigre();
		félinarray[2] = new félin();
		
		félin félin4 = new chat();
		félin4.sleep();
		
		chat myChat = (chat) félin4;
		myChat.eatCatFood();
		
		Object myObject = new chat();
		
		if (myObject instanceof chat) {
			System.out.println("This is a Cat !!!!!")
			chat myChat2 = (chat) myObject;
			myChat2.eatCatFood();
			}else if
		
				

	}

}
