package fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model;

public class Catlike {

	private String name;
	private String color;
	private float weight;
	
	public Catlike() {
	}
	
	public Catlike(String name, String color, float weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public void cleanItSelf() {
		System.out.println("My catlike " + this.name + "is cleaning itself");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Catlike [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
}
