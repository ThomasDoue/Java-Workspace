package fr.campusacademy.oopcourse.Démo6.model;

import fr.campusacademy.oopcourse.Démo6.model.GPU;
import fr.campusacademy.oopcourse.Démo6.model.Computer;

public class Launcher {

	public static void main(String[] args) {
		
		GPU myGPU = new GPU("RTX3080", "Nvidia", 8);
		Computer myPC = new Computer(2000, myGPU);
		
		Computer mySecondPC = new Computer(2600, new GPU("RTX3060", "Nvidia",6));
		
		System.out.println(mySecondPC.getPrice());
		System.out.println(mySecondPC.getGpu().getModel());
		System.out.println(mySecondPC.getGpu().getBrand());
		System.out.println(mySecondPC.getGpu().getNbOfCores());
		
		System.out.println(myPC);
		
	}

}
