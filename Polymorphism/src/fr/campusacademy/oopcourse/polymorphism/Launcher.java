package fr.campusacademy.oopcourse.polymorphism;

import fr.campusacademy.oopcourse.polymorphism.model.f�lin;
import fr.campusacademy.oopcourse.polymorphism.model.tigre;
import fr.campusacademy.oopcourse.polymorphism.model.chat;


public class Launcher {
	
	public static void main(String[] args) {
		
		f�lin f�lin = new f�lin();
		chat chat = new chat();
		tigre tigre = new tigre();
		
		
		f�lin f�lin2 = new tigre();
		f�lin f�lin3 = new chat();
		
		f�lin[] f�linarray = new f�lin[3];
		f�linarray[0] = new chat();
		f�linarray[1] = new tigre();
		f�linarray[2] = new f�lin();
		
		f�lin f�lin4 = new chat();
		f�lin4.sleep();
		
		chat myChat = (chat) f�lin4;
		myChat.eatCatFood();
		
		Object myObject = new chat();
		
		if (myObject instanceof chat) {
			System.out.println("This is a Cat !!!!!")
			chat myChat2 = (chat) myObject;
			myChat2.eatCatFood();
			}else if
		
				

	}

}
