package corejava;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <=4; i++) // this block will loop for 4 times
		{ 
			System.out.println("Outer loop started");
			for(int j=1; j<=4; j++) 
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
		
		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10
		
		int sum = 1;
		for(int i = 0; i <=4; i++) // this block will loop for 4 times
		{ 
//			System.out.println(i);
			for(int j=1; j<=4-i; j++) 
			{
				System.out.print(sum + "\t");
				sum++;
			}
			System.out.println("");
//			System.out.println("Outer loop finished");
		}

	}

}
