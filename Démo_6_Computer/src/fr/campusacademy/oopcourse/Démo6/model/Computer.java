package fr.campusacademy.oopcourse.Démo6.model;

public class Computer {
	
	private double price;
	private GPU gpu;
	
	
	public Computer() {
	}

	public Computer(double price, GPU gpu) {
		this.price = price;
		this.gpu = gpu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GPU getGpu() {
		return gpu;
	}

	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}
	
	@Override
	public String toString() {
		System.out.println(" ");
		return "This is my computer price : " + this.price + this.gpu; 
		
		
	}
}
