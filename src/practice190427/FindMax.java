package practice190427;

public class FindMax {

	private static int[] arr = {1, 2, 464, 2, 141 ,657};
 	
	public static void main(String[] args) {
		System.out.println(recursive(arr, arr.length));
	}
	
	private static int recursive(int[] arr, int n) {
		
		if(n == 0) {
			return arr[0];
		}
		else {
			return Math.max(arr[n - 1], recursive(arr, n - 1));
		}
		
	}

}
