package fr.campusacademy.oopcourse.model;

public class Smartphone {
	String modelName;
	int autonomy;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String modelName, int autonomy) {
		this.modelName = modelName;
		this.autonomy = autonomy;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getAutonomy() {
		return autonomy;
	}

	public void setAutonomy(int autonomy) {
		this.autonomy = autonomy;
	}

	@Override
	public String toString() {
		return "Smartphone [modelName=" + modelName + ", autonomy=" + autonomy + "]";
	}
	
	

}
