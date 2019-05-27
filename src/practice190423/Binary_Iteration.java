package practice190423;

public class Binary_Iteration {

	private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		
		binary(arr, 11);
		
	}
	
	private static int binary(int[] arr, int findNumber) {
		
		int first = 0;
		int last = arr.length;
		int middle = (first + last) / 2;
		
		while(first < last) {
			
			if(arr[middle] > findNumber) {
				last -= 1;
			}
			else if(arr[middle] < findNumber) {
				first += 1;
			} 
			else {
				System.out.println("숫자가 존재합니다.");
				return 1;
			}
			
			middle = (first + last) / 2;

		}
		
		System.out.println("숫자가 존재하지 않습니다.");
		return -1;
		
	}

}
