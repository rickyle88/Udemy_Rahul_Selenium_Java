package oop1;

public class ChildEmirities extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirities c = new ChildEmirities();
		c.safetyGuidelines();
		c.bodyColor();
	}

	// When child class inherit from parent class, all abstract classes should be implemented
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
