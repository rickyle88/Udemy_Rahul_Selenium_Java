
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is an object represent sequent of characters
		
		
		String s1 = "Rahul Shetty Academy";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		// Loop through a string
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
		// Loop through a string in a reverse order
		for(int i = s.length() - 1; i>0 ; i--) {
			System.out.println(s.charAt(i));
			
		}
		
		// array stores splitted string
		String[] splittedString = s.split(" ");
		// Rahul Shetty Academy
		
		String[] splittedString1 = s.split("Shetty");
		// Rahul 
		//  Academy
		
		// Loop though an array
		for(int i = 0; i<splittedString1.length; i++) {
			System.out.println(splittedString1[i]);
			
		}
		
		System.out.println(splittedString1[0].trim());
		System.out.println(splittedString1[1].trim());
		
		System.out.println("---------------------------------");
		System.out.println("Loop through a string in a reverse order");
		// Loop through a string in a reverse order
				for(int i = s.length() - 1; i>=0 ; i--) {
					System.out.println(s.charAt(i));
					
				}
		
	}

}
