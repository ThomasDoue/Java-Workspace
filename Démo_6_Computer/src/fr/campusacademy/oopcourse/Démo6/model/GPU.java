package fr.campusacademy.oopcourse.Démo6.model;

public class GPU {
	
	private String model;
	private String brand;
	private int nbOfCores;
	
	public GPU() {
	}
	
	public GPU(String model, String brand, int nbOfCores) {
		this.model = model;
		this.brand = brand;
		this.nbOfCores = nbOfCores;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNbOfCores() {
		return nbOfCores;
	}

	public void setNbOfCores(int nbOfCores) {
		this.nbOfCores = nbOfCores;
	}
	
	@Override
	public String toString() {
		return "This is my GPU informations : " + this.brand + this.model + this.nbOfCores;
		
	}
	
}
