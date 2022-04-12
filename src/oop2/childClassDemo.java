package oop2;

// inherit methods from parent class (abstract class)
public class childClassDemo extends parentClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClassDemo c = new childClassDemo();
		c.color();
		c.brakes();
		c.audiosystem();

	}
	
	public void engine() {
		System.out.println("New world");
	}
	
	public void color() {
		System.out.println(colour);
	}
	
	//override : child method has same name same parameter
	public void audiosystem() {
		System.out.println("child audio system");
	}


}
