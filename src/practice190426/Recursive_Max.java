package practice190426;

public class Recursive_Max {

	private static int[] arr ={1, 5, 34, 76, 24, 15, 8};
	
	private static int[] ex_arr = {1, 2};
	
	public static void main(String[] args) {

		int max = Math.max(ex_arr[0], ex_arr[1]);
		System.out.println(ex_arr[0]);
		
	}
	
	private static int findMax(int[] arr, int n) {
		
		if(n == 0) {
			return arr[0];
		}
		else {
			return Math.max(arr[n - 1], findMax(arr, n - 1));
		}
		
		
	}
	
}
