package practice190424;

public class Biggest_Iteration {

	private static int[] arr = {1, 34, 56, 76, 23, 543, 545, 12, 7};
	
	public static void main(String[] args) {
		
		findTheBiggest(arr);
		
	}
	
	private static void findTheBiggest(int[] arr) {
		
		int max_value = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max_value) {
				max_value = arr[i];
			}
		}
		
		System.out.println("가장 큰 수: " + max_value);
		
	}

}
