package corejava2;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 4;
		
		// array: a container which stores multiple value of same data type
		int a[] = new int[5];
		

		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int b[] = {1,4,3,5,7,8};
		
		//2 dimensional array
		// a[row][column]
		int aa[][] = new int[2][3];
		aa[0][0] = 2;
		aa[0][1] = 4;
		aa[0][2] = 5;
		aa[1][0] = 3;
		aa[1][1] = 4;
		aa[1][2] = 7;
		
		System.out.println(aa[1][0]);
		
		int bb[][] = {{2,4,5},{3,4,7}};
		
		System.out.println("2 dimensional array");
		for(int i = 0; i < 2; i++) {	// row
			for(int j = 0; j < 3; j++) { 	//column
				System.out.println(aa[i][j]);
			}
		}
		
	}

}
