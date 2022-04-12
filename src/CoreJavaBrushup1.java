import java.util.ArrayList;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable and data type
		int myNum = 5;
		
		String website = "Academy";
		
		char letter = 'r';
		
		double dec = 5.99;
		
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website + " is the value stored in the website variable");
		
		// arrays: store multiple values in 1 variable
		// fixed size
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		// Dynamic array
		int[] arr2 = {1,2,4,5,6};
		
		System.out.println(arr2[2]);
		
		// for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] name = {"rahul","shetty","selenium"};
		for(int i = 0; i< name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(String s: name) {
			System.out.println(s);
		}
		
		for(int i: arr2) {
			System.out.println(i);
		}
		
		// Array list : dynamic array
		// create new object
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		
		// Remove item in arrayList , provide index
//		a.remove(1);
		
		// Get item in arrayList, provide index
		System.out.println(a.get(3));
				
	}

}
