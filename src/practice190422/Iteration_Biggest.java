package practice190422;

public class Iteration_Biggest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 3, 543, 43, 52345234, 43, 5234, 52435, 3425, 57, 5754, 64, 56456234};
		
		findBiggest(arr);
		
	}
	
	static void findBiggest(int[] arr) {
		
		int largest_number = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest_number) {
				largest_number = arr[i];
			}
		}
		
		System.out.println(largest_number);
		
	}

}
