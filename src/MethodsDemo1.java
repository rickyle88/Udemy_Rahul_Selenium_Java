
public class MethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create object for class
		MethodsDemo1 d = new MethodsDemo1();
		String name = d.getData();
		
		System.out.println(name);
		
		// Create new object
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		System.out.println("Begin Static method");
		MethodsDemo2.getUserData2();
		System.out.println("End : Static method");
		
		// use static method
		getData2();
	}
	
	public String getData() {
		System.out.println("Hello world");
		return "rahul shetty";
	}
	
	// static method
	public static String getData2() {
		System.out.println("Hello world");
		return "rahul shetty";
	}

}
