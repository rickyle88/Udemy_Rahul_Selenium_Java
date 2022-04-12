package oop1;

public abstract class ParentAirCraft {
	
	// Method with body => not an abstract class
	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow Engine Guidelines");
	}
	
	// Mandatory for child class to implement this abstract class
	public abstract void bodyColor();
}
