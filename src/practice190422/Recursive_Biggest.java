package practice190422;

public class Recursive_Biggest {

	static int largest_number = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 3, 543, 43, 52345234, 43, 5234, 52435, 3425, 57, 5754, 64, 56456234};

		findBiggest(arr, arr.length-1);
	}
	
	static void findBiggest(int[] arr, int n) {
		
		//base condition
		if(n == 0) {
			System.out.println(largest_number);
			return;
		}
		//operation
		else {
			
			if(arr[n] > largest_number) {
				largest_number = arr[n];
			}	
			findBiggest(arr, n-1);
		}
		
	}

}
