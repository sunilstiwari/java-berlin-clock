package com.ubs.opsit.interviews;

public enum LampBulbColor {

	// Two colors asked in requirement. More colors can be added here if needed in future.
	
	RED    ("R"), // Lit on with Red color
	YELLOW ("Y"), // Lit on with Yellow color
	OFF    ("O"); // Lit off
	
	private String color;
	
	LampBulbColor(String color){
		this.color = color;
	}
	
	public String toString(){
		return color;
	}
}