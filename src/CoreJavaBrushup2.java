
public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		
		//Print even number
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
			}else {
				System.out.println(arr2[i] + " is not even number");
			}
		}

	}

}
