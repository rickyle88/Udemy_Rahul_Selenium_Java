package corejava;

public class nestedloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 1;
		for(int i = 0; i <4; i++) // this block will loop for 4 times
		{ 
//			System.out.println(i);
			for(int j=4; j>=4-i; j--) 
			{
				System.out.print(sum + "\t");
				sum++;
			}
			System.out.println("");
//			System.out.println("Outer loop finished");
		}
	}

}

// 1
// 2 3
// 4 5 6
// 7 8 9 10