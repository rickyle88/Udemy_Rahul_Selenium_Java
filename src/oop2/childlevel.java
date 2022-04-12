package oop2;

public class childlevel extends childClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childlevel c1 = new childlevel();
		c1.getData(2);
		c1.getData("hello");

	}
	
	
	// overloading
		public void getData(int a) {
			System.out.println(a);
		}
		
		public void getData(String a) {
			System.out.println(a);
		}

}
